package _27857_.payrollmanagement;

public class SalaryStructure extends PayrollPeriod {
    private double basicPay;
    private double transportAllowance;
    private double housingAllowance;

    public SalaryStructure(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail,
                           String deptName, String deptCode, String managerName,
                           int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                           int month, int year, String startDate, String endDate,
                           double basicPay, double transportAllowance, double housingAllowance) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                deptName, deptCode, managerName, employeeID, fullName, position, baseSalary, rssbRegistered,
                month, year, startDate, endDate);
        if (basicPay < 0 || transportAllowance < 0 || housingAllowance < 0) throw new IllegalArgumentException("Error: Salary components must be >= 0.");
        this.basicPay = basicPay;
        this.transportAllowance = transportAllowance;
        this.housingAllowance = housingAllowance;
    }

    public double getBasicPay() { return basicPay; }
    public void setBasicPay(double basicPay) { if (basicPay < 0) throw new IllegalArgumentException("Error: Basic pay must be >= 0."); this.basicPay = basicPay; }

    public double getTransportAllowance() { return transportAllowance; }
    public void setTransportAllowance(double transportAllowance) { if (transportAllowance < 0) throw new IllegalArgumentException("Error: Transport allowance must be >= 0."); this.transportAllowance = transportAllowance; }

    public double getHousingAllowance() { return housingAllowance; }
    public void setHousingAllowance(double housingAllowance) { if (housingAllowance < 0) throw new IllegalArgumentException("Error: Housing allowance must be >= 0."); this.housingAllowance = housingAllowance; }
}

