package _27857_.attendancemanagement;

public class AttendanceRecord extends ClassSession {
    private String status; // "Present" or "Absent"

    public AttendanceRecord(int id, String createdDate, String updatedDate, String institutionName, String code, String address,
                            String departmentName, String departmentHead,
                            String courseName, String courseCode, int credits,
                            String instructorName, String email, String phone,
                            String studentName, String studentID, int age,
                            String sessionDate, String topic,
                            String status) {
        super(id, createdDate, updatedDate, institutionName, code, address, departmentName, departmentHead,
                courseName, courseCode, credits, instructorName, email, phone, studentName, studentID, age, sessionDate, topic);
        if (status == null || (!status.equals("Present") && !status.equals("Absent"))) throw new IllegalArgumentException("Error: Status must be Present or Absent");
        this.status = status;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) { if (status == null || (!status.equals("Present") && !status.equals("Absent"))) throw new IllegalArgumentException("Error: Status must be Present or Absent"); this.status = status; }
}

