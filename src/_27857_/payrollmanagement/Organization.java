package _27857_.payrollmanagement;

public class Organization extends Entity {
    private String orgName;
    private String orgCode;
    private String rssbNumber;
    private String contactEmail;

    public Organization(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail) {
        super(id, createdDate, updatedDate);
        if (orgName == null || orgName.isEmpty()) throw new IllegalArgumentException("Error: Organization name required.");
        if (orgCode == null || orgCode.length() < 3) throw new IllegalArgumentException("Error: Org code must be at least 3 characters.");
        if (rssbNumber == null || !rssbNumber.matches("\\d{8}")) throw new IllegalArgumentException("Error: RSSB number must be 8 digits.");
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("Error: Invalid email format.");
        this.orgName = orgName;
        this.orgCode = orgCode;
        this.rssbNumber = rssbNumber;
        this.contactEmail = contactEmail;
    }

    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) { if (orgName == null || orgName.isEmpty()) throw new IllegalArgumentException("Error: Organization name required."); this.orgName = orgName; }

    public String getOrgCode() { return orgCode; }
    public void setOrgCode(String orgCode) { if (orgCode == null || orgCode.length() < 3) throw new IllegalArgumentException("Error: Org code must be at least 3 characters."); this.orgCode = orgCode; }

    public String getRssbNumber() { return rssbNumber; }
    public void setRssbNumber(String rssbNumber) { if (rssbNumber == null || !rssbNumber.matches("\\d{8}")) throw new IllegalArgumentException("Error: RSSB number must be 8 digits."); this.rssbNumber = rssbNumber; }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) { if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("Error: Invalid email format."); this.contactEmail = contactEmail; }
}
