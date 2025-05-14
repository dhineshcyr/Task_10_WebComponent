package Task_12;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCConnectorClass {

	public static void main(String[] args) {
		
		
String dburl="jdbc:mysql://localhost:3306";
		
		String username="root";
		String password="root";
		
		//establish the connection
		
		try {
			Connection connection= DriverManager.getConnection(dburl, username, password) ;
			
			//perform the operation
			
			String  createDB="create database empledata";
		 String  useDB="use empledata";
		 String createTable="create table  empdata_details(emp_code int,emp_name varchar(20),emp_age int,emp_salary int)";
		
		String  employee1="insert into empdata_details values(101,'Jenny',25,10000)";
		String  employee2="insert into empdata_details values(102,'Jacky',30,20000)";
		String  employee3="insert into empdata_details values(103,'Joe',20,40000)";
		String  employee4="insert into empdata_details values(104,'Jhon',40,80000)";
		String  employee5="insert into empdata_details values(105,'Shameer',25,90000)";
		String select="select*from empdata_details";
		Statement smt=connection.createStatement();
		
		//execute query
		
		smt.execute(createDB);
		smt.execute(useDB);
		smt.execute(createTable);
		smt.execute(employee1);
		smt.execute(employee2);
		smt.execute(employee3);
		smt.execute(employee4);
		smt.execute(employee5);
		ResultSet results=smt.executeQuery(select);
		System.out.println("emp_code"+"   "+"emp_name"+"    "+"emp_age"+"    "+"emp_salary");
		
		//using iteration print the value
		while(results.next()) {
			
			System.out.println(results.getInt("emp_code")+"   "+results.getString("emp_name")+"   "+results.getInt("emp_age")+"   "+results.getInt("emp_salary"));
		}
		//close the connection
		connection.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}


//OuPut
//emp_code   emp_name    emp_age    emp_salary
//101   Jenny   25   10000
//102   Jacky   30   20000
//103   Joe   20   40000
//104   Jhon   40   80000
//105   Shameer   25   90000

