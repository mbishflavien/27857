package _27857_.procurementmanagement;

public final class ProcurementReport extends Invoice {
    private String reportDate;
    private String summary;
    private double total;

    public ProcurementReport(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                             String deptName, String deptCode, String supplierName, String supplierTIN, String contact,
                             String productName, double unitPrice, int quantity,
                             String poNumber, String orderDate, double totalAmount,
                             String deliveryDate, String deliveredBy,
                             String inspectorName, String status, String remarks,
                             String invoiceNo, double invoiceAmount,
                             String reportDate, String summary) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks,
                invoiceNo, invoiceAmount);
        if(reportDate == null || reportDate.isEmpty()) throw new IllegalArgumentException("Error: Report date required");
        this.reportDate = reportDate;
        this.summary = summary;
        this.total = calculateTotal();
    }

    public String getReportDate() { return reportDate; }
    public void setReportDate(String reportDate) { if(reportDate == null || reportDate.isEmpty()) throw new IllegalArgumentException("Error: Report date required"); this.reportDate = reportDate; }

    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public double getTotal() { return total; }

    public double calculateTotal() {
        return getInvoiceAmount();
    }
}

