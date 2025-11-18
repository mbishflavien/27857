package _27857_.procurementmanagement;

public class Invoice extends Inspection {
    private String invoiceNo;
    private double invoiceAmount;

    public Invoice(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                   String deptName, String deptCode, String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity,
                   String poNumber, String orderDate, double totalAmount,
                   String deliveryDate, String deliveredBy,
                   String inspectorName, String status, String remarks,
                   String invoiceNo, double invoiceAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount, deliveryDate, deliveredBy, inspectorName, status, remarks);
        if(invoiceNo == null || invoiceNo.isEmpty()) throw new IllegalArgumentException("Error: Invoice number required");
        if(invoiceAmount <= 0) throw new IllegalArgumentException("Error: Invoice amount must be > 0");
        this.invoiceNo = invoiceNo;
        this.invoiceAmount = invoiceAmount;
    }

    public String getInvoiceNo() { return invoiceNo; }
    public void setInvoiceNo(String invoiceNo) { if(invoiceNo == null || invoiceNo.isEmpty()) throw new IllegalArgumentException("Error: Invoice number required"); this.invoiceNo = invoiceNo; }

    public double getInvoiceAmount() { return invoiceAmount; }
    public void setInvoiceAmount(double invoiceAmount) { if(invoiceAmount <= 0) throw new IllegalArgumentException("Error: Invoice amount must be > 0"); this.invoiceAmount = invoiceAmount; }
}

