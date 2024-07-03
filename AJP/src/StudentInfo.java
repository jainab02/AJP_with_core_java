import java.sql.*;

public class StudentInfo {

  // Database 
  private static final String DB_URL = "jdbc:mysql://localhost:3306/student";
  private static final String DB_USER = "root";
  private static final String DB_PASSWORD = "JAinab@02";

  public static void main(String[] args) {
    Connection connection = null;
    Statement statement = null;

    try {
      // Step 1: Connect to the database
      connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

      // Step 2: Create a statement
      statement = connection.createStatement();

      // Step 3: Perform database operations
      // Create table if it doesn't exist
      createTable(statement);

      // Insert a new student
      insertStudent(
        statement,
        "1",
        "Chirag",
        "chirya17@gmail.com",
        "93273029336",
        "6"
      );

      insertStudent(
        statement,
        "2",
        "Jainab ",
        "zainab17@gmail.com",
        "9327079336",
        "6"
      );

      // Update a student's email
      updateEmail(statement, "2", "zainabkhatri17@gmail.com");

      // Delete a student
      deleteStudent(statement, "1");

      // Step 4: Close the resources
      statement.close();
      connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  private static void createTable(Statement statement) throws SQLException {
    String createTableQuery =
      "CREATE TABLE IF NOT EXISTS students (" +
      "enrollment_no VARCHAR(10) PRIMARY KEY," +
      "student_name VARCHAR(100) NOT NULL," +
      "student_email VARCHAR(100) NOT NULL," +
      "student_mobile VARCHAR(15) NOT NULL," +
      "semester VARCHAR(2) NOT NULL" +
      ")";
    statement.execute(createTableQuery);
  }

  private static void insertStudent(
    Statement statement,
    String enrollmentNo,
    String studentName,
    String studentEmail,
    String studentMobile,
    String semester
  ) throws SQLException {
    String insertQuery =
      "INSERT INTO students (enrollment_no, student_name, student_email, student_mobile, semester) " +
      "VALUES ('" +
      enrollmentNo +
      "', '" +
      studentName +
      "', '" +
      studentEmail +
      "', '" +
      studentMobile +
      "', '" +
      semester +
      "')";
    statement.executeUpdate(insertQuery);
    System.out.println("Student inserted successfully.");
  }

  private static void updateEmail(
    Statement statement,
    String enrollmentNo,
    String newEmail
  ) throws SQLException {
    String updateQuery =
      "UPDATE students SET student_email = '" +
      newEmail +
      "' WHERE enrollment_no = '" +
      enrollmentNo +
      "'";
    int rowsAffected = statement.executeUpdate(updateQuery);
    if (rowsAffected > 0) {
      System.out.println("Email updated successfully.");
    } else {
      System.out.println(
        "No student found with enrollment number: " + enrollmentNo
      );
    }
  }

  private static void deleteStudent(Statement statement, String enrollmentNo)
    throws SQLException {
    String deleteQuery =
      "DELETE FROM students WHERE enrollment_no = '" + enrollmentNo + "'";
    int rowsAffected = statement.executeUpdate(deleteQuery);
    if (rowsAffected > 0) {
      System.out.println("Student deleted successfully.");
    } else {
      System.out.println(
        "No student found with enrollment number: " + enrollmentNo
      );
    }
  }
}
