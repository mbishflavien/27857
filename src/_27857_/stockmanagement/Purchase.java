package _27857_.stockmanagement;

public class Purchase extends StockItem {
    private String purchaseDate;
    private int purchasedQuantity;
    private String supplierName;

    public Purchase(int id, String created, String updated,
                    String wName, String loc, String phone,
                    String cName, String cCode,
                    String supName, String email, String supPhone,
                    String productName, double unitPrice, int stockLimit,
                    int qty, int reorder,
                    String purchaseDate, int purchasedQuantity, String supplierName) {

        super(id, created, updated, wName, loc, phone, cName, cCode,
                supName, email, supPhone, productName, unitPrice, stockLimit,
                qty, reorder);

        if (purchasedQuantity <= 0)
            throw new IllegalArgumentException("Quantity must be > 0");

        this.purchaseDate = purchaseDate;
        this.purchasedQuantity = purchasedQuantity;
        this.supplierName = supplierName;
    }
}

