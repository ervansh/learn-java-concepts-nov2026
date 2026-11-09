package com.learnjava.jdbc;
import java.sql.*;
public class JdbcDemo{public static void main(String[] args)throws SQLException{String url="jdbc:h2:mem:testdb";try(Connection c=DriverManager.getConnection(url);PreparedStatement p=c.prepareStatement("SELECT ? AS test_status")){p.setString(1,"PASS");try(ResultSet r=p.executeQuery()){if(r.next())System.out.println(r.getString("test_status"));}}}}
