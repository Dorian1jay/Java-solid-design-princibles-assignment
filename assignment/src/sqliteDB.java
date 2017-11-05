import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class sqliteDB 
{
	
	
	static Connection con = null;
	Statement stmt = null;
	PreparedStatement preparedStmt = null;
	static Object rs = null;
	
	sqliteDB()
	// try connecting to DB
	{
		try
		{
			Class.forName("org.sqlite.JDBC");
			con = DriverManager.getConnection("jdbc:sqlite:assignmentDB.sqlite");
			System.out.println("Connected to DB");
			
						
			
		}catch(Exception e)
		{
		System.out.println("Error" + e.getMessage());
			
		}
		
		;
		
	}
	
	public void insertGE(General_employee ge)
	//general employee insert
	{
		
		try
		{
			preparedStmt = con.prepareStatement("INSERT INTO AttendTable (firstName, lastName, email," +
			 		"mobileNo , DOB, salery, jobTitle)"+ "VALUES (?,?,?,?,?,?,?)");
			
			
			preparedStmt.setString (1, ge.getFirstName());
	        preparedStmt.setString (2, ge.getLastName());
		    preparedStmt.setString (3, ge.getEmail());
		    preparedStmt.setString (4, ge.getMobileNo());
		    preparedStmt.setString (5, ge.getDOB());
		    preparedStmt.setString (6, ge.getSalery());
		    preparedStmt.setString (7, ge.getJobTitle());
		    
		    
		    rs = preparedStmt.executeUpdate();
		    
		    
		}
		
		catch(SQLException e)
		{
		System.out.println("Error" + e.getMessage());
			
		}
		
		
	}
	public void insertGU(guest g)
	// guest insert
	{
		
		try
		{
			preparedStmt = con.prepareStatement("INSERT INTO AttendTable (firstName, lastName, email," +
			 		"mobileNo , contact, company)"+ "VALUES (?,?,?,?,?,?)");
			
			
			preparedStmt.setString (1, g.getFirstName());
	        preparedStmt.setString (2, g.getLastName());
		    preparedStmt.setString (3, g.getEmail());
		    preparedStmt.setString (4, g.getMobileNo());
		    preparedStmt.setString (5, g.getContact());
		    preparedStmt.setString (6, g.getCompany());
		    
		    
		    
		    rs = preparedStmt.executeUpdate();
		    
		    
		}
		
		catch(SQLException e)
		{
		System.out.println("Error" + e.getMessage());
			
		}
		
		
	}
	
	
	public void insertCON(Contractor c)
	//  contractor  insert
	{
		
		try
		{
			preparedStmt = con.prepareStatement("INSERT INTO AttendTable (firstName, lastName, email," +
			 		"mobileNo ,DOB, contact, company)"+ "VALUES (?,?,?,?,?,?,?)");
			
			
			preparedStmt.setString (1, c.getFirstName());
	        preparedStmt.setString (2, c.getLastName());
		    preparedStmt.setString (3, c.getEmail());
		    preparedStmt.setString (4, c.getMobileNo());
		    preparedStmt.setString (5, c.getDOB());
		    preparedStmt.setString (6, c.getContact());
		    preparedStmt.setString (7, c.getCompany());
		    
		    
		    
		    rs = preparedStmt.executeUpdate();
		    
		    
		}
		
		catch(SQLException e)
		{
		System.out.println("Error" + e.getMessage());
			
		}
		
		
	}

	
	
	
	
	public void close()
	{
		try
		{
			con.close();
					
		}catch(Exception e)
		{
			System.out.println("Error" + e.getMessage());
		}
		
		
	}



}
