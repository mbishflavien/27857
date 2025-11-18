package _27857_.stockmanagement;

public class Inventory extends Sale {
    private int totalItems;
    private double stockValue;

    public Inventory(int id, String created, String updated,
                     String wName, String loc, String phone,
                     String cName, String cCode,
                     String supName, String email, String supPhone,
                     String productName, double unitPrice, int stockLimit,
                     int qty, int reorder,
                     String purchaseDate, int purchasedQuantity, String purchaseSupplierName,
                     String saleDate, int soldQuantity, String customerName,
                     int totalItems, double stockValue) {

        super(id, created, updated,
                wName, loc, phone,
                cName, cCode,
                supName, email, supPhone,
                productName, unitPrice, stockLimit,
                qty, reorder,
                purchaseDate, purchasedQuantity, purchaseSupplierName,
                saleDate, soldQuantity, customerName);

        if (totalItems < 0) throw new IllegalArgumentException("totalItems must be >= 0");
        if (stockValue < 0) throw new IllegalArgumentException("stockValue must be >= 0");

        this.totalItems = totalItems;
        this.stockValue = stockValue;
    }

    // Getters & Setters
    public int getTotalItems() { return totalItems; }
    public void setTotalItems(int totalItems) {
        if (totalItems >= 0) this.totalItems = totalItems;
    }

    public double getStockValue() { return stockValue; }
    public void setStockValue(double stockValue) {
        if (stockValue >= 0) this.stockValue = stockValue;
    }
}

