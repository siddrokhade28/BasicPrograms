package com.jdbcConnection;

import java.sql.*;

public class JDBCConnector {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Information to establish the connection
        //String driver="com.mysql.cj.jdbc.Driver";
        String url="jdbc:mysql://localhost:3306/";
        String username="root";
        String password="siddanth@28";
        //Class.forName(driver);
        Connection con= DriverManager.getConnection(url,username,password);
        System.out.println("Connection sucessfull");
        // creating statements to execute
        Statement st = con.createStatement();
        String database= "create database payroll_service";
        st.execute(database);
        System.out.println("data base created");
        String showDb =" show databases";
        ResultSet rs =st.executeQuery(showDb);
        while(rs.next()){
            System.out.println(rs.getString(1));
        }
////      String sq1="select * from employee.employee where id =?";
//        String sq1="insert into employee (address,name) values(?,?)";
//        PreparedStatement ps= con.prepareStatement(sq1);
//        ps.setString(1,"Delhi");
//        ps.setString(2,"dhanraj");
//        ps.executeUpdate();
//        System.out.println("values inserted");
//        String sql2= "select * from employee";
//        Statement st= con.createStatement();
//        ResultSet rs=st.executeQuery(sql2);
//        while (rs.next()){
//            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getNString(3)+" ");
//        }
    }
}
