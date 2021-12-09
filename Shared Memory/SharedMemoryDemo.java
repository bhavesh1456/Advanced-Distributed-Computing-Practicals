import java.io.*;
import java.net.*;
import java.util.*;
public class SharedMemoryDemo
{
static int a=50;
static int count=0;
public static int getA(PrintStream cout)
{
count++;
cout.println(a);
return a;
}
public void setA(int a)
{
this.a = a;
}
public static void main(String[] args) throws Exception
{
ServerSocket ss=new ServerSocket(2000);
while ( true )
{
Socket sk=ss.accept();
BufferedReader cin = new BufferedReader(new InputStreamReader(sk.getInputStream()));
PrintStream cout=new PrintStream(sk.getOutputStream());
System.out.println("Client from "+sk.getInetAddress().getHostAddress()+" accepted");
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
String s=cin.readLine();
Scanner sc=new Scanner(s);
String op=sc.next();
if (op.equalsIgnoreCase("show"))
{
getA(cout);
}
else
{
cout.println("Check Syntax");
break;
}
System.out.println("Count : " +count);
}
} }