import java.rmi.*;
public interface intfEqSolve extends Remote

{
 public int solveEq1(int a,int b)throws RemoteException;
 public int solveEq2(int a,int b)throws RemoteException;
 public int solveEq3(int a,int b)throws RemoteException;
 public int solveEq4(int a,int b)throws RemoteException;

}
