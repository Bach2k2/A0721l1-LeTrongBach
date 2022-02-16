package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBRepos {
    private static String JDBC_Url = "jdbc:mysql://localhost:3306/quan_ly_mat_bang_T_complex";
    private static String JDBC_Username = "root";
    private static String JDBC_Password = "bach2002";
    private Connection connection;

    public DBRepos() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.connection = DriverManager.getConnection(JDBC_Url, JDBC_Username, JDBC_Password);
            connection.setAutoCommit(false);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public Connection getAConnect(){
        return this.connection;
    }
}
