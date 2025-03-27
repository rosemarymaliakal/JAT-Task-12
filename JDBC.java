package GuviSelenium;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url ="jdbc:sqlite:C:\\Users\\arunc\\Desktop\\GuviDatabase.db";
		
		Class.forName("org.sqlite.JDBC");
		
		Connection conn = DriverManager.getConnection(url);
		
		System.out.println("Connection to db Done");
		
		String myQuery ="INSERT INTO users(empcode, empname, empage, esalary) VALUES (?,?,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(myQuery); {

			pstmt.setInt(1, 101);
            pstmt.setString(2, "Jenny");
            pstmt.setInt(3, 25);
			pstmt.setInt(4, 10000);
            pstmt.executeUpdate();
			
            pstmt.setInt(1, 102);
            pstmt.setString(2, "Jacky");
            pstmt.setInt(3, 30);
            pstmt.setInt(4, 10000);
            pstmt.executeUpdate();


            pstmt.setInt(1, 102);
            pstmt.setString(2, "Joe");
            pstmt.setInt(3, 20);
            pstmt.setInt(4, 40000);
            pstmt.executeUpdate();


            pstmt.setInt(1, 104);
            pstmt.setString(2, "John");
            pstmt.setInt(3, 40);
			pstmt.setInt(4, 80000);
            pstmt.executeUpdate();
            
            pstmt.setInt(1, 105);
            pstmt.setString(2, "Shameer");
            pstmt.setInt(3, 25);
			pstmt.setInt(4, 90000);
            pstmt.executeUpdate();
		}	
	
	}

}
