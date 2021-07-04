package Classes;

public class BusinessContact extends Contact {
	public BusinessContact() {
		super();
	}

	public BusinessContact(
			int iD, 
			String contactFName, String contactLName, 
			String contactTel, String contactBusinessTel, 
			String contactEmail,
			String contactAddr1, String contactAddr2, 
			String contactCity, String contactPostcode) {
		super(iD, contactFName, contactLName, contactTel, contactEmail, 
				contactAddr1, contactAddr2, contactCity, contactPostcode);
		// TODO Auto-generated constructor stub
		this.contactBusinessTel = contactBusinessTel;
	}
	
	public String getContactBusinessTel() {
		return contactBusinessTel;
	}

	public void setContactBusinessTel(String contactBusinessTel) {
		this.contactBusinessTel = contactBusinessTel;
	}

	private String contactBusinessTel;
}
