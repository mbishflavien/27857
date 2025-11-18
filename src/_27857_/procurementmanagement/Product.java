package _27857_.procurementmanagement;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int quantity;

    public Product(int id, String createdDate, String updatedDate, String orgName, String address, String contactEmail,
                   String deptName, String deptCode, String supplierName, String supplierTIN, String contact,
                   String productName, double unitPrice, int quantity) {
        super(id, createdDate, updatedDate, orgName, address, contactEmail, deptName, deptCode, supplierName, supplierTIN, contact);
        if(productName == null || productName.isEmpty()) throw new IllegalArgumentException("Error: Product name required");
        if(unitPrice <= 0) throw new IllegalArgumentException("Error: Unit price must be > 0");
        if(quantity < 0) throw new IllegalArgumentException("Error: Quantity must be ≥ 0");
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { if(productName == null || productName.isEmpty()) throw new IllegalArgumentException("Error: Product name required"); this.productName = productName; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { if(unitPrice <= 0) throw new IllegalArgumentException("Error: Unit price must be > 0"); this.unitPrice = unitPrice; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { if(quantity < 0) throw new IllegalArgumentException("Error: Quantity must be ≥ 0"); this.quantity = quantity; }
}

