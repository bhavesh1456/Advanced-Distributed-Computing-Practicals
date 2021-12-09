package JDBC;
import java.io.*;
import java.rmi.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
public class DBClient {
public static void main(String []args)throws RemoteException{
String db="",sql="",ch="",ch1="",res="";
try{
Registry reg = LocateRegistry.getRegistry("LocalHost",9999);
DatabaseInt obj = (DatabaseInt)reg.lookup("dbServer");
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true){
System.out.println("Select an Option");
System.out.println("1:Retrieve College Information");
System.out.println("2:Retrieve MTNL Billing Informatin");
System.out.println("3:Exit");
System.out.println("Enter your Choice");
ch=br.readLine();
if (ch.equals("1")){
db="orcl";
System.out.println("Select an Option");
System.out.println("a:Retrieve Student Information");
System.out.println("b:Retrieve MTNL Billing Informatin");
System.out.println("Enter your Choice:");
ch1=br.readLine();
if(ch1.equals("a")){
sql="select * from Student";
}else if(ch1.equals("b")){
sql="select * from BILL";
}else{
System.out.println("Please select an option");
}}else if(ch.equals("2")){
db="orcl";
sql="Select * from BILL";
}else if(ch.equals("3")){
System.exit(0);
}else{
System.out.println("Please select valid Option");
}
res=obj.getData(sql,db);
System.out.println(res);
}
}catch(Exception e){
System.out.println(e);
}}}