package Examples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample1 {
public static void main(String[] args) throws SQLException {
	// step 1
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","1234");
	// step 2
	Statement stmt = con.createStatement();
	//Step 3 : execute the query
	String create_Table = "create table Employee("
			+ "id int,"
			+ "name varchar2(30)"
			+ ")";
	String Insert_value = "Insert into Employee values(102,'Teena')";
	String update_Query ="update Employee set name='jeena' where id = 102";
	String Delete_value ="Delete from Employee where id = 102";
	
	stmt.executeQuery(Delete_value);
	// Step 4 : close connection
	con.close();
	System.out.println("Program is exited");
}
}
