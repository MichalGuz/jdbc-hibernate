package com.spring.jdbchibernate.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;

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
    public void testSelectUsers() {}
}
