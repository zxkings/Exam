package Exam.Exercice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnector {
	String mysqlUrl = "jdbc:mysql://mysql-13df92fd-notesform.a.aivencloud.com:12079/defaultdb?sslmode=require";
	String mysqlUser = "avnadmin";
	String mysqlPassword = "AVNS_j_ybT0OiMhm0R-roIIz";

	Connection mysqlConn;
	
	public MySQLConnector() throws SQLException {
	    // ... establish connection here ...
	    mysqlConn = DriverManager.getConnection(mysqlUrl, mysqlUser, mysqlPassword);
	}
	
}
