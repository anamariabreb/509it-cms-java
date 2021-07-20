package dbConn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Classes.BusinessContact;

public class businessDbConn extends dbConn {
	
	//Insert
	public boolean insertContact(BusinessContact busCon)
	{
		String sql = "INSERT INTO `BusinessContact` " +
	            "(`ID`, "
	            + "`contactFName`, `contactLName`, "
	            + "`contactTel`, `contactBusinessTel`, "
	            + "`contactEmail`, "
	            + "`contactAddr1`, `contactAddr2`, "
	            + "`contactCity`, `contactPostcode`) " +
	            "VALUES " +
	            "(NULL,'" 
	            + busCon.getContactFName() + "','" 
	            + busCon.getContactLName() + "','" 
	            + busCon.getContactTel() + "','" 
	            + busCon.getContactBusinessTel() + "','" 
	            + busCon.getContactEmail() + "','" 
	            + busCon.getContactAddr1() + "','"  
	            + busCon.getContactAddr2() + "','" 
	            + busCon.getContactCity() + "','"  
	            + busCon.getContactPostcode() +"')";


	  Statement stmt = null;
	  try {
	       // set stmt to create statement
	       stmt = conn.createStatement();
	       // executeUpdate() function runs condition like insert, update, delete, drop etc
	       // executeUpdate return 1 if true 0 if false
	       if(stmt.executeUpdate(sql) == 1){
	       // if true show information message
	       System.out.println("Inserted");
	           return true;
	       }
	  } catch(Exception ex) {
	    System.out.println("Error: "+ex);
	  }
	  return false;
	      

	}
	
	//Update
	public boolean updateContact(BusinessContact busCon)
	{
		String sql = "UPDATE BusinessContact SET "
				+ "contactFName = " + "'" + busCon.getContactFName() + "'" + " , " 
				+ "contactLName = " + "'" + busCon.getContactLName() + "'" + " , "
				+ "contactTel = " + busCon.getContactTel() + " , "
				+ "contactBusinessTel = " + busCon.getContactBusinessTel() + " , "
				+ "contactEmail = " + "'" + busCon.getContactEmail() + "'" + " , "
				+ "contactAddr1 = " + "'" + busCon.getContactAddr1() + "'" + " , "
				+ "contactAddr2 = " + "'" + busCon.getContactAddr2() + "'" + " , "
				+ "contactCity = " + "'" + busCon.getContactCity() + "'" + " , "
				+ "contactPostcode = " + "'" + busCon.getContactPostcode() + "'"
				+ " WHERE ID =" + busCon.getID();

		Statement stmt = null;
		try {
		       // set stmt to create statement
		       stmt = conn.createStatement();
		       // executeUpdate() function runs condition like insert, update, delete, drop etc
		       // executeUpdate return 1 if true 0 if false
		       if(stmt.executeUpdate(sql) == 1){
		       // if true show information message
		       System.out.println("Updated");
		           return true;
		       }
		} catch(Exception ex) {
		    System.out.println("Error: "+ex);
		}
		return false;
	}
		
		
	//Delete
	public boolean deleteContact(BusinessContact busCon) 
	{
		int ID = busCon.getID();
		String sql = "DELETE FROM BusinessContact WHERE ID = " + ID;

		Statement stmt = null;
		try {
		    // set stmt to create statement
		    stmt = conn.createStatement();
		    // executeUpdate() function runs condition like insert, update, delete, drop etc
		    // executeUpdate return 1 if true 0 if false
		    if(stmt.executeUpdate(sql) == 1){
		    // if true show information message
		    System.out.println("Deleted");
		        return true;
		    }
		} catch(Exception ex) {
			System.out.println("Error: "+ex);
		}
		return false;
	}
	

	// View
	public ResultSet view()
	{
		ResultSet rs = null;
		PreparedStatement PStatement = null;
		String sql = "";

		sql = "SELECT * FROM BusinessContact ";

		try {
		    PStatement = conn.prepareStatement(sql);
		    rs = PStatement.executeQuery();
	
			} catch(Exception ex) {	
			    System.out.println("Error: "+ex);	
			}	
		return rs;
	}
}
