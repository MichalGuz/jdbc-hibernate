package com.spring.jdbchibernate.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        // given

        // when
        DbManager dbManager = DbManager.getInstance();

        // then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        // given
        DbManager dbManager = DbManager.getInstance();

        // when
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);


        // then
        int counter = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("ID") + ", " + resultSet.getString("FIRSTNAME") + ", " + resultSet.getString("LASTNAME"));
            counter++;
        }
        resultSet.close();

        }
}
