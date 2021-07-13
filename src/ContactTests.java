import static org.junit.Assert.*;
import org.junit.Test;

import Classes.Contact;
import Classes.PersonalContact;

public class ContactTests {
	
	@Test
	// demo test
	public void test_JUnit() {
        String str1="This is the testcase in this class";
     // assertEquals(String message, long expected, long actual)
        assertEquals("This is the testcase in this class", str1);
    }
	
	@Test
	// test Contact First Name
	public void testContactFirstName() {
		Contact contact = new Contact(1, "First Name", "Last Name", null, null, null, null, null, null);		
		
		assertEquals("Last Name", contact.contactLName);
	}
	
	@Test
	// test Contact City with new value
	public void PersonalContactTestContactCityGetSet()
    {
        Contact contact = new Contact(1, "First Name", "LastName", "Email", "Tel", "Address 1", "Address 2", "City", "Postcode");
        contact.contactCity = "Coventry";
        
        assertEquals("Coventry", contact.contactCity);
    }
	
	@Test
	// test database connection is open
	// needs review!!!
	public void dbConnTestconnOpen()
    {
        dbConn.dbConn mysqlConn;
        mysqlConn = new dbConn.dbConn();
        mysqlConn.Connect();


        assertEquals("True", mysqlConn.Connect());
    }
	

 }
