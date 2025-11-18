package _27857_.taxadministration;

public class Taxpayer extends TaxCategory {
    private String tin;
    private String taxpayerName;
    private String address;

    public Taxpayer(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                    String categoryName, double rate, String code, String tin, String taxpayerName, String address) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code);
        if(tin == null || !tin.matches("\\d{9}")) throw new IllegalArgumentException("Error: TIN must be 9 digits");
        if(taxpayerName == null || taxpayerName.isEmpty()) throw new IllegalArgumentException("Error: Taxpayer name required");
        if(address == null || address.isEmpty()) throw new IllegalArgumentException("Error: Address required");
        this.tin = tin;
        this.taxpayerName = taxpayerName;
        this.address = address;
    }

    public String getTin() { return tin; }
    public void setTin(String tin) { if(tin == null || !tin.matches("\\d{9}")) throw new IllegalArgumentException("Error: TIN must be 9 digits"); this.tin = tin; }

    public String getTaxpayerName() { return taxpayerName; }
    public void setTaxpayerName(String taxpayerName) { if(taxpayerName == null || taxpayerName.isEmpty()) throw new IllegalArgumentException("Error: Taxpayer name required"); this.taxpayerName = taxpayerName; }

    public String getAddress() { return address; }
    public void setAddress(String address) { if(address == null || address.isEmpty()) throw new IllegalArgumentException("Error: Address required"); this.address = address; }
}