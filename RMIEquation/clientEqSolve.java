import java.io.*;
 
import java.net.*;

import java.rmi.*;

public class clientEqSolve 
{ 
public static void main(String[]args)

{
 try

{

int num1, num2, res=0, choice;

intfEqSolve object=(intfEqSolve)Naming.lookup("hello");

BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); System.out.println("Equations:-");

System.out.println("1.(a-b)2"); System.out.println("2.(a+b)2"); System.out.println("3.(a-b)3"); System.out.println("4.(a+b)3"); System.out.println("Choose the equation:"); choice=Integer.parseInt(br.readLine()); System.out.println("Enter the value of a and b"); num1=Integer.parseInt(br.readLine()); num2=Integer.parseInt(br.readLine()); switch(choice)

{ case 1:

res=object.solveEq1(num1,num2);

break;

case 2:

res=object.solveEq2(num1,num2);

break;

case 3:

res=object.solveEq3(num1,num2);
 
break;

case 4:

res=object.solveEq4(num1,num2);

break;

default:

System.out.println("Invalid option");

break;

}

System.out.println("the answer is"+res);

}

catch(Exception e)

{

System.out.println("Exception:"+e);

} } }
