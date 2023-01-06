/**
 * 
 */
package com.training.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Asif_
 *
 */
public class PostgreSqlUpdateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 1. Register the driver
		// 2.Establishing the connection
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Training",
				"postgres", "tiger")) {

			System.out.println("Java JDBC PostgreSQL Example");
			// When this class first attempts to establish a connection, it automatically
			// loads any JDBC 4.0 drivers found within
			// the class path. Note that your application must manually load any JDBC
			// drivers prior to version 4.0.
//      Class.forName("org.postgresql.Driver"); 

			System.out.println("Connected to PostgreSQL database!");
			// Creating the statement
			Statement statement = connection.createStatement();
			//Executing the query
			int result = statement.executeUpdate("UPDATE db.\"Employee\" set age=36 where \"EmpId\"=5");
			if(result>0) {
				System.out.println("Employee record updated succesfully");
			}

		} /*
			 * catch (ClassNotFoundException e) {
			 * System.out.println("PostgreSQL JDBC driver not found."); e.printStackTrace();
			 * }
			 */ catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
	}

}
