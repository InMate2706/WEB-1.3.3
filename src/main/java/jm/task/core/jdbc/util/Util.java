package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/userdb?serverTimezone=Europe/Moscow" +
            "&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String username = "root";
    private static final String password = "101206102";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded success");
            connection = DriverManager.getConnection(URL, username, password);
            System.out.println("Connection success");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

}

