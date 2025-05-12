package Task_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class JDBCConnectorClass {

	public static void main(String[] args) {
		
		 String db_url="jdbc:mysql://new connection:3306";
		String username="root";
		String password="root";
		
		 //establish the connection
		try {
			Class.forName( "jdbc:mysql://new connection:3306");
			Connection connection = DriverManager.getConnection(db_url, username, password);
			System.out.println("Connected to database!");
			String createDB = "create database JDBC_guvitask";
			String useDB = "use JDBC_guvitask";
			String createTable="create table Employee_details(empcode int, empname varchar(20), empage int , esalary decimal(10,10))";
	        String	 insertValue= "insert into JDBC_guvitask values( 101,'Jenny',25,'10000'),( 102,'Jacky',30,'20000'),( 103,'Joe',20,'40000'),( 104,'John',40,'80000'),( 105,'Shameer',25,'90000')";
	        
		    String select="Select * from Employee_details";
		    java.sql.Statement  sst = connection.createStatement();
		    String sql= "SELECT * FROM users";
		    ResultSet rs= ((java.sql.Statement) sst).executeQuery(sql);
		    while (rs.next()) {
                System.out.println("empcode: " + rs.getInt("empcode") + ", empname: " + rs.getString("empname"));
            }
            
            // Close the connection
           rs.close();
            sst.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
	}



