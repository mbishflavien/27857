package _27857_.payrollmanagement;

public class Department extends Organization {
    private String deptName;
    private String deptCode;
    private String managerName;

    public Department(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail,
                      String deptName, String deptCode, String managerName) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail);
        if (deptName == null || deptName.isEmpty()) throw new IllegalArgumentException("Error: Department name required.");
        if (deptCode == null || deptCode.length() < 3) throw new IllegalArgumentException("Error: Department code must be at least 3 characters.");
        if (managerName == null || managerName.isEmpty()) throw new IllegalArgumentException("Error: Manager name required.");
        this.deptName = deptName;
        this.deptCode = deptCode;
        this.managerName = managerName;
    }

    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { if (deptName == null || deptName.isEmpty()) throw new IllegalArgumentException("Error: Department name required."); this.deptName = deptName; }

    public String getDeptCode() { return deptCode; }
    public void setDeptCode(String deptCode) { if (deptCode == null || deptCode.length() < 3) throw new IllegalArgumentException("Error: Department code must be at least 3 characters."); this.deptCode = deptCode; }

    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) { if (managerName == null || managerName.isEmpty()) throw new IllegalArgumentException("Error: Manager name required."); this.managerName = managerName; }
}

