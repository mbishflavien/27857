package _27857_.payrollmanagement;

public final class Payslip extends Payroll {
    private String payslipNumber;
    private String issueDate;

    public Payslip(int id, String createdDate, String updatedDate, String orgName, String orgCode, String rssbNumber, String contactEmail,
                   String deptName, String deptCode, String managerName,
                   int employeeID, String fullName, String position, double baseSalary, boolean rssbRegistered,
                   int month, int year, String startDate, String endDate,
                   double basicPay, double transportAllowance, double housingAllowance,
                   double payeTax, double loanDeduction,
                   double overtimeHours, double overtimeRate, double bonus,
                   String payslipNumber, String issueDate) {
        super(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail, deptName, deptCode, managerName,
                employeeID, fullName, position, baseSalary, rssbRegistered, month, year, startDate, endDate,
                basicPay, transportAllowance, housingAllowance, payeTax, loanDeduction, overtimeHours, overtimeRate, bonus);
        if (payslipNumber == null || payslipNumber.isEmpty()) throw new IllegalArgumentException("Error: Payslip number required.");
        if (issueDate == null || issueDate.isEmpty()) throw new IllegalArgumentException("Error: Issue date required.");
        this.payslipNumber = payslipNumber;
        this.issueDate = issueDate;
    }

    public String getPayslipNumber() { return payslipNumber; }
    public String getIssueDate() { return issueDate; }

    public void generatePayslip() {
        System.out.println("----- PAYSLIP -----");
        System.out.println("Payslip No: " + payslipNumber);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Employee: " + getFullName() + " (" + getEmployeeID() + ")");
        System.out.println("Position: " + getPosition());
        System.out.println("Basic Pay: " + getBasicPay());
        System.out.println("Transport Allowance: " + getTransportAllowance());
        System.out.println("Housing Allowance: " + getHousingAllowance());
        System.out.println("Overtime: " + (getOvertimeHours() * getOvertimeRate()));
        System.out.println("Bonus: " + getBonus());
        System.out.println("Gross Salary: " + getGrossSalary());
        System.out.println("RSSB Contribution: " + getRssbContribution());
        System.out.println("PAYE Tax: " + getPayeTax());
        System.out.println("Loan Deduction: " + getLoanDeduction());
        System.out.println("Total Deductions: " + getTotalDeductions());
        System.out.println("Net Salary: " + getNetSalary());
        System.out.println("------------------");
    }
}

