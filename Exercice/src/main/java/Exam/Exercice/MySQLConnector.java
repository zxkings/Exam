package Exam.Exercice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MySQLConnector {
	String mysqlUrl = "jdbc:mysql://mysql-13df92fd-notesform.a.aivencloud.com:12079/defaultdb?sslmode=require";
	String mysqlUser = "avnadmin";
	String mysqlPassword = "AVNS_j_ybT0OiMhm0R-roIIz";

	Connection mysqlConn;
	
	public MySQLConnector() throws SQLException {
	    // ... establish connection here ...
	    mysqlConn = DriverManager.getConnection(mysqlUrl, mysqlUser, mysqlPassword);
	}
	
	public void insertCourses(List<Cours> courses) throws SQLException {
	    // ... establish connection ...
	    PreparedStatement stmt = mysqlConn.prepareStatement("INSERT INTO student (course) VALUES (?)");
	    for (Cours course : courses) {
	        stmt.setString(1, course.getName());
	        stmt.executeUpdate();
	    }
	}

	
}
