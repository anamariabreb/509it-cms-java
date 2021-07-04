package dbConn;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Classes.PersonalContact;

public class personalDbConn extends dbConn {

	//Insert
	public boolean insertContact(PersonalContact persCon)
	{
		String sql = "INSERT INTO `PersonalContact` " +
	            "(`ID`, "
	            + "`contactFName`, `contactLName`, "
	            + "`contactTel`, `contactHomeTel`, "
	            + "`contactEmail`, "
	            + "`contactAddr1`, `contactAddr2`, "
	            + "`contactCity`, `contactPostcode`) " +
	            "VALUES " +
	            "(NULL,'" 
	            + persCon.getContactFName() + "','" 
	            + persCon.getContactLName() + "','" 
	            + persCon.getContactTel() + "','" 
	            + persCon.getContactHomeTel() + "','" 
	            + persCon.getContactEmail() + "','" 
	            + persCon.getContactAddr1() + "','"  
	            + persCon.getContactAddr2() + "','" 
	            + persCon.getContactCity() + "','"  
	            + persCon.getContactPostcode() +"')";


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
	public boolean updateContact(PersonalContact persCon) 
	{
		String sql = "UPDATE `PersonalContact` " +
                "SET "
                + "contactFName=@contactFName, "
                + "contactLName=@contactLName, "
                + "contactTel=@contactTel, "
                + "contactHomeTel=@contactHomeTel, "
                + "contactEmail=@contactEmail, " +
                "contactAddr1=@contactAddr1, "
                + "contactAddr2=@contactAddr2, "
                + "contactCity=@contactCity, "
                + "contactPostcode=@contactPostcode " +
                "WHERE ID=@ID;";


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
	public boolean deleteContact(PersonalContact persCon) 
	{
		String sql = "DELETE FROM `PersonalContact` WHERE ID = @ID";


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
	
	//View	
	public ResultSet view()
	{
		ResultSet rs = null;
		PreparedStatement PStatement = null;
		String sql = "";

		sql = "SELECT * FROM PersonalContact ";

		try {
		    PStatement = conn.prepareStatement(sql);
		    rs = PStatement.executeQuery();
	
			} catch(Exception ex) {	
			    System.out.println("Error: "+ex);	
			}	
			return rs;
		}
	}
