package _27857_.stockmanagement;

public class Warehouse extends Entity {
    private String warehouseName;
    private String location;
    private String contactNumber;

    public Warehouse(int id, String created, String updated,
                     String warehouseName, String location, String phone) {
        super(id, created, updated);

        if (phone.length() != 10) throw new IllegalArgumentException("Phone must be 10 digits");

        this.warehouseName = warehouseName;
        this.location = location;
        this.contactNumber = phone;
    }

    // Getters & Setters
    public String getWarehouseName() { return warehouseName; }
    public void setWarehouseName(String w) { this.warehouseName = w; }

    public String getLocation() { return location; }
    public void setLocation(String l) { this.location = l; }

    public String getContactNumber() { return contactNumber; }
    public void setContactNumber(String p) { if (p.length() == 10) this.contactNumber = p; }
}

