package JDBC;
import java.rmi.*;
public interface DatabaseInt extends Remote {
public String getData(String s,String db) throws RemoteException;
}