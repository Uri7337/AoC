package Shared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteDB {

	private static final String URL = "jdbc:sqlite:Day_22_2019.db";

	/**
	 * Connect to the SQLite database
	 *
	 * @return the Connection object
	 */
	private Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}

	/**
	 * Create a new table in the database
	 */
	public void createTable() {
		String sql = "CREATE TABLE IF NOT EXISTS numbers (\n"
				+ " id integer PRIMARY KEY AUTOINCREMENT,\n"
				+ " value integer NOT NULL\n"
				+ ");";

		try (Connection conn = this.connect(); Statement stmt = conn.createStatement()) {
			stmt.execute(sql);
			System.out.println("Table 'numbers' has been created.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Insert a new number into the numbers table
	 *
	 * @param value the number to be inserted
	 */
	public void insertNumber(long value) {
		String sql = "INSERT INTO numbers(value) VALUES(?)";

		try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setLong(1, value);
			pstmt.executeUpdate();
			System.out.println("Inserted value: " + value);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void deleteNumber(int id) {
		String sql = "DELETE FROM numbers WHERE id = ?";

		try (Connection conn = this.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setInt(1, id);
			int affectedRows = pstmt.executeUpdate();
			if (affectedRows > 0) {
				System.out.println("Deleted number with ID: " + id);
			} else {
				System.out.println("No number found with ID: " + id);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Delete all numbers from the numbers table
	 */
	public void deleteAllNumbers() {
		String sql = "DELETE FROM numbers";

		try (Connection conn = this.connect(); Statement stmt = conn.createStatement()) {
			int affectedRows = stmt.executeUpdate(sql);
			System.out.println("Deleted " + affectedRows + " rows.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Drop the numbers table
	 */
	public void dropTable() {
		String sql = "DROP TABLE IF EXISTS numbers";

		try (Connection conn = this.connect(); Statement stmt = conn.createStatement()) {
			stmt.execute(sql);
			System.out.println("Table 'numbers' has been dropped.");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Read all numbers from the numbers table
	 */
	public void readNumbers() {
		String sql = "SELECT id, value FROM numbers";

		try (Connection conn = this.connect(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id") + "\tValue: " + rs.getInt("value"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
