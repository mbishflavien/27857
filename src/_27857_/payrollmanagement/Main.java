package _27857_.payrollmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("--- Entity & Organization ---");
            System.out.print("27857 | ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("27857 | Created Date: "); String createdDate = sc.nextLine();
            System.out.print("27857 | Updated Date: "); String updatedDate = sc.nextLine();
            System.out.print("27857 | Organization Name: "); String orgName = sc.nextLine();
            System.out.print("27857 | Org Code: "); String orgCode = sc.nextLine();
            System.out.print("27857 | RSSB Number (8 digits): "); String rssbNumber = sc.nextLine();
            System.out.print("27857 | Contact Email: "); String contactEmail = sc.nextLine();

            System.out.println("--- Department ---");
            System.out.print("27857 | Department Name: "); String deptName = sc.nextLine();
            System.out.print("27857 | Department Code: "); String deptCode = sc.nextLine();
            System.out.print("27857 | Manager Name: "); String managerName = sc.nextLine();

            System.out.println("--- Employee ---");
            System.out.print("27857 | Employee ID (>=1000): "); int empID = sc.nextInt(); sc.nextLine();
            System.out.print("27857 | Full Name: "); String fullName = sc.nextLine();
            System.out.print("27857 | Position: "); String position = sc.nextLine();
            System.out.print("27857 | Base Salary: "); double baseSalary = sc.nextDouble(); sc.nextLine();
            System.out.print("27857 | RSSB Registered (true/false): "); boolean rssbRegistered = sc.nextBoolean(); sc.nextLine();

            System.out.println("--- Payroll Period ---");
            System.out.print("27857 | Month (1–12): "); int month = sc.nextInt(); sc.nextLine();
            System.out.print("27857 | Year (>=2000): "); int year = sc.nextInt(); sc.nextLine();
            System.out.print("27857 | Start Date: "); String startDate = sc.nextLine();
            System.out.print("27857 | End Date: "); String endDate = sc.nextLine();

            System.out.println("--- Salary Structure ---");
            System.out.print("27857 | Basic Pay: "); double basicPay = sc.nextDouble(); sc.nextLine();
            System.out.print("27857 | Transport Allowance: "); double transport = sc.nextDouble(); sc.nextLine();
            System.out.print("27857 | Housing Allowance: "); double housing = sc.nextDouble(); sc.nextLine();

            System.out.println("--- Deductions ---");
            System.out.print("27857 | PAYE Tax: "); double paye = sc.nextDouble(); sc.nextLine();
            System.out.print("27857 | Loan Deduction: "); double loan = sc.nextDouble(); sc.nextLine();

            System.out.println("--- Allowances ---");
            System.out.print("27857 | Overtime Hours: "); double overtimeHours = sc.nextDouble(); sc.nextLine();
            System.out.print("27857 | Overtime Rate: "); double overtimeRate = sc.nextDouble(); sc.nextLine();
            System.out.print("27857 | Bonus: "); double bonus = sc.nextDouble(); sc.nextLine();

            System.out.println("--- Payslip ---");
            System.out.print("27857 | Payslip Number: "); String payslipNumber = sc.nextLine();
            System.out.print("27857 | Issue Date: "); String issueDate = sc.nextLine();

            Payslip payslip = new Payslip(id, createdDate, updatedDate, orgName, orgCode, rssbNumber, contactEmail,
                    deptName, deptCode, managerName, empID, fullName, position, baseSalary, rssbRegistered,
                    month, year, startDate, endDate, basicPay, transport, housing, paye, loan,
                    overtimeHours, overtimeRate, bonus, payslipNumber, issueDate);

            payslip.generatePayslip();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("27857 | Error: Invalid input.");
        } finally {
            sc.close();
        }
    }
}
