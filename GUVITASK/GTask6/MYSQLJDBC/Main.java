package GUVITASK.GTask6.MYSQLJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Main class for database operations
public class Main {

    // Database connection details
    private static final String url = "jdbc:mysql://localhost:3306/EmployeeDB";
    private static final String username = "root";
    private static final String password = "4417";

    // SQL query for inserting data into the Employee table
    private static final String SqlQuery = "INSERT INTO Employee"
            +"(empname,empage,sal) VALUES"+
            "(?,?,?)";


    public static void main(String[] args)throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No. of Employees data to be inserted");
        int NoOfEmp = sc.nextInt();//get a NoOfEmp from user to add data's
        List<Employee> employeeList = new ArrayList<>();// List to hold Employee objects
        try (Connection connection = DriverManager.getConnection(url,username,password))
        {
            // Adding Employee objects to the list
            for(int i=0;i<NoOfEmp;i++){
                System.out.println("Enter the EmpName, EmpAge, EmpSalary");
                employeeList.add(new Employee(sc.next(), sc.nextInt(), sc.nextInt()));
            }
            




            try(PreparedStatement preparedStatement  = connection.prepareStatement(SqlQuery)){
                // Inserting data into the database using prepared statements
                for(Employee emp:employeeList){
                    //preparedStatement.setInt(1,emp.getEmpcode());
                    preparedStatement.setString(1,emp.getEmpname());
                    preparedStatement.setInt(2,emp.getEmpage());
                    preparedStatement.setDouble(3,emp.getEsalary());
                    preparedStatement.executeUpdate();
                }
                System.out.println("Data Inserted Successfully");
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();//catch if any error occurs
        }
        finally {
            sc.close();// Closing Scanner
        }
        }

    }
    /*output =
    empcode  empname  empage  sal
    101	     Jenny	  25	  10000
    102	     Jacky	  30	  20000
    103	     Joe	  20	  40000
    104	     John	  40	  80000
    105	     Shameer  25	  90000

#filename in my mysql workbench = GTaskJDBC

create database EmployeeDB;

use EmployeeDB;

create table Employee(
empcode int primary key auto_increment,
empname varchar(50) not null,
empage int,
sal int (10) NOT NULL
)auto_increment=101;


select * from Employee;




     */




