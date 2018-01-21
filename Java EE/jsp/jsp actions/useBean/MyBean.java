package my;

public class MyBean
{
private String name,pass;
public String getName()
{
return name;
}

public String getPass()
{
return pass;
}

public void setName(String name)
{
this.name=name;
}

public void setPass(String pass)
{
this.pass=pass;
}

public String validate()
{
if(name.equals("ankush") && pass.equals("sonu"))
return "valid";
else 
return "invalid";
}
public int add(int a,int b)
{
return(a+b);
}
}