package _27857_.flightbooking;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("Error: ID must be greater than 0.");
        if (createdDate == null || createdDate.isEmpty()) throw new IllegalArgumentException("Error: Created date cannot be null or empty.");
        if (updatedDate == null || updatedDate.isEmpty()) throw new IllegalArgumentException("Error: Updated date cannot be null or empty.");
        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    public int getId() { return id; }
    public void setId(int id) { if (id <= 0) throw new IllegalArgumentException("Error: ID must be > 0"); this.id = id; }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) { if (createdDate == null || createdDate.isEmpty()) throw new IllegalArgumentException("Error: Created date required"); this.createdDate = createdDate; }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) { if (updatedDate == null || updatedDate.isEmpty()) throw new IllegalArgumentException("Error: Updated date required"); this.updatedDate = updatedDate; }
}

