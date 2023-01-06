/**
 * 
 */
package com.training.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Asif_
 *
 */
public class PostgreSqlExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 1. Register the driver
		// 2.Establishing the connection
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Training", "postgres",
				"tiger")) {

			System.out.println("Java JDBC PostgreSQL Example");
			// When this class first attempts to establish a connection, it automatically
			// loads any JDBC 4.0 drivers found within
			// the class path. Note that your application must manually load any JDBC
			// drivers prior to version 4.0.
//      Class.forName("org.postgresql.Driver"); 

			System.out.println("Connected to PostgreSQL database!");
			//Creating the statement
			Statement statement = connection.createStatement();
			System.out.println("Reading employee records...");
			ResultSet resultSet = statement.executeQuery("SELECT * FROM db.\"Employee\"");
			while (resultSet.next()) {
				System.out.println("Emp ID:"+resultSet.getLong("EmpId")+", Name:"+resultSet.getString("name"));
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
