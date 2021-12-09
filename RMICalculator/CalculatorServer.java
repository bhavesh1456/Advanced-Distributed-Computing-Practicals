import java.net.*; 
import java.rmi.*; 

public class CalculatorServer 
{ 
public static void main(String[] args) 
{ 
try 
{ 
CalculatorImpl ci=new CalculatorImpl(); 
Naming.rebind("CalculatorServer",ci); 
System.out.println("Calculator Server is Ready"); 
} 
catch(Exception e) 
{ 
e.printStackTrace(); 
} 
} 
}
