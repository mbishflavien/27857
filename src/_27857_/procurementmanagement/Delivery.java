package _27857_.procurementmanagement;

public class Delivery extends PurchaseOrder {
    private String deliveryDate;
    private String deliveredBy;

    public Delivery(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                    String deptName, String deptCode, String supplierName, String supplierTIN, String contact,
                    String productName, double unitPrice, int quantity,
                    String poNumber, String orderDate, double totalAmount,
                    String deliveryDate, String deliveredBy) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact,
                productName, unitPrice, quantity, poNumber, orderDate, totalAmount);
        if(deliveryDate == null || deliveryDate.isEmpty()) throw new IllegalArgumentException("Error: Delivery date required");
        if(deliveredBy == null || deliveredBy.isEmpty()) throw new IllegalArgumentException("Error: Delivered by required");
        this.deliveryDate = deliveryDate;
        this.deliveredBy = deliveredBy;
    }

    public String getDeliveryDate() { return deliveryDate; }
    public void setDeliveryDate(String deliveryDate) { if(deliveryDate == null || deliveryDate.isEmpty()) throw new IllegalArgumentException("Error: Delivery date required"); this.deliveryDate = deliveryDate; }

    public String getDeliveredBy() { return deliveredBy; }
    public void setDeliveredBy(String deliveredBy) { if(deliveredBy == null || deliveredBy.isEmpty()) throw new IllegalArgumentException("Error: Delivered by required"); this.deliveredBy = deliveredBy; }
}

