package dbConn;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConn {

	String connString = "jdbc:mysql://dbs509.cfaunfdahawv.us-east-1.rds.amazonaws.com/contactDB";

    String username = "admin";

    String password = "database509";

    Connection conn = null;   

    public Connection Connect(){

       

         // Provide a try and catch exception

        try {

             // Connect to mysql library

            Class.forName("com.mysql.jdbc.Driver");

             // jdbc:mysql://hostname:port/databasename, server username, server password

            conn = DriverManager.getConnection(connString,username,password);

            System.out.println("Connected");

            return conn;

           

        }catch(Exception ex) {

             // If connection fail

            System.out.println("Error: " + ex);

            return null;

        }


 

    }
}
