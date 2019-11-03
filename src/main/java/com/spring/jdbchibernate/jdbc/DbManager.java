package com.spring.jdbchibernate.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class DbManager {
    private Connection connection;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {}
}
