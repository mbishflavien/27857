package _27857_.attendancemanagement;

public class Institution extends Entity {
    private String institutionName;
    private String code;
    private String address;

    public Institution(int id, String createdDate, String updatedDate, String institutionName, String code, String address) {
        super(id, createdDate, updatedDate);
        if (institutionName == null || institutionName.isEmpty()) throw new IllegalArgumentException("Error: Institution name required");
        if (code == null || code.length() < 3) throw new IllegalArgumentException("Error: Code must be ≥ 3 characters");
        if (address == null || address.isEmpty()) throw new IllegalArgumentException("Error: Address required");
        this.institutionName = institutionName;
        this.code = code;
        this.address = address;
    }

    public String getInstitutionName() { return institutionName; }
    public void setInstitutionName(String institutionName) { if (institutionName == null || institutionName.isEmpty()) throw new IllegalArgumentException("Error: Institution name required"); this.institutionName = institutionName; }

    public String getCode() { return code; }
    public void setCode(String code) { if (code == null || code.length() < 3) throw new IllegalArgumentException("Error: Code must be ≥ 3 characters"); this.code = code; }

    public String getAddress() { return address; }
    public void setAddress(String address) { if (address == null || address.isEmpty()) throw new IllegalArgumentException("Error: Address required"); this.address = address; }
}
