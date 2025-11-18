package _27857_.payrollmanagement;

public class Employee extends Department {
    private int employeeID;
    private String fullName;
    private String position;
    private double baseSalary;
    private boolean rssbRegistered;

    public Employee(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail,
                    String deptName, String deptCode, String managerName,
                    int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName);
        if (employeeID < 1000) throw new IllegalArgumentException("Error: Employee ID must be ≥ 1000.");
        if (fullName == null || fullName.isEmpty()) throw new IllegalArgumentException("Error: Full name required.");
        if (position == null || position.isEmpty()) throw new IllegalArgumentException("Error: Position required.");
        if (baseSalary <= 0) throw new IllegalArgumentException("Error: Base salary must be > 0.");
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.position = position;
        this.baseSalary = baseSalary;
        this.rssbRegistered = rssbRegistered;
    }

    public int getEmployeeID() { return employeeID; }
    public void setEmployeeID(int employeeID) { if (employeeID < 1000) throw new IllegalArgumentException("Error: Employee ID must be ≥ 1000."); this.employeeID = employeeID; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { if (fullName == null || fullName.isEmpty()) throw new IllegalArgumentException("Error: Full name required."); this.fullName = fullName; }

    public String getPosition() { return position; }
    public void setPosition(String position) { if (position == null || position.isEmpty()) throw new IllegalArgumentException("Error: Position required."); this.position = position; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { if (baseSalary <= 0) throw new IllegalArgumentException("Error: Base salary must be > 0."); this.baseSalary = baseSalary; }

    public boolean isRssbRegistered() { return rssbRegistered; }
    public void setRssbRegistered(boolean rssbRegistered) { this.rssbRegistered = rssbRegistered; }
}

