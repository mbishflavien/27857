package _27857_.taxadministration;

public class TaxAuthority extends Entity {
    private String authorityName;
    private String region;
    private String email;

    public TaxAuthority(int id, String createdDate, String updatedDate, String authorityName, String region, String email) {
        super(id, createdDate, updatedDate);
        if(authorityName == null || authorityName.isEmpty()) throw new IllegalArgumentException("Error: Authority name required");
        if(region == null || region.isEmpty()) throw new IllegalArgumentException("Error: Region required");
        if(email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("Error: Invalid email format");
        this.authorityName = authorityName;
        this.region = region;
        this.email = email;
    }

    public String getAuthorityName() { return authorityName; }
    public void setAuthorityName(String authorityName) { if(authorityName == null || authorityName.isEmpty()) throw new IllegalArgumentException("Error: Authority name required"); this.authorityName = authorityName; }

    public String getRegion() { return region; }
    public void setRegion(String region) { if(region == null || region.isEmpty()) throw new IllegalArgumentException("Error: Region required"); this.region = region; }

    public String getEmail() { return email; }
    public void setEmail(String email) { if(email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("Error: Invalid email format"); this.email = email; }
}
