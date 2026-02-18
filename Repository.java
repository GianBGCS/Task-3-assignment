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

    private void createTable() {
        String sql = """
            CREATE TABLE IF NOT EXISTS students (
                id INTEGER PRIMARY KEY,        -- student ID, user-provided, NOT auto-increment
                first_name TEXT NOT NULL,
                initial TEXT NOT NULL,
                last_name TEXT NOT NULL,
                age INTEGER NOT NULL,
                email TEXT NOT NULL,
                gender TEXT NOT NULL,
                course TEXT NOT NULL,
                year INTEGER NOT NULL,
                section INTEGER NOT NULL
            )
        """;
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Table creation failed: " + e.getMessage());
        }
    }

    
    public Student addStudent(Student student) {
        String sql = """
            INSERT INTO students(
                id, first_name, initial, last_name, age, email,
                gender, course, year, section
            ) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
        """;
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, student.getId());
            pstmt.setString(2, student.getFirst_Name());
            pstmt.setString(3, student.getInitial());
            pstmt.setString(4, student.getLast_Name());
            pstmt.setInt(5, student.getAge());
            pstmt.setString(6, student.getEmail());
            pstmt.setString(7, student.getGender());
            pstmt.setString(8, student.getCourse());
            pstmt.setInt(9, student.getYear());
            pstmt.setInt(10, student.getSection());

            pstmt.executeUpdate();
            return student;
        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
            return null;
        }
    }

