package JDBC;
import java.rmi.*;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
public class DatabaseImpletation extends UnicastRemoteObject implements DatabaseInt {
String str,str1;
public DatabaseImpletation() throws RemoteException{
super();
}
@Override
public String getData(String sql,String orcl) throws RemoteException{
try{
//step1 load the driver class
Class.forName("oracle.jdbc.driver.OracleDriver");
//step2 create the connection object
Connection
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","HR","HR");
//step3 create the statement object
Statement stmt=con.createStatement();
//step4 execute query
ResultSet rs=stmt.executeQuery(sql);
ResultSetMetaData rsmd=rs.getMetaData();
System.out.println("connection done");
str="";
str1="";
for(int i=1;i<=rsmd.getColumnCount();i++)
{
str1=str1+rsmd.getColumnName(i) + "\t";
}
System.out.println();
while(rs.next()){
for(int i=1;i<=rsmd.getColumnCount();i++){
str=str + rs.getString(i)+"\t";
}
str = str + "\n";
}
//step5 close the connection object
con.close();
}catch(ClassNotFoundException | SQLException e)
{
System.out.println(e);
}
return (str1+"\n" +str);
}
}