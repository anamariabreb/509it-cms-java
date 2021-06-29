package Classes;

public class Contact {
	
	public Contact() {
		super();
	}

    private int ID;
    private String contactFName;
    public int getID() {
		return ID;
	}
	/**
	 * @param iD
	 * @param contactFName
	 * @param contactLName
	 * @param contactTel
	 * @param contactEmail
	 * @param contactAddr1
	 * @param contactAddr2
	 * @param contactCity
	 * @param contactPostcode
	 */
	public Contact(int iD, String contactFName, String contactLName, String contactTel, String contactEmail,
			String contactAddr1, String contactAddr2, String contactCity, String contactPostcode) {
		super();
		ID = iD;
		this.contactFName = contactFName;
		this.contactLName = contactLName;
		this.contactTel = contactTel;
		this.contactEmail = contactEmail;
		this.contactAddr1 = contactAddr1;
		this.contactAddr2 = contactAddr2;
		this.contactCity = contactCity;
		this.contactPostcode = contactPostcode;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getContactFName() {
		return contactFName;
	}
	public void setContactFName(String contactFName) {
		this.contactFName = contactFName;
	}
	public String getContactLName() {
		return contactLName;
	}
	public void setContactLName(String contactLName) {
		this.contactLName = contactLName;
	}
	public String getContactTel() {
		return contactTel;
	}
	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	public String getContactAddr1() {
		return contactAddr1;
	}
	public void setContactAddr1(String contactAddr1) {
		this.contactAddr1 = contactAddr1;
	}
	public String getContactAddr2() {
		return contactAddr2;
	}
	public void setContactAddr2(String contactAddr2) {
		this.contactAddr2 = contactAddr2;
	}
	public String getContactCity() {
		return contactCity;
	}
	public void setContactCity(String contactCity) {
		this.contactCity = contactCity;
	}
	public String getContactPostcode() {
		return contactPostcode;
	}
	public void setContactPostcode(String contactPostcode) {
		this.contactPostcode = contactPostcode;
	}
	private String contactLName;
    private String contactTel;
    private String contactEmail;
    private String contactAddr1;
    private String contactAddr2;
    private String contactCity;
    private String contactPostcode;
}
