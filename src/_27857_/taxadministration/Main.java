package _27857_.taxadministration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("--- Enter Entity Details ---");
            System.out.print("27857 | ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("27857 | Created Date: "); String createdDate = sc.nextLine();
            System.out.print("27857 | Updated Date: "); String updatedDate = sc.nextLine();

            System.out.println("--- Enter TaxAuthority Details ---");
            System.out.print("27857 | Authority Name: "); String authorityName = sc.nextLine();
            System.out.print("27857 | Region: "); String region = sc.nextLine();
            System.out.print("27857 | Email: "); String email = sc.nextLine();

            System.out.println("--- Enter TaxCategory Details ---");
            System.out.print("27857 | Category Name: "); String categoryName = sc.nextLine();
            System.out.print("27857 | Rate: "); double rate = sc.nextDouble(); sc.nextLine();
            System.out.print("27857 | Code: "); String code = sc.nextLine();

            System.out.println("--- Enter Taxpayer Details ---");
            System.out.print("27857 | TIN: "); String tin = sc.nextLine();
            System.out.print("27857 | Taxpayer Name: "); String taxpayerName = sc.nextLine();
            System.out.print("27857 | Address: "); String address = sc.nextLine();

            System.out.println("--- Enter Employer Details ---");
            System.out.print("27857 | Employer Name: "); String employerName = sc.nextLine();
            System.out.print("27857 | Employer TIN: "); String employerTIN = sc.nextLine();
            System.out.print("27857 | Contact (10 digits): "); String contact = sc.nextLine();

            System.out.println("--- Enter Employee Details ---");
            System.out.print("27857 | Employee Name: "); String employeeName = sc.nextLine();
            System.out.print("27857 | Salary: "); double salary = sc.nextDouble(); sc.nextLine();
            System.out.print("27857 | Employee TIN: "); String employeeTIN = sc.nextLine();

            System.out.println("--- Enter TaxDeclaration Details ---");
            System.out.print("27857 | Declaration Month: "); String declarationMonth = sc.nextLine();
            System.out.print("27857 | Total Income: "); double totalIncome = sc.nextDouble(); sc.nextLine();

            System.out.println("--- Enter TaxAssessment Details ---");
            System.out.print("27857 | Assessment Date: "); String assessmentDate = sc.nextLine();
            System.out.print("27857 | Assessed Tax: "); double assessedTax = sc.nextDouble(); sc.nextLine();

            System.out.println("--- Enter Payment Details ---");
            System.out.print("27857 | Payment Date: "); String paymentDate = sc.nextLine();
            System.out.print("27857 | Payment Amount: "); double paymentAmount = sc.nextDouble(); sc.nextLine();

            System.out.println("--- Enter TaxRecord Details ---");
            System.out.print("27857 | Receipt No: "); String receiptNo = sc.nextLine();

            TaxRecord record = new TaxRecord(id, createdDate, updatedDate, authorityName, region, email,
                    categoryName, rate, code, tin, taxpayerName, address,
                    employerName, employerTIN, contact, employeeName, salary, employeeTIN,
                    declarationMonth, totalIncome, assessmentDate, assessedTax,
                    paymentDate, paymentAmount, receiptNo);

            System.out.println("\n--- Tax Record Summary ---");
            System.out.println("27857 | Taxpayer: " + record.getTaxpayerName() + ", Employee: " + record.getEmployeeName());
            System.out.println("27857 | Total Tax Payable: $" + record.getTotalTax());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("27857 | Error: Invalid input.");
        } finally {
            sc.close();
        }
    }
}

