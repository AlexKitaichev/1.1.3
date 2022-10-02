package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    private static final String password = "root";
    private static final String login = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static Connection connection;

    public static Connection getConnection() {
        try {
            return connection = DriverManager.getConnection(URL, login, password);
        } catch (SQLException e) {
            System.err.println("Не удалось получить соединение");
            throw new RuntimeException(e);

        }
    }
}

