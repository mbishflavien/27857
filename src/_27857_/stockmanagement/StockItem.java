package _27857_.stockmanagement;

public class StockItem extends Product {
    private int quantityAvailable;
    private int reorderLevel;

    public StockItem(int id, String created, String updated,
                     String wName, String loc, String phone,
                     String cName, String cCode,
                     String supName, String email, String supPhone,
                     String productName, double unitPrice, int stockLimit,
                     int qty, int reorder) {

        super(id, created, updated, wName, loc, phone, cName, cCode,
                supName, email, supPhone, productName, unitPrice, stockLimit);

        if (qty < 0 || reorder < 0)
            throw new IllegalArgumentException("Values must be ≥ 0");

        this.quantityAvailable = qty;
        this.reorderLevel = reorder;
    }
}

