package _27857_.payrollmanagement;

public class PayrollPeriod extends Employee {
    private int month; // 1–12
    private int year;  // >= 2000
    private String startDate;
    private String endDate;

    public PayrollPeriod(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail,
                         String deptName, String deptCode, String managerName,
                         int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                         int month, int year, String startDate, String endDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered);
        if (month < 1 || month > 12) throw new IllegalArgumentException("Error: Month must be 1–12.");
        if (year < 2000) throw new IllegalArgumentException("Error: Year must be >= 2000.");
        if (startDate == null || startDate.isEmpty()) throw new IllegalArgumentException("Error: Start date required.");
        if (endDate == null || endDate.isEmpty()) throw new IllegalArgumentException("Error: End date required.");
        this.month = month;
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getMonth() { return month; }
    public void setMonth(int month) { if (month < 1 || month > 12) throw new IllegalArgumentException("Error: Month must be 1–12."); this.month = month; }

    public int getYear() { return year; }
    public void setYear(int year) { if (year < 2000) throw new IllegalArgumentException("Error: Year must be >= 2000."); this.year = year; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { if (startDate == null || startDate.isEmpty()) throw new IllegalArgumentException("Error: Start date required."); this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { if (endDate == null || endDate.isEmpty()) throw new IllegalArgumentException("Error: End date required."); this.endDate = endDate; }
}

