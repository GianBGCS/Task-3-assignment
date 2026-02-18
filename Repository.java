import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Repository {
    private static final String DB_URL = "jdbc:sqlite:students.db";
    private Connection connection;

    public Repository() {
        try {
            this.connection = DriverManager.getConnection(DB_URL);
            createTable();
        } catch (SQLException e) {
            System.err.println("FATAL: Cannot connect to database: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
