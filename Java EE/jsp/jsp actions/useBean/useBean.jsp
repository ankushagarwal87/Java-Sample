/*
<jsp:param name="name" value="ankush" />
<jsp:param name="pass" value="sonu"/>

<%String name=request.getParameter("name");
String pass=request.getParameter("pass"); %>
*/
<jsp:useBean id="t1" class="my.MyBean"/>
<jsp:setProrety name="t1" property="name" value="ankush"/>
<jsp:setProperty name="t1" property="pass" value="sonu"/>
<% String s=t1.validate();
int r=t1.add(18,56);
out.println(s+" "+r); %>
<JSP:getProperty name="t1" property="name"/>
<JSP:getProperty name="t1" property="pass"/>
