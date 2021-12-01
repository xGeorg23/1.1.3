package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String url = "jdbc:mysql://localhost:3306/mytest";
    private static final String username = "root";
    private static final String password = "root1";

    public static Connection getConnection() {
        Connection connection = null;
        try {
             connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
             e.printStackTrace();
        }
        return connection;
    }
}
