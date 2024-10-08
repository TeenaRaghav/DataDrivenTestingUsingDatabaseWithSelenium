package Examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {
	public static void main(String[] args) throws SQLException {

		// step 1
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "1234");
		// step 2
		Statement stmt = con.createStatement();
		// Step 3 : execute the query
//		String create_Table = "create table Employee(" + "id int," + "name varchar2(30)" + ")";
		String Insert_value = "Insert into Employee values(102,'Teena')";
//		stmt.executeQuery(Insert_value);
//		System.out.println("***values are inserted***");
//		String update_Query ="update Employee set name='jeena' where id = 102";
		String Delete_value ="Delete from Employee where id = 102";
		System.out.println("value is deleted.");
		stmt.executeQuery(Delete_value);

		String select_Query = "select id, name from Employee";
//		step 4
		ResultSet rs = stmt.executeQuery(select_Query);
		while(rs.next()) {
			String id =rs.getString("id");
			String name = rs.getString("name");
			System.out.println(id );
			System.out.println(name );
		}
		// Step 5 : close connection
		con.close();
		System.out.println("Program is exited");
	}
}