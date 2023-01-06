/**
 * 
 */
package com.training.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author Asif_
 *
 */
public class PostgreSqlPrepareInsertExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		// 1. Register the driver
//      Class.forName("org.postgresql.Driver");
		// 2.Establishing the connection
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Training",
				"postgres", "tiger")) {
			System.out.println("Connected to PostgreSQL database!");
			// Creating the statement
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO db.\"Employee\"(\r\n"
					+ "	\"EmpId\", name, age, gender)\r\n"
					+ "	VALUES (?, ?, ?, ?)");
			
			System.out.println("Enter employee details");
			System.out.println("Enter employee ID");
			preparedStatement.setInt(1, scanner.nextInt());
			System.out.println("Enter employee name");
			preparedStatement.setString(2, scanner.next());
			System.out.println("Enter employee age");
			preparedStatement.setInt(3, scanner.nextInt());
			System.out.println("Enter employee gender");
			preparedStatement.setString(4, scanner.next());
			//Executing the query
			int result = preparedStatement.executeUpdate();
			if(result>0) {
				System.out.println("Employee record inserted succesfully");
			}

		} /*
			 * catch (ClassNotFoundException e) {
			 * System.out.println("PostgreSQL JDBC driver not found."); e.printStackTrace();
			 * }
			 */ catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}finally {
			scanner.close();
		}
	}

}
