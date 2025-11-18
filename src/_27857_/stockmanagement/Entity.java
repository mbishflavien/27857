package _27857_.stockmanagement;

public class Entity {
    private int id;
    private String createdDate;
    private String updatedDate;

    public Entity(int id, String createdDate, String updatedDate) {
        if (id <= 0) throw new IllegalArgumentException("ID must be > 0");
        if (createdDate == null || updatedDate == null)
            throw new IllegalArgumentException("Dates cannot be null");

        this.id = id;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { if (id > 0) this.id = id; }

    public String getCreatedDate() { return createdDate; }
    public void setCreatedDate(String createdDate) { this.createdDate = createdDate; }

    public String getUpdatedDate() { return updatedDate; }
    public void setUpdatedDate(String updatedDate) { this.updatedDate = updatedDate; }
}

