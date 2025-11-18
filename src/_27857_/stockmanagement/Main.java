package _27857_.stockmanagement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("========= STOCK MANAGEMENT SYSTEM =========");


            System.out.print("27857 | Enter ID : ");
            int id = Integer.parseInt(sc.nextLine());

            System.out.print("27857 | Enter Created Date: ");
            String created = sc.nextLine();

            System.out.print("27857 | Enter Updated Date: ");
            String updated = sc.nextLine();

            System.out.print("27857 | Warehouse Name: ");
            String wName = sc.nextLine();

            System.out.print("27857 | Warehouse Location: ");
            String wLocation = sc.nextLine();

            System.out.print("27857 | Warehouse Phone (10 digits): ");
            String wPhone = sc.nextLine();

            System.out.print("27857 | Category Name: ");
            String catName = sc.nextLine();

            System.out.print("27857 | Category Code (≥3 chars): ");
            String catCode = sc.nextLine();

            System.out.print("27857 | Supplier Name: ");
            String sName = sc.nextLine();

            System.out.print("27857 | Supplier Email: ");
            String sEmail = sc.nextLine();

            System.out.print("27857 | Supplier Phone (10 digits): ");
            String sPhone = sc.nextLine();

            System.out.print("27857 | Product Name: ");
            String pName = sc.nextLine();

            System.out.print("27857 | Unit Price (>0): ");
            double price = Double.parseDouble(sc.nextLine());

            System.out.print("27857 | Stock Limit (≥0): ");
            int stockLimit = Integer.parseInt(sc.nextLine());

            System.out.print("27857 | Quantity Available (≥0): ");
            int qty = Integer.parseInt(sc.nextLine());

            System.out.print("27857 | Reorder Level (≥0): ");
            int reorder = Integer.parseInt(sc.nextLine());

            System.out.print("27857 | Purchase Date: ");
            String purchaseDate = sc.nextLine();

            System.out.print("27857 | Purchased Quantity (>0): ");
            int purchasedQty = Integer.parseInt(sc.nextLine());

            System.out.print("27857 | Purchase Supplier Name: ");
            String purchaseSupplier = sc.nextLine();

            System.out.print("27857 | Sale Date: ");
            String saleDate = sc.nextLine();

            System.out.print("27857 | Sold Quantity (>0): ");
            int soldQty = Integer.parseInt(sc.nextLine());

            System.out.print("27857 | Customer Name: ");
            String customer = sc.nextLine();

            System.out.print("27857 | Total Items (≥0): ");
            int totalItems = Integer.parseInt(sc.nextLine());

            System.out.print("27857 | Stock Value (≥0): ");
            double stockValue = Double.parseDouble(sc.nextLine());

            System.out.print("27857 | Report Date: ");
            String reportDate = sc.nextLine();

            System.out.print("27857 | Remarks: ");
            String remarks = sc.nextLine();

            StockReport report = new StockReport(
                    id, created, updated,
                    wName, wLocation, wPhone,
                    catName, catCode,
                    sName, sEmail, sPhone,
                    pName, price, stockLimit,
                    qty, reorder,
                    purchaseDate, purchasedQty, purchaseSupplier,
                    saleDate, soldQty, customer,
                    totalItems, stockValue,
                    reportDate, remarks
            );

            System.out.println("\n\n27857 | Generating report...\n");
            report.generateReport();

        } catch (NumberFormatException nfe) {
            System.out.println(" 27857 | Invalid number input. Error: " + nfe.getMessage());
        } catch (IllegalArgumentException iae) {
            System.out.println(" 27857 | Validation failed: " + iae.getMessage());
        } catch (Exception e) {
            System.out.println("27857 |  Unexpected error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

