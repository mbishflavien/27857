package _27857_.procurementmanagement;

public class Organization extends Entity {
    private String orgName;
    private String address;
    private String contactEmail;

    public Organization(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail) {
        super(id, createdDate, updatedDate);
        if(orgName == null || orgName.isEmpty()) throw new IllegalArgumentException("Error: Organization name required");
        if(address == null || address.isEmpty()) throw new IllegalArgumentException("Error: Address required");
        if(contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("Error: Invalid email format");
        this.orgName = orgName;
        this.address = address;
        this.contactEmail = contactEmail;
    }

    public String getOrgName() { return orgName; }
    public void setOrgName(String orgName) { if(orgName == null || orgName.isEmpty()) throw new IllegalArgumentException("Error: Organization name required"); this.orgName = orgName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { if(address == null || address.isEmpty()) throw new IllegalArgumentException("Error: Address required"); this.address = address; }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) { if(contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("Error: Invalid email format"); this.contactEmail = contactEmail; }
}

