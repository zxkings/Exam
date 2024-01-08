package Exam.Exercice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PostgreSQLConnector {
	String psqlUrl = "\"jdbc:postgresql://pg-3ab84368-notesform.a.aivencloud.com:12079/defaultdb?ssl=require&user=avnadmin&password=AVNS_JrAlRj6N77T3MJeB33u\"";

	Connection psqlConn;
	
	public PostgreSQLConnector() throws SQLException {
	    // ... establish connection here ...
	    psqlConn = DriverManager.getConnection(psqlUrl);
	}
	
	public List<Cours> getCourses() throws SQLException {
	    // ... establish connection ...
	    Statement stmt = psqlConn.createStatement();
	    ResultSet rs = stmt.executeQuery("SELECT id, name FROM course");
	    List<Cours> courses = new ArrayList<>();
	    while (rs.next()) {
	        courses.add(new Cours(rs.getInt("id"), rs.getString("name")));
	    }
	    return courses;
	}
	
	

}
