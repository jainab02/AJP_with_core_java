import java.sql.*;
import java.util.Scanner;

public class EmployeeInfo {

  static final String DB_URL = "jdbc:mysql://localhost:3306/employeeInfo";
  static final String USER = "root";
  static final String PASSWORD = "JAinab@02";

  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
      Statement stmt = conn.createStatement();
      createTable(stmt);

      int choice;
      do {
        choice = getChoiceFromUser();
        switch (choice) {
          case 1:
            insertEmployee(conn);
            break;
          case 2:
            updateEmployee(conn);
            break;
          case 3:
            deleteEmployee(conn);
            break;
          case 4:
            viewAllEmployees(stmt);
            break;
          case 5:
            viewEmployeesByDepartment(stmt);
            break;
          case 6:
            viewManagers(stmt);
            break;
          case 7:
            viewEmployeesBySalary(stmt);
            break;
          case 8:
            incrementSalary(conn);
            break;
          case 9:
            System.out.println("Exiting...");
            break;
          default:
            System.out.println("Invalid choice.");
        }
      } while (choice != 9);

      stmt.close();
      conn.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void createTable(Statement stmt) throws SQLException {
    String sql =
      "CREATE TABLE IF NOT EXISTS employeeInfo (\r\n" +
      "  Employee_ID INT PRIMARY KEY,\r\n" +
      "  Employee_Name VARCHAR(50),\r\n" +
      "  Designation VARCHAR(50),\r\n" +
      "  Employee_Mo VARCHAR(20),\r\n" +
      "  Department VARCHAR(50),\r\n" +
      "  Salary DECIMAL(10, 2)\r\n" +
      ");\r\n" +
      "";
    stmt.executeUpdate(sql);
  }

  private static int getChoiceFromUser() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Employee Information System Menu:");
    System.out.println("1. Insert an Employee data");
    System.out.println("2. Update a particular Employee data");
    System.out.println("3. Delete a particular Employee data");
    System.out.println("4. View All Employees of the organization");
    System.out.println(
      "5. View All Employees of a particular Department of an organization"
    );
    System.out.println(
      "6. View All Employees of the organization who have Manages as their designation"
    );
    System.out.println(
      "7. View All Employees whose salary is greater than a particular salary"
    );
    System.out.println(
      "8. Increment salary of an employee by a particular percentage (salary should be rounded at tens value)"
    );
    System.out.println("9. Exit");
    System.out.print("Enter your choice: ");
    return scanner.nextInt();
  }

  private static void insertEmployee(Connection conn) throws SQLException {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Employee details:");
    System.out.print("Employee ID: ");
    int id = scanner.nextInt();
    System.out.print("Employee Name: ");
    String name = scanner.next();
    System.out.print("Designation: ");
    String designation = scanner.next();
    System.out.print("Employee Mobile Number: ");
    String mobileNumber = scanner.next();
    System.out.print("Department: ");
    System.out.println();
    String department = scanner.next();
    System.out.print("Salary: ");
    float salary = scanner.nextFloat();

    String sql = "INSERT INTO employeeinfo VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setInt(1, id);
    pstmt.setString(2, name);
    pstmt.setString(3, designation);
    pstmt.setString(4, mobileNumber);
    pstmt.setString(5, department);
    pstmt.setFloat(6, salary);
    pstmt.executeUpdate();
    System.out.println("Employee data inserted successfully.");
    pstmt.close();
  }

  private static void updateEmployee(Connection conn) throws SQLException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Employee ID to update: ");
    int id = scanner.nextInt();

    if (employeeExists(conn, id)) {
      System.out.print("Enter new salary: ");
      float salary = scanner.nextFloat();

      String sql = "UPDATE employeeinfo SET Salary = ? WHERE Employee_ID = ?";
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setFloat(1, salary);
      pstmt.setInt(2, id);
      pstmt.executeUpdate();
      System.out.println("Employee data updated successfully.");
      pstmt.close();
    } else {
      System.out.println("Employee with ID " + id + " does not exist.");
    }
  }

  private static void deleteEmployee(Connection conn) throws SQLException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Employee ID to delete: ");
    int id = scanner.nextInt();

    if (employeeExists(conn, id)) {
      String sql = "DELETE FROM employeeinfo WHERE Employee_ID = ?";
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, id);
      pstmt.executeUpdate();
      System.out.println("Employee data deleted successfully.");
      pstmt.close();
    } else {
      System.out.println("Employee with ID " + id + " does not exist.");
    }
  }

  private static void viewAllEmployees(Statement stmt) throws SQLException {
    String sql = "SELECT * FROM employeeinfo";
    ResultSet rs = stmt.executeQuery(sql);
    printEmployeeData(rs);
    rs.close();
  }

  private static void viewEmployeesByDepartment(Statement stmt)
    throws SQLException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Department: ");
    String department = scanner.next();

    String sql =
      "SELECT * FROM employeeinfo WHERE Department = '" + department + "'";
    ResultSet rs = stmt.executeQuery(sql);
    printEmployeeData(rs);
    rs.close();
  }

  private static void viewManagers(Statement stmt) throws SQLException {
    String sql = "SELECT * FROM employeeinfo WHERE Designation = 'Manager'";
    ResultSet rs = stmt.executeQuery(sql);
    printEmployeeData(rs);
    rs.close();
  }

  private static void viewEmployeesBySalary(Statement stmt)
    throws SQLException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Salary: ");
    float salary = scanner.nextFloat();

    String sql = "SELECT * FROM employeeinfo WHERE Salary > " + salary;
    ResultSet rs = stmt.executeQuery(sql);
    printEmployeeData(rs);
    rs.close();
  }

  private static void incrementSalary(Connection conn) throws SQLException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter Employee ID: ");
    int id = scanner.nextInt();

    if (employeeExists(conn, id)) {
      System.out.print("Enter percentage to increment salary: ");
      float percentage = scanner.nextFloat();

      String sql = "SELECT Salary FROM employeeinfo WHERE Employee_ID = " + id;
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);

      if (rs.next()) {
        float currentSalary = rs.getFloat("Salary");
        float newSalary =
          Math.round(currentSalary * (1 + percentage / 100) / 10) * 10;

        String updateSql =
          "UPDATE employeeinfo SET Salary = ? WHERE Employee_ID = ?";
        PreparedStatement pstmt = conn.prepareStatement(updateSql);
        pstmt.setFloat(1, newSalary);
        pstmt.setInt(2, id);
        pstmt.executeUpdate();
        System.out.println("Salary updated successfully.");
        pstmt.close();
      } else {
        System.out.println("Employee with ID " + id + " does not exist.");
      }

      rs.close();
      stmt.close();
    } else {
      System.out.println("Employee with ID " + id + " does not exist.");
    }
  }

  private static boolean employeeExists(Connection conn, int id)
    throws SQLException {
    String sql = "SELECT * FROM employeeinfo WHERE Employee_ID = " + id;
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    boolean exists = rs.next();
    rs.close();
    stmt.close();
    return exists;
  }

  private static void printEmployeeData(ResultSet rs) throws SQLException {
    System.out.println("Employee Data:");
    while (rs.next()) {
      int id = rs.getInt("Employee_ID");
      String name = rs.getString("Employee_Name");
      String designation = rs.getString("Designation");
      String mobileNumber = rs.getString("Employee_Mo");
      String department = rs.getString("Department");
      float salary = rs.getFloat("Salary");

      System.out.println("ID: " + id);
      System.out.println("Name: " + name);
      System.out.println("Designation: " + designation);
      System.out.println("Mobile Number: " + mobileNumber);
      System.out.println("Department: " + department);
      System.out.println("Salary: " + salary);
      System.out.println("------------------------");
    }
  }
}
