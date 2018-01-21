<html>
<body>
<% String s=request.getParameter("Image"); %>
<% out.println(s); %>
<img src=s width=300 height=300>
</body>
</html>