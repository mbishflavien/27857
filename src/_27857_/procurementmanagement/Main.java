package _27857_.procurementmanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("--- Enter Entity Details ---");
            System.out.print("27857 | ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("27857 | Created Date: "); String createdDate = sc.nextLine();
            System.out.print("27857 | Updated Date: "); String updatedDate = sc.nextLine();

            System.out.println("--- Enter Organization Details ---");
            System.out.print("27857 | Organization Name: "); String orgName = sc.nextLine();
            System.out.print("27857 | Address: "); String address = sc.nextLine();
            System.out.print("27857 | Contact Email: "); String contactEmail = sc.nextLine();

            System.out.println("--- Enter Department Details ---");
            System.out.print("27857 | Department Name: "); String deptName = sc.nextLine();
            System.out.print("27857 | Department Code: "); String deptCode = sc.nextLine();

            System.out.println("--- Enter Supplier Details ---");
            System.out.print("27857 | Supplier Name: "); String supplierName = sc.nextLine();
            System.out.print("27857 | Supplier TIN: "); String supplierTIN = sc.nextLine();
            System.out.print("27857 | Contact (10 digits): "); String contact = sc.nextLine();

            System.out.println("--- Enter Product Details ---");
            System.out.print("27857 | Product Name: "); String productName = sc.nextLine();
            System.out.print("27857 | Unit Price: "); double unitPrice = sc.nextDouble(); sc.nextLine();
            System.out.print("27857 | Quantity: "); int quantity = sc.nextInt(); sc.nextLine();

            System.out.println("--- Enter PurchaseOrder Details ---");
            System.out.print("27857 | PO Number: "); String poNumber = sc.nextLine();
            System.out.print("27857 | Order Date: "); String orderDate = sc.nextLine();
            System.out.print("27857 | Total Amount: "); double totalAmount = sc.nextDouble(); sc.nextLine();

            System.out.println("--- Enter Delivery Details ---");
            System.out.print("27857 | Delivery Date: "); String deliveryDate = sc.nextLine();
            System.out.print("27857 | Delivered By: "); String deliveredBy = sc.nextLine();

            System.out.println("--- Enter Inspection Details ---");
            System.out.print("27857 | Inspector Name: "); String inspectorName = sc.nextLine();
            System.out.print("27857 | Status (Passed/Failed): "); String status = sc.nextLine();
            System.out.print("27857 | Remarks: "); String remarks = sc.nextLine();

            System.out.println("--- Enter Invoice Details ---");
            System.out.print("27857 | Invoice No: "); String invoiceNo = sc.nextLine();
            System.out.print("27857 | Invoice Amount: "); double invoiceAmount = sc.nextDouble(); sc.nextLine();

            System.out.println("--- Enter ProcurementReport Details ---");
            System.out.print("27857 | Report Date: "); String reportDate = sc.nextLine();
            System.out.print("27857 | Summary: "); String summary = sc.nextLine();

            ProcurementReport report = new ProcurementReport(id, createdDate, updatedDate, orgName, address, contactEmail,
                    deptName, deptCode, supplierName, supplierTIN, contact,
                    productName, unitPrice, quantity,
                    poNumber, orderDate, totalAmount,
                    deliveryDate, deliveredBy,
                    inspectorName, status, remarks,
                    invoiceNo, invoiceAmount,
                    reportDate, summary);

            System.out.println("\n--- Procurement Report Summary ---");
            System.out.println("27857 | Organization: " + report.getOrgName() + ", Supplier: " + report.getSupplierName());
            System.out.println("27857 | Invoice Amount: $" + report.getInvoiceAmount());
            System.out.println("27857 | Total Amount: $" + report.getTotal());
            System.out.println("27857 | Report Summary: " + report.getSummary());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("27857 | Error: Invalid input.");
        } finally {
            sc.close();
        }
    }
}

