package com.jdbcConnection;

import java.sql.*;
import java.util.Scanner;

public class JDBCConnector {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        //Information to establish the connection
        //String driver="com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "siddanth@28";
        //Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection sucessfull");
        // creating statements to execute
        Statement st = con.createStatement();
        //creation of database
        String database = "create database payroll_service";
        st.execute(database);
        System.out.println("data base created");
        //displaying all the database present in server
        String showDb = " show databases";
        ResultSet rs = st.executeQuery(showDb);
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
        //use of DB
        String useDB ="use payroll_service;";
        st.execute(useDB);
        //Creating Table
        String table = "create table employee_payroll(id int primary key auto_increment,name varchar(15),salary bigint,start_date date); ";
        st.execute(table);
        System.out.println("Table is created");
        // Inserting values to the table taking inputs from the user
        System.out.println("Enter the no of records to be added");
        int count = scanner.nextInt();
        for(int i=0;i<count;i++){
            System.out.println("Enter name");
            String name = scanner.next();
            System.out.println("Enter salary");
            long salary = scanner.nextLong();
            System.out.println("Enter start date in Format YYYY-MM-DD");
            String date = scanner.next();
            String insert= "INSERT INTO employee_payroll (name,salary,start_date)values(?,?,?); ";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setString(1,name);
            ps.setLong(2,salary);
            ps.setString(3,date);
            ps.executeUpdate();
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
