package STDENT_GRADE_CALCULATOR_CODSOFT;
import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.mysql.cj.protocol.Resultset;

import java.awt.Taskbar.State;
import java.sql.*;
public class Studentimpl implements studentdao {
 Connection con;
	public void  addstudnet(student stu) {
		con=dbconn.getdbconnection();
		String query="insert into stu values(?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, stu.getRollid());
			ps.setString(2, stu.getName());
			ps.setInt(3, stu.getStd());
			ps.setString(4, stu.getAddress());
			int cnt=ps.executeUpdate();
			if(cnt!=0) {
				System.out.println("Data inserted successfully...");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	@Override
	public void showstudent() {
		con=dbconn.getdbconnection();
		String query="select * from stu";
		System.out.println("--------------------------------------------");
		System.out.println("(Student Details :- )");
		System.out.println("--------------------------------------------");
		System.out.print("RollId\tName\tSTD\tAddress\n");
		try {
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery(query);
			while(rs.next()) {
				System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\n\n");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void showstudentonrollid(int rollid) {
		con=dbconn.getdbconnection();
		String query="select * from stu where rollid="+rollid;
		System.out.println("--------------------------------------------");
		System.out.println("(Student Details :- )");
		System.out.println("--------------------------------------------");
		System.out.print("RollId\tName\tSTD\tAddress\n");
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4)+"\n\n");
			}
		}catch(Exception e) {
			System.out.println(e);
		}	
	}
	
	@Override 
	public void updatestudent(int rollid, String name) {
		con=dbconn.getdbconnection();
		String query="update stu set name=? where rollid=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, name);
			ps.setInt(2, rollid);
			int cnt=ps.executeUpdate();
			if(cnt!=0) {
				System.out.println("Data updated successfully...");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Override
	public void deletestudent(int rollid) {
		con=dbconn.getdbconnection();
		String query="delete from stu where rollid=?";
		try {
			PreparedStatement ps=con.prepareStatement(query);
			ps.setInt(1, rollid);
			int cnt=ps.executeUpdate();
			if(cnt!=0) {
				System.out.println("Data deleted successfully...");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
