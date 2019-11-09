package com.spring.jdbchibernate.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
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
        statement.close();

        Assert.assertEquals(12, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException{
        // given
        DbManager dbManager = DbManager.getInstance();

        // when
        String sqlQuerry = "SELECT U.FIRSTNAME, U.LASTNAME, P.USER_ID, COUNT(*) AS POSTS_NUMBER\n " +
                "FROM USERS U, POSTS P\n" +
                "WHERE U.ID = P.USER_ID\n" +
                "GROUP BY USER_ID\n" +
                "HAVING COUNT(*) > 3\n";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuerry);

        // then

        int counter = 0;
        while (resultSet.next()) {
            System.out.println(resultSet.getString("FIRSTNAME") + " " + resultSet.getString("LASTNAME") + " " + resultSet.getInt("POSTS_NUMBER") + ";" );
            counter++;
        }
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUserWithDistinctLastName() throws SQLException {
        // given
        DbManager dbManager = DbManager.getInstance();

        // when
        String query = "SELECT DISTINCT(LASTNAME) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        // then
        int counter = 0;
        while (resultSet.next()) {

        }
    }
}
