package _27857_.attendancemanagement;

public class Student extends Instructor {
    private String studentName;
    private String studentID;
    private int age;

    public Student(int id, String createdDate, String updatedDate, String institutionName, String code, String address,
                   String departmentName, String departmentHead,
                   String courseName, String courseCode, int credits,
                   String instructorName, String email, String phone,
                   String studentName, String studentID, int age) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone);
        if (studentName == null || studentName.isEmpty()) throw new IllegalArgumentException("Error: Student name required");
        if (studentID == null || studentID.isEmpty()) throw new IllegalArgumentException("Error: Student ID required");
        if (age <= 0) throw new IllegalArgumentException("Error: Age must be > 0");
        this.studentName = studentName;
        this.studentID = studentID;
        this.age = age;
    }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { if (studentName == null || studentName.isEmpty()) throw new IllegalArgumentException("Error: Student name required"); this.studentName = studentName; }

    public String getStudentID() { return studentID; }
    public void setStudentID(String studentID) { if (studentID == null || studentID.isEmpty()) throw new IllegalArgumentException("Error: Student ID required"); this.studentID = studentID; }

    public int getAge() { return age; }
    public void setAge(int age) { if (age <= 0) throw new IllegalArgumentException("Error: Age must be > 0"); this.age = age; }
}

