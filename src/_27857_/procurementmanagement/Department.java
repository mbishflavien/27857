package _27857_.procurementmanagement;

public class Department extends Organization {
    private String deptName;
    private String deptCode;

    public Department(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                      String deptName, String deptCode) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail);
        if(deptName == null || deptName.isEmpty()) throw new IllegalArgumentException("Error: Department name required");
        if(deptCode == null || deptCode.length() < 3) throw new IllegalArgumentException("Error: Department code must be ≥ 3 characters");
        this.deptName = deptName;
        this.deptCode = deptCode;
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { if(deptName == null || deptName.isEmpty()) throw new IllegalArgumentException("Error: Department name required"); this.deptName = deptName; }

    public String getDeptCode() { return deptCode; }
    public void setDeptCode(String deptCode) { if(deptCode == null || deptCode.length() < 3) throw new IllegalArgumentException("Error: Department code must be ≥ 3 characters"); this.deptCode = deptCode; }
}

