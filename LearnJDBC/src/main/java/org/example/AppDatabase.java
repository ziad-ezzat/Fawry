package org.example;

import java.sql.*;

public class AppDatabase {

    private String url = "jdbc:mysql://localhost:3306/learnjdbc";
    private String username = "root";
    private String password = "";
    private Connection myConn = null;
    private Statement myStmt = null;

    public AppDatabase() {
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection(url, username, password);

            // 2. Create a statement
            myStmt = myConn.createStatement();
        } catch (Exception exc) {
            System.err.println("Database error: " + exc.getMessage());
        }
    }

    public void createTable(String tableName) {
        try {
            String createTableQuery = "CREATE TABLE IF NOT EXISTS " + tableName + " (" +
                    "id INT NOT NULL AUTO_INCREMENT, " +
                    "last_name VARCHAR(255), " +
                    "first_name VARCHAR(255), " +
                    "email VARCHAR(255), " +
                    "department VARCHAR(255), " +
                    "salary DOUBLE, " +
                    "PRIMARY KEY (id))";
            myStmt.executeUpdate(createTableQuery);

            System.out.println("Table created successfully!");
        } catch (Exception exc) {
            System.err.println("Database error: " + exc.getMessage());
        }
    }

    public void insertRow(String lastName, String firstName, String email, String department, Double salary) {
        try {
            String insertRowQuery = "INSERT INTO test (last_name, first_name, email, department, salary) VALUES ('" +
                    lastName + "', '" +
                    firstName + "', '" +
                    email + "', '" +
                    department + "', " +
                    salary + ")";
            myStmt.executeUpdate(insertRowQuery);

            System.out.println("Row inserted successfully!");
        } catch (Exception exc) {
            System.err.println("Database error: " + exc.getMessage());
        }
    }

    public void closeConnection() {
        try {
            myConn.close();
        } catch (Exception exc) {
            System.err.println("Database error: " + exc.getMessage());
        } finally {
            System.out.println("Database connection terminated.");
        }
    }
}
