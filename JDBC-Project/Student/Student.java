package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Student {
    public void insertEntries() {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "Root";

        try {

// Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

// Connect to MySQL
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            // 1. Create Database
            stmt.executeUpdate("create database if not exists testdb");

            // 2. Use Database
            stmt.executeUpdate("USE testdb");

            // 3. Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS student (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50), " +
                    "marks INT)";
            stmt.executeUpdate(createTable);

            // 4. Insert Data
            String insertData = "INSERT INTO student(name, marks) VALUES" +
                    "('Tanya', 95)," +
                    "('Rahul', 80)";
            stmt.executeUpdate(insertData);

            System.out.println("Database, Table created & Data inserted!");

            // Close connection

            con.close();

        } catch (Exception e){
            e.printStackTrace();
        }
            System.out.println("Data Created successfully");
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.insertEntries();
    }
}