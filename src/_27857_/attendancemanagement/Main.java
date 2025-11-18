package _27857_.attendancemanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("--- Entity Details ---");
            System.out.print(" 27857 | ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print(" 27857 | Created Date: "); String createdDate = sc.nextLine();
            System.out.print(" 27857 | Updated Date: "); String updatedDate = sc.nextLine();

            System.out.println("--- Institution Details ---");
            System.out.print("27857 | Institution Name: "); String institutionName = sc.nextLine();
            System.out.print("27857 | Code: "); String code = sc.nextLine();
            System.out.print("27857 | Address: "); String address = sc.nextLine();

            System.out.println("--- Department Details ---");
            System.out.print("27857 | Department Name: "); String departmentName = sc.nextLine();
            System.out.print("27857 | Department Head: "); String departmentHead = sc.nextLine();

            System.out.println("--- Course Details ---");
            System.out.print("27857 | Course Name: "); String courseName = sc.nextLine();
            System.out.print("27857 | Course Code: "); String courseCode = sc.nextLine();
            System.out.print("27857 | Credits: "); int credits = sc.nextInt(); sc.nextLine();

            System.out.println("--- Instructor Details ---");
            System.out.print("27857 | Instructor Name: "); String instructorName = sc.nextLine();
            System.out.print("27857 | Email: "); String email = sc.nextLine();
            System.out.print("27857 | Phone (10 digits): "); String phone = sc.nextLine();

            System.out.println("--- Student Details ---");
            System.out.print("27857 | Student Name: "); String studentName = sc.nextLine();
            System.out.print("27857 | Student ID: "); String studentID = sc.nextLine();
            System.out.print("27857 | Age: "); int age = sc.nextInt(); sc.nextLine();

            System.out.println("--- Class Session Details ---");
            System.out.print("27857 | Session Date: "); String sessionDate = sc.nextLine();
            System.out.print("27857 | Topic: "); String topic = sc.nextLine();
            System.out.print("27857 | Attendance Status (Present/Absent): "); String status = sc.nextLine();

            System.out.println("--- Leave Request Details ---");
            System.out.print("27857 | Request Date: "); String requestDate = sc.nextLine();
            System.out.print("27857 | Reason: "); String reason = sc.nextLine();
            System.out.print("27857 | Approved (true/false): "); boolean approved = sc.nextBoolean(); sc.nextLine();

            System.out.println("--- Attendance Summary Details ---");
            System.out.print("27857 | Report Date: "); String reportDate = sc.nextLine();
            System.out.print("27857 | Total Present: "); int totalPresent = sc.nextInt();
            System.out.print("27857 | Total Absent: "); int totalAbsent = sc.nextInt();

            AttendanceSummary summary = new AttendanceSummary(id, createdDate, updatedDate, institutionName, code, address,
                    departmentName, departmentHead, courseName, courseCode, credits,
                    instructorName, email, phone, studentName, studentID, age,
                    sessionDate, topic, status, requestDate, reason, approved,
                    reportDate, totalPresent, totalAbsent);

            System.out.println("\n--- Attendance Summary ---");
            System.out.println("27857 | Student: " + summary.getStudentName() + " (" + summary.getStudentID() + ")");
            System.out.println("27857 | Course: " + summary.getCourseName());
            System.out.println("27857 | Report Date: " + summary.getReportDate());
            System.out.println("27857 | Total Present: " + summary.getTotalPresent());
            System.out.println("27857 | Total Absent: " + summary.getTotalAbsent());
            System.out.printf("27857 | Attendance Percentage: %.2f%%\n", summary.generateSummary());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("27857 | Error: Invalid input.");
        } finally {
            sc.close();
        }
    }
}

