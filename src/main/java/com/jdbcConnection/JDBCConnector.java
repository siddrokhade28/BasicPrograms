package com.jdbcConnection;

import java.sql.*;
import java.util.Scanner;

public class JDBCConnector {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner scanner = new Scanner(System.in);
        //Information to establish the connection
        //String driver="com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/payroll_service";
        String username = "root";
        String password = "siddanth@28";
        //Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection sucessfull");


        //creating statements to execute
        Statement st = con.createStatement();
        /*
        //creation of database
        String database = "create database payroll_service";
        st.execute(database);
        System.out.println("data base created");
        */

        /*use of DB
        String useDB = "use payroll_service;";
        st.execute(useDB);
         */


//        //Creating Table
//        String table = "create table employee_payroll(id int primary key auto_increment,name varchar(15),salary bigint,start_date date); ";
//        st.execute(table);
//        System.out.println("Table is created");

//        //inserting hard coded values
//        String q1="INSERT INTO employee_payroll (name,salary,start_date)values('akash',15000,'2020-01-10'); ";
//        st.execute(q1);
//        String q2="INSERT INTO employee_payroll (name,salary,start_date)values('sanjay',30000,'2020-07-06'); ";
//        st.execute(q2);
//        String q3="INSERT INTO employee_payroll (name,salary,start_date)values('rahul',8600,'2020-04-23'); ";
//        st.execute(q3);
//        String q4="INSERT INTO employee_payroll (name,salary,start_date)values('jeswin',77000,'2020-06-10'); ";
//        st.execute(q4);
//        String q5="INSERT INTO employee_payroll (name,salary,start_date)values('dhanush',60000,'2020-02-10'); ";
//        st.execute(q5);
//
//
//        // Inserting values to the table taking inputs from the user
////        System.out.println("Enter the no of records to be added");
////        int count = scanner.nextInt();
////        for (int i = 0; i < count; i++)
////        {
////            System.out.println("Enter name");
////            String name = scanner.next();
////            System.out.println("Enter salary");
////            long salary = scanner.nextLong();
////            System.out.println("Enter start date in Format YYYY-MM-DD");
////            String date = scanner.next();
////            String insert = "INSERT INTO employee_payroll (name,salary,start_date)values(?,?,?); ";
////            PreparedStatement ps = con.prepareStatement(insert);
////            ps.setString(1, name);
////            ps.setLong(2, salary);
////            ps.setString(3, date);
////            ps.executeUpdate();
////        }
//
//        //fetching the data from the table
//        String fetch ="SELECT * FROM employee_payroll;";
//        ResultSet result =st.executeQuery(fetch);
//        while (result.next()){
//            System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getInt(3)+" "+result.getString(4));
//        }
//        result.close();
//        System.out.println();
//        System.out.println("---------------------------------------------");
//        System.out.println();
//        //updating the salary of a record
//        String update= "update employee_payroll set salary=30000 where name='sid' ";
//        PreparedStatement ps = con.prepareStatement(update);
//        ps.executeUpdate();
//
//        String retrive="select * from employee_payroll WHERE start_date BETWEEN CAST('2020-03-01'AS DATE) AND DATE(NOW());";
//        ResultSet rs =st.executeQuery(retrive);
//        while (rs.next()){
//            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
//        }
//
//
//        //ability to add sum,min,max and number of male and female
         String sum ="SELECT SUM(salary) FROM employee_payroll WHERE gender = 'm' GROUP BY gender;";
         ResultSet total =st.executeQuery(sum);
        while(total.next()){
            System.out.println("the sum is "+total.getString(1));
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