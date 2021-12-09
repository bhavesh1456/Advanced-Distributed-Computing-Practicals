import java.rmi.*;
public interface DateIntf extends Remote
{
public String getDate() throws RemoteException;
public String getTime() throws RemoteException;
}