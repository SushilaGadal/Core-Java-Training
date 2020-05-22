package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Choice {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC";
		String username = "root";
		String password = "band12.6";
		PreparedStatement ps = null;
		Connection con = DriverManager.getConnection(url, username, password);
		Scanner sc = new Scanner(System.in);
		String temp;

		do {
			System.out.println("Enter the number(1.Insert 2.Display 3.Update 4.Delete)");
			int id, fee;
			String name;
			int choi = sc.nextInt();

			switch (choi) {
			case 1:
				System.out.println("Enter the id of the student");
				id = sc.nextInt();
				System.out.println("Enter the name of the student");
				name = sc.next();
				System.out.println("Enter the fee of the student");
				fee = sc.nextInt();
				ps = con.prepareStatement("insert into studentInfo values(?,?,?)");
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setInt(3, fee);
				int x = ps.executeUpdate();
				if (x != 0)
					System.out.println("Record inserted");
				break;

			case 2:

				System.out.println("Enter the number(1.all columns 2.all rows 3.particular rows" + " 4.particular )");
				int dis = sc.nextInt();

				switch (dis) {
				case 1:
					ps = con.prepareStatement("select id, name, fee from studentInfo");
					ResultSet rs = ps.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));

					}
					break;
				case 2:
					ps = con.prepareStatement("select * from studentInfo");
					ResultSet res = ps.executeQuery();
					while (res.next()) {
						System.out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getInt(3));

					}
					break;

				case 3:
					Statement sat = con.createStatement();
					ResultSet ris = sat.executeQuery("select id, name, fee from studentInfo where id=1023");
					while (ris.next()) {
						System.out.println(ris.getInt(1) + " " + ris.getString(2) + " " + ris.getInt(3));

					}
					break;

				case 4:
					ps = con.prepareStatement("select name from studentInfo");
					ResultSet ress = ps.executeQuery();
					while (ress.next()) {
						System.out.println(ress.getInt(1) + " " + ress.getString(2) + " " + ress.getInt(3));

					}

				} // switch select
				break;

			case 3:

				System.out.println("Enter the number(1. update name 2.update fee )");
				int up = sc.nextInt();

				switch (up) {
				case 1:
					Statement st = con.createStatement();
					int rs = st.executeUpdate("update studentInfo set name='kiran' where id=1023");
					if (rs != 0)

					{
						System.out.println("name updated");
					}
					break;
				case 2:
					Statement sat = con.createStatement();
					int res = sat.executeUpdate("update studentInfo set fee=fee+500 where id= 3045");

					if (res != 0)

					{
						System.out.println("fee updated");
					}

				} // switch up

				break;

			case 4:

				System.out.println("Enter the number(1. delete particular row 2.delete particular column ");
				int del = sc.nextInt();
				switch (del) {
				case 1:
					Statement st = con.createStatement();
					int rs = st.executeUpdate("delete from studentInfo where id=1023");
					if (rs != 0)

					{
						System.out.println("1023 info is deleted ");
					}
					break;
				case 2:
					Statement sta = con.createStatement();
					int res = sta.executeUpdate("delete fee from studentInfo");
					if (res != 0)

					{
						System.out.println("fee deleted");
					}

				}// switch ko del

			}// main switch

			System.out.print("Do you want to continue (y/n)?");
			temp = sc.next();
		} while (temp.equals("y"));

	}
}

// if any code
