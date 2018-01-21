package com.oreilly.servlet;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public abstract class DaemonHttpServlet extends HttpServlet {
protected int DEFAULT-PORT = 1313; // not static or final
private Thread daemonThread;
public void init(ServletConfig config) throws ServletException {
super.init(config) ;
// Start a daemon thread
try {
daemonThread = new Daemon(this) ;
daemonThread.start() ;
}
catch (Exception e) {
getServletContext() .log(e, “Problem starting socket server daemon thread”) ;
}
}
// Returns the socket port on which this servlet will listen.
// A servlet can specify the port in three ways: by using the socketPort
// init parameter, by setting the DEFAULT-PORT variable before calling
// super.init(), or by overriding this method's implementation
protected int getSocketPort() {
try { return Integer.parseInt(getInitParameter(“socketPort”)); }
catch (NumberFormatException e) { return DEFAULT-PORT; }
}
abstract public void handleClient(Socket client);
public void destroy() {
// Stop the daemon thread
try {
daemonThread.stop () ;
daemonThread = null;
}
catch (Exception e) {
getServletContext() .log(e, “Problem stopping server socket daemon thread”) ;
}
}
}
// This work is broken into a helper class so that subclasses of
// DaemonHttpServlet can define their own run() method without problems.
class Daemon extends Thread {
private ServerSocket serverSocket;
private DaemonHttpServlet servlet;
public Daemon(DaemonHttpServlet servlet) {
this.servlet = servlet;
}
public void run() {
try {
// Create a server socket to accept connections
serverSocket = new ServerSocket(servlet.getSocketPort()) ;
}
catch (Exception e) {
servlet.getServletContext() .log(e, “Problem establishing server socket”) ;
return;
}
try {
while (true) {
// As each connection comes in, call the servlet's handleClient () .
// Note this method is blocking. It's the servlet's responsibility
// to spawn a handler thread for long-running connections.
try {
servlet.handleClient(serverSocket.accept()) ;
}
catch (IOException ioe) {
servlet.getServletContext()
.log(ioe, “Problem accepting client's socket connection") ;
}
}
}
catch (ThreadDeath e) {
// When the thread is killed, close the server socket
try {
serverSocket.close() ;
}
catch (IOException ioe) {
servlet.getServletContext() .log(ioe, “Problem closing server socket”);
}
}
}
}