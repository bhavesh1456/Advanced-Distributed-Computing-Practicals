import java.rmi.*; 
import java.rmi.server.*; 

public class CalculatorImpl extends UnicastRemoteObject implements 

ICalculator 
{ 
public CalculatorImpl() throws RemoteException 
{ 
} 
public double add(double x,double y) throws RemoteException 
{ 
return(x+y); 
} 
public double sub(double x,double y) throws RemoteException 
{ 
return(x-y); 
} 
public double mul(double x,double y) throws RemoteException 
{
return(x*y); 
} 
public double div(double x,double y) throws RemoteException 
{ 
return(x/y); 
} 
}
