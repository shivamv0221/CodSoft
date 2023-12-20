package STDENT_GRADE_CALCULATOR_CODSOFT;
import java.sql.*;
public class dbconn {

	static Connection con;
	public static Connection getdbconnection() {
		try {
		String url="jdbc:mysql://localhost/codsoft";
		String user="root";
		String pass="";
		con=DriverManager.getConnection(url,user,pass);
		}catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
