package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCLoggin {
    public String Login;
    public String MotDePasse;
    private boolean Logged = false;

    public void StartBdd() throws SQLException, ClassNotFoundException {
        String driverName = "com.mysql.jdbc.Driver";
        Class.forName(driverName); // here is the ClassNotFoundException

        String serverName = "localhost";
        String mydatabase = "suptodo";
        String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

        String username = "root";
        String password = "azerty";
        Connection connection = DriverManager.getConnection(url, username, password);
    }
}
