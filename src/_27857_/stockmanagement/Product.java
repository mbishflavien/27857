package _27857_.stockmanagement;

public class Product extends Supplier {
    private String productName;
    private double unitPrice;
    private int stockLimit;

    public Product(int id, String created, String updated,
                   String wName, String loc, String phone,
                   String cName, String cCode,
                   String supName, String email, String supPhone,
                   String productName, double unitPrice, int stockLimit) {

        super(id, created, updated, wName, loc, phone, cName, cCode, supName, email, supPhone);

        if (unitPrice <= 0) throw new IllegalArgumentException("Price must be > 0");
        if (stockLimit < 0) throw new IllegalArgumentException("Stock limit must be ≥ 0");

        this.productName = productName;
        this.unitPrice = unitPrice;
        this.stockLimit = stockLimit;
    }
}

