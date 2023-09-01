package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        AppDatabase appDatabase = new AppDatabase();

        //appDatabase.createTable("test");
        appDatabase.insertRow("Ezzat","ziad","test@test.com","cs", 500000000.0);
        appDatabase.closeConnection();
    }
}