import java.rmi.*;
import java.rmi.server.*;

public class implEqSolve extends UnicastRemoteObject implements intfEqSolve 
{ 
public implEqSolve()throws RemoteException{}

public int solveEq1(int a, int b)throws RemoteException

{
 int ans=(a*a)-(2*a*b)+(b*b); return ans;

}

public int solveEq2(int a,int b)throws RemoteException

{
 int ans=(a*a)+(2*a*b)+(b*b);
 
return ans;

}

public int solveEq3(int a,int b)throws RemoteException

{ int ans=(a*a*a)-(3*a*a*b)+(3*a*b*b)-(b*b*b); return ans ;

}

public int solveEq4(int a,int b)throws RemoteException

{ int ans=(a*a*a)+(3*a*a*b)+(3*a*b*b)+(b*b*b); return ans;

} }
