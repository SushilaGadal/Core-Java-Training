package dbupdate;
import java.sql.*;

public class updatequery {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/student?serverTimezone=UTC";
		String username = "root";
		String password = "band12.6";
		Connection con = DriverManager.getConnection(url, username, password);

		if (con != null)
			System.out.println("connected");
		    Statement st=con.createStatement();
		    int x = st.executeUpdate("update student set name='rahul' where id=1023");
		    if (x!=0)
		    	System.out.println("Record updated");
		

	}

}
