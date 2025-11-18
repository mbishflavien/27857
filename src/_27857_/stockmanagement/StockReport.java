package _27857_.stockmanagement;

public final class StockReport extends Inventory {
    private String reportDate;
    private String remarks;

    public StockReport(int id, String created, String updated,
                       String wName, String loc, String phone,
                       String cName, String cCode,
                       String supName, String email, String supPhone,
                       String productName, double unitPrice, int stockLimit,
                       int qty, int reorder,
                       String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                       String saleDate, int soldQuantity, String customerName,
                       int totalItems, double stockValue,
                       String reportDate, String remarks) {

        super(id, created, updated,
                wName, loc, phone,
                cName, cCode,
                supName, email, supPhone,
                productName, unitPrice, stockLimit,
                qty, reorder,
                purchaseDate, purchasedQuantity, purchaseSupplierName,
                saleDate, soldQuantity, customerName,
                totalItems, stockValue);

        if (reportDate == null) throw new IllegalArgumentException("Report date cannot be null");
        this.reportDate = reportDate;
        this.remarks = (remarks == null ? "" : remarks);
    }

    // Getters & Setters
    public String getReportDate() { return reportDate; }
    public void setReportDate(String reportDate) {
        if (reportDate != null) this.reportDate = reportDate;
    }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) {
        if (remarks != null) this.remarks = remarks;
    }

    // generateReport summarizes totals and sales info available through getters
    public void generateReport() {
        System.out.println("====== STOCK REPORT ======");
        System.out.println("Report Date   : " + getReportDate());
        System.out.println("Total Items   : " + getTotalItems());
        System.out.println("Stock Value   : " + getStockValue());
        System.out.println("Sold Quantity : " + getSoldQuantity());
        System.out.println("Sale Date     : " + getSaleDate());
        System.out.println("Remarks       : " + getRemarks());
        System.out.println("==========================");
    }
}

