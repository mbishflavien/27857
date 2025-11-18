package _27857_.stockmanagement;

public class Category extends Warehouse {
    private String categoryName;
    private String categoryCode;

    public Category(int id, String created, String updated,
                    String wName, String loc, String phone,
                    String categoryName, String categoryCode) {

        super(id, created, updated, wName, loc, phone);

        if (categoryCode.length() < 3)
            throw new IllegalArgumentException("Code must be ≥ 3 characters");

        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    // Getters/Setters
}

