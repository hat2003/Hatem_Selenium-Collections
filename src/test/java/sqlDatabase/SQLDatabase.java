package sqlDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDatabase {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		String dbUrl = "";
		String username = "";
		String password = "";
		String query = "select *  from employee;";
		
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl,username,password);
		
		//Create Statement Object		
 	   Statement stmt = con.createStatement();					

			// Execute the SQL Query. Store results in ResultSet		
  		ResultSet rs= stmt.executeQuery(query);							
  		
  		// While Loop to iterate through all data and print results		
			while (rs.next()){
		        	String myName = rs.getString("firstName");								        
                    String myAge = rs.getString("myAge");					                               
                    
                    System. out.println(myName+"  "+myAge);		
             }		
				
			con.close();			
	}
	

}


