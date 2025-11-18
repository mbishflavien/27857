package _27857_.stockmanagement;

public class Supplier extends Category {
    private String supplierName;
    private String supplierEmail;
    private String supplierPhone;

    public Supplier(int id, String created, String updated,
                    String wName, String loc, String phone,
                    String cName, String cCode,
                    String supName, String email, String supPhone) {

        super(id, created, updated, wName, loc, phone, cName, cCode);

        if (!email.contains("@")) throw new IllegalArgumentException("Invalid email");
        if (supPhone.length() != 10) throw new IllegalArgumentException("Phone must be 10 digits");

        this.supplierName = supName;
        this.supplierEmail = email;
        this.supplierPhone = supPhone;
    }

    // Getters/Setters
}

