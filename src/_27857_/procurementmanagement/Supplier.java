package _27857_.procurementmanagement;

public class Supplier extends Department {
    private String supplierName;
    private String supplierTIN;
    private String contact;

    public Supplier(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                    String deptName, String deptCode, String supplierName, String supplierTIN, String contact) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode);
        if(supplierName == null || supplierName.isEmpty()) throw new IllegalArgumentException("Error: Supplier name required");
        if(supplierTIN == null || !supplierTIN.matches("\\d{9}")) throw new IllegalArgumentException("Error: Supplier TIN must be 9 digits");
        if(contact == null || !contact.matches("\\d{10}")) throw new IllegalArgumentException("Error: Contact must be 10 digits");
        this.supplierName = supplierName;
        this.supplierTIN = supplierTIN;
        this.contact = contact;
    }

    public String getSupplierName() { return supplierName; }
    public void setSupplierName(String supplierName) { if(supplierName == null || supplierName.isEmpty()) throw new IllegalArgumentException("Error: Supplier name required"); this.supplierName = supplierName; }

    public String getSupplierTIN() { return supplierTIN; }
    public void setSupplierTIN(String supplierTIN) { if(supplierTIN == null || !supplierTIN.matches("\\d{9}")) throw new IllegalArgumentException("Error: Supplier TIN must be 9 digits"); this.supplierTIN = supplierTIN; }

    public String getContact() { return contact; }
    public void setContact(String contact) { if(contact == null || !contact.matches("\\d{10}")) throw new IllegalArgumentException("Error: Contact must be 10 digits"); this.contact = contact; }
}
