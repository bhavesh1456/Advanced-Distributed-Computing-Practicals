import java.rmi.*;
public class DateClient
{
public static void main(String[] args)
{
try
{
DateIntf obj=(DateIntf)Naming.lookup("rmi://localhost:2099/dt");
System.out.println("Date is : "+obj.getDate());
System.out.println("Time is : "+obj.getTime());
}
catch(Exception e) { }
}
}