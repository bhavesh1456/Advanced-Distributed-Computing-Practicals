import java.rmi.*;
import java.rmi.registry.*;
public class Register
{
public static void main(String[] args)
{
try {
Registry reg=LocateRegistry.createRegistry(2099);
DateServer obj=new DateServer();
Naming.rebind("rmi://localhost:2099/dt",obj);
}
catch(Exception e) { }
}
}