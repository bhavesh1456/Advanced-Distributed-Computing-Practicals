package JDBC;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class DBServer {
public static void main(String[] args)throws RemoteException{
try{
Registry reg = LocateRegistry.createRegistry(9999);
DatabaseImpletation dbi =new DatabaseImpletation();
reg.rebind("dbServer",dbi);
System.out.println("Server Registered.");
}catch (RemoteException e1){
System.out.print(e1);
}
}
}