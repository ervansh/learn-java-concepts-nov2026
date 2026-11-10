package com.learnjava.jdbc;
import java.sql.*;
public final class JdbcDemo {
 private JdbcDemo() { }
 public static void main(String[] args) throws Exception {
  String url=System.getenv("JDBC_URL"),user=System.getenv("JDBC_USER"),password=System.getenv("JDBC_PASSWORD");
  if(url==null||user==null||password==null){System.out.println("Set JDBC_URL, JDBC_USER and JDBC_PASSWORD to run with a configured driver/database.");return;}
  String sql="SELECT customer_id, status FROM customer WHERE customer_id = ?";
  try(Connection c=DriverManager.getConnection(url,user,password);PreparedStatement p=c.prepareStatement(sql)){
   p.setString(1,"C-100");try(ResultSet r=p.executeQuery()){while(r.next())System.out.println(r.getString("customer_id")+" "+r.getString("status"));}
  }
 }
}
