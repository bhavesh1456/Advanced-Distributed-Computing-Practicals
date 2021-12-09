import java.io.*;

import java.net.*;

import java.rmi.*;

public class serverEqSolve {

public static void main(String[]args)

{ try

{

implEqSolve obj=new implEqSolve(); 
Naming.rebind("hello",obj);

}

catch(Exception e)

{

System.out.println(e);

}}}

