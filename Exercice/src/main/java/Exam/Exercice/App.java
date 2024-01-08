package Exam.Exercice;

import java.sql.SQLException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	MySQLConnector mysqlConnector = new MySQLConnector();
        	PostgreSQLConnector psqlConnector = new PostgreSQLConnector();
        	List<Cours> courses = psqlConnector.getCourses();
        	mysqlConnector.insertCourses(courses);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
    }
}
