package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.*;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(
                    rs.getInt("ID") + ", " + rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        System.out.println("\n]]]] Kodilla exercise 16.6 DbManager (testSelectUsersAndPosts()) [[[[");
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "select U.FIRSTNAME, U.LASTNAME, COUNT(*) as POSTS_QUANTITY from POSTS P join USERS U on U.ID = P.USER_ID group by USER_ID having COUNT(*) >= 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(
                rs.getString("FIRSTNAME") + ", " + rs.getString("LASTNAME")  + ", " + rs.getInt("POSTS_QUANTITY"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(2, counter);
    }
}