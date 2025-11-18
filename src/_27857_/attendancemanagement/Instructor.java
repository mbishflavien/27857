package _27857_.attendancemanagement;

public class Instructor extends Course {
    private String instructorName;
    private String email;
    private String phone;

    public Instructor(int id, String createdDate, String updatedDate, String institutionName, String code, String address,
                      String departmentName, String departmentHead,
                      String courseName, String courseCode, int credits,
                      String instructorName, String email, String phone) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead, courseName, courseCode, credits);
        if (instructorName == null || instructorName.isEmpty()) throw new IllegalArgumentException("Error: Instructor name required");
        if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("Error: Invalid email format");
        if (phone == null || !phone.matches("\\d{10}")) throw new IllegalArgumentException("Error: Phone must be 10 digits");
        this.instructorName = instructorName;
        this.email = email;
        this.phone = phone;
    }

    public String getInstructorName() { return instructorName; }
    public void setInstructorName(String instructorName) { if (instructorName == null || instructorName.isEmpty()) throw new IllegalArgumentException("Error: Instructor name required"); this.instructorName = instructorName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { if (email == null || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("Error: Invalid email format"); this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { if (phone == null || !phone.matches("\\d{10}")) throw new IllegalArgumentException("Error: Phone must be 10 digits"); this.phone = phone; }
}

