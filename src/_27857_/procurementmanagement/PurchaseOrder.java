package _27857_.procurementmanagement;

public class PurchaseOrder extends Product {
    private String poNumber;
    private String orderDate;
    private double totalAmount;

    public PurchaseOrder(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                         String deptName, String deptCode, String supplierName, String supplierTIN, String contact,
                         String productName, double unitPrice, int quantity,
                         String poNumber, String orderDate, double totalAmount) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity);
        if(poNumber == null || poNumber.isEmpty()) throw new IllegalArgumentException("Error: PO number required");
        if(orderDate == null || orderDate.isEmpty()) throw new IllegalArgumentException("Error: Order date required");
        if(totalAmount <= 0) throw new IllegalArgumentException("Error: Total amount must be > 0");
        this.poNumber = poNumber;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public String getPoNumber() { return poNumber; }
    public void setPoNumber(String poNumber) { if(poNumber == null || poNumber.isEmpty()) throw new IllegalArgumentException("Error: PO number required"); this.poNumber = poNumber; }

    public String getOrderDate() { return orderDate; }
    public void setOrderDate(String orderDate) { if(orderDate == null || orderDate.isEmpty()) throw new IllegalArgumentException("Error: Order date required"); this.orderDate = orderDate; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { if(totalAmount <= 0) throw new IllegalArgumentException("Error: Total amount must be > 0"); this.totalAmount = totalAmount; }
}

