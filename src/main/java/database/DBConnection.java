package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String url = "jdbc:postgresql://localhost:5432/mini_football_db";
    private static final String user = "mini_football_db_manager";
    private static final String password = "Fitiavana";

    public static Connection getDBConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }



}
