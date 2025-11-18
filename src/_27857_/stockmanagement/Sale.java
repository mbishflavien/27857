package _27857_.stockmanagement;

public class Sale extends Purchase {
    private String saleDate;
    private int soldQuantity;
    private String customerName;

    public Sale(int id, String created, String updated,
                String wName, String loc, String phone,
                String cName, String cCode,
                String supName, String email, String supPhone,
                String productName, double unitPrice, int stockLimit,
                int qty, int reorder,
                String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                String saleDate, int soldQuantity, String customerName) {

        // call Purchase constructor
        super(id, created, updated,
                wName, loc, phone,
                cName, cCode,
                supName, email, supPhone,
                productName, unitPrice, stockLimit,
                qty, reorder,
                purchaseDate, purchasedQuantity, purchaseSupplierName);

        if (saleDate == null) throw new IllegalArgumentException("Sale date cannot be null");
        if (soldQuantity <= 0) throw new IllegalArgumentException("Sold quantity must be > 0");
        if (customerName == null) customerName = "";

        this.saleDate = saleDate;
        this.soldQuantity = soldQuantity;
        this.customerName = customerName;
    }

    // Getters & Setters
    public String getSaleDate() { return saleDate; }
    public void setSaleDate(String saleDate) {
        if (saleDate != null) this.saleDate = saleDate;
    }

    public int getSoldQuantity() { return soldQuantity; }
    public void setSoldQuantity(int soldQuantity) {
        if (soldQuantity > 0) this.soldQuantity = soldQuantity;
    }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) {
        if (customerName != null) this.customerName = customerName;
    }
}


