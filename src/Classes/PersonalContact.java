package Classes;

public class PersonalContact extends Contact {
	public PersonalContact() {
		super();
	}
	
	public PersonalContact(int iD, String contactFName, String contactLName, String contactTel, String contactHomeTel, String contactEmail,
			String contactAddr1, String contactAddr2, String contactCity, String contactPostcode) {
		super(iD, contactFName, contactLName, contactTel, contactEmail, contactAddr1, contactAddr2, contactCity,
				contactPostcode);
		// TODO Auto-generated constructor stub
		this.contactHomeTel = contactHomeTel;
	}

	public String getContactHomeTel() {
		return contactHomeTel;
	}

	public void setContactHomeTel(String contactHomeTel) {
		this.contactHomeTel = contactHomeTel;
	}

	private String contactHomeTel;
}
