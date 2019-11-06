package com.spring.jdbchibernate.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {
    private Connection connection;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {
        Properties connectionProperties = new Properties();
        connectionProperties.put("user", "mg_user");
        connectionProperties.put("password", "user_password");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db_practise?serverTimezone=Europe/Warsaw" + "&useSSL=False", connectionProperties);
    }

    public static DbManager getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection(){
        return connection;
    }
}
