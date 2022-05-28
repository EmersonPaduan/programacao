package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {
    static String urlBD = "jdbc:mysql://localhost:3306/bd_java";
    static String username = "professor"; // root
    static String password = "aula"; // senha da instalação

    public static Connection getConnection() throws SQLException {
        Connection connection = null;

        connection = DriverManager.getConnection(urlBD, username, password);

        return connection;
    }

}
