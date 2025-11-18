package _27857_.attendancemanagement;

public class Department extends Institution {
    private String departmentName;
    private String departmentHead;

    public Department(int id, String createdDate, String updatedDate, String institutionName, String code, String address,
                      String departmentName, String departmentHead) {
        super(id, createdDate, updatedDate, institutionName, code, address);
        if (departmentName == null || departmentName.isEmpty()) throw new IllegalArgumentException("Error: Department name required");
        if (departmentHead == null || departmentHead.isEmpty()) throw new IllegalArgumentException("Error: Department head required");
        this.departmentName = departmentName;
        this.departmentHead = departmentHead;
    }

    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { if (departmentName == null || departmentName.isEmpty()) throw new IllegalArgumentException("Error: Department name required"); this.departmentName = departmentName; }

    public String getDepartmentHead() { return departmentHead; }
    public void setDepartmentHead(String departmentHead) { if (departmentHead == null || departmentHead.isEmpty()) throw new IllegalArgumentException("Error: Department head required"); this.departmentHead = departmentHead; }
}

