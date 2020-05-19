package dbInsert;

import java.sql.*;

public class InsertQuery {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/student?serverTimezone=UTC";
		String username = "root";
		String password = "band12.6";
		Connection con = DriverManager.getConnection(url, username, password);

		if (con != null)
			System.out.println("connected");
		    Statement st=con.createStatement();
		    int x = st.executeUpdate("insert into student value(1023, 'sushila')");
		    if (x!=0)
		    	System.out.println("Record inserted");

	}

}
