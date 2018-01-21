package com.oreilly.servlet;
import java.io.*;
import java.net.*;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.until.*;
import javax.servlet.*;
import javax.servlet.http.*;
public abstract class RemoteDaemonHttpServlet extends DaemonHttpServlet
implements Remote {
public void destroy() {
super.destroy();
unbind();
}