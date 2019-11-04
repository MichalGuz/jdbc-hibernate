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
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Practise?serverTimezone=Europe/Warsaw" + "&useSSL=False", connectionProperties);
    }

    public static DbManager getInstance() {

    }
}
