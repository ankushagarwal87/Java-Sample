/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package jdbc;

import java.sql.*;
import java.util.*;
class Main
{
public static void main(String asd[])
{
try
{
    String t1="5";
String t2="aha";
String t3="ghkj";
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection c=DriverManager.getConnection("jdbc:odbc:mydsn");
Statement s=c.createStatement();
int x=s.executeUpdate("insert into Table1 values('"+t1+"','"+t2+"','"+t3+"')");
ResultSet r=s.executeQuery("select * from Table1");
while(r.next())
{
System.out.println(r.getString(1));
System.out.println(r.getString(2));
}
}
catch(SQLException e)
{
e.printStackTrace();
}
catch(Exception e)
{
}
}
}