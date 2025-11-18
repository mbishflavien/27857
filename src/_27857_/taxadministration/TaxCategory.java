package _27857_.taxadministration;

public class TaxCategory extends TaxAuthority {
    private String categoryName;
    private double rate;
    private String code;

    public TaxCategory(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                       String categoryName, double rate, String code) {
        super(id, createdDate, updatedDate, authorityName, region, email);
        if(categoryName == null || categoryName.isEmpty()) throw new IllegalArgumentException("Error: Category name required");
        if(rate <= 0) throw new IllegalArgumentException("Error: Rate must be > 0");
        if(code == null || code.length() < 3) throw new IllegalArgumentException("Error: Code must be ≥ 3 chars");
        this.categoryName = categoryName;
        this.rate = rate;
        this.code = code;
    }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { if(categoryName == null || categoryName.isEmpty()) throw new IllegalArgumentException("Error: Category name required"); this.categoryName = categoryName; }

    public double getRate() { return rate; }
    public void setRate(double rate) { if(rate <= 0) throw new IllegalArgumentException("Error: Rate must be > 0"); this.rate = rate; }

    public String getCode() { return code; }
    public void setCode(String code) { if(code == null || code.length() < 3) throw new IllegalArgumentException("Error: Code must be ≥ 3 chars"); this.code = code; }
}

