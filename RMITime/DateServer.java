import java.rmi.*;
import java.util.*;
import java.text.*;
import java.rmi.server.*;
public class DateServer extends UnicastRemoteObject implements DateIntf
{
DateServer() throws RemoteException
{
super();
}
public String getDate() throws RemoteException
{
return new SimpleDateFormat("dd/MM/yyyy").format(new Date()).toString();
}
public String getTime() throws RemoteException
{
return new SimpleDateFormat("hh:mm:ss").format(new Date()).toString();
}
}