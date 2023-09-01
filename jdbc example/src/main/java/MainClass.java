import java.sql.*;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		try (Connection conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:orcl", "ECOMMERCE_CORE", "ECOMMERCE_CORE")) {

			if (conn != null) {
				System.out.println("Connected to the database!");

				//select
				Statement selectStmt = conn.createStatement();
				ResultSet rset = selectStmt
						.executeQuery("select * from TEST");
				System.out.println("name");
				while (rset.next()) {
					System.out.println(rset.getString(2));
				}
				rset.close();
				selectStmt.close();
				//select

				// insert
				Statement insertStmt = conn.createStatement();
				int insertCount = insertStmt
						.executeUpdate("INSERT INTO TEST (ID, Name)"
								+ " VALUES (9, 'inserted record')");
				System.out.println("inserted =  " + insertCount);
				insertStmt.close();
				//insert

				 // update
				Statement updateStmt = conn.createStatement();
				int updateCount = updateStmt
						.executeUpdate("update test set name = 'updated Name' where name = 'inserted record'");
				System.out.println("updated =  " + updateCount);
				updateStmt.close();
				// update

				//delete
				Statement deleteStmt = conn.createStatement();
				int deleteCount = deleteStmt
						.executeUpdate("Delete from Test where id = 9");
				System.out.println("deleted  =  " + deleteCount);
				deleteStmt.close();
				//delete

			} else {
				System.out.println("Failed to make connection!");
			}

		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
