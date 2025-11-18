package _27857_.flightbooking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("--- Enter Entity Details ---");
            System.out.print("27857 | ID: "); int id = sc.nextInt(); sc.nextLine();
            System.out.print("27857 | Created Date: "); String createdDate = sc.nextLine();
            System.out.print("27857 | Updated Date: "); String updatedDate = sc.nextLine();

            System.out.println("--- Enter Airport Details ---");
            System.out.print("27857 | Airport Name: "); String airportName = sc.nextLine();
            System.out.print("27857 | Airport Code (3 uppercase letters): "); String airportCode = sc.nextLine();
            System.out.print("27857 | Location: "); String location = sc.nextLine();

            System.out.println("--- Enter Airline Details ---");
            System.out.print("27857 | Airline Name: "); String airlineName = sc.nextLine();
            System.out.print("27857 | Airline Code (2-4 letters): "); String airlineCode = sc.nextLine();
            System.out.print("27857 | Contact Email: "); String contactEmail = sc.nextLine();

            System.out.println("--- Enter Flight Details ---");
            System.out.print("27857 | Flight Number: "); String flightNumber = sc.nextLine();
            System.out.print("27857 | Departure: "); String departure = sc.nextLine();
            System.out.print("27857 | Destination: "); String destination = sc.nextLine();
            System.out.print("27857 | Base Fare: "); double baseFare = sc.nextDouble(); sc.nextLine();

            System.out.println("--- Enter Pilot Details ---");
            System.out.print("27857 | Pilot Name: "); String pilotName = sc.nextLine();
            System.out.print("27857 | License Number: "); String licenseNumber = sc.nextLine();
            System.out.print("27857 | Experience Years: "); int experienceYears = sc.nextInt(); sc.nextLine();

            System.out.println("--- Enter Cabin Crew Details ---");
            System.out.print("27857 | Crew Name: "); String crewName = sc.nextLine();
            System.out.print("27857 | Role: "); String role = sc.nextLine();
            System.out.print("27857 | Shift (Day/Night): "); String shift = sc.nextLine();

            System.out.println("--- Enter Passenger Details ---");
            System.out.print("27857 | Passenger Name: "); String passengerName = sc.nextLine();
            System.out.print("27857 | Age: "); int age = sc.nextInt(); sc.nextLine();
            System.out.print("27857 | Gender (Male/Female/Other): "); String gender = sc.nextLine();
            System.out.print("27857 | Contact: "); String contact = sc.nextLine();

            System.out.println("--- Enter Booking Details ---");
            System.out.print("27857 | Booking Date: "); String bookingDate = sc.nextLine();
            System.out.print("27857 | Seat Number: "); String seatNumber = sc.nextLine();
            System.out.print("27857 | Travel Class (Economy/Business/First): "); String travelClass = sc.nextLine();

            System.out.println("--- Enter Payment Details ---");
            System.out.print("27857 | Payment Date: "); String paymentDate = sc.nextLine();
            System.out.print("27857 | Payment Method: "); String paymentMethod = sc.nextLine();
            System.out.print("27857 | Amount Paid: "); double amountPaid = sc.nextDouble(); sc.nextLine();

            System.out.println("--- Enter Ticket Details ---");
            System.out.print("27857 | Ticket Number: "); String ticketNumber = sc.nextLine();
            System.out.print("27857 | Issue Date: "); String issueDate = sc.nextLine();

            Ticket ticket = new Ticket(id, createdDate, updatedDate, airportName, airportCode, location,
                    airlineName, airlineCode, contactEmail, flightNumber, departure, destination, baseFare,
                    pilotName, licenseNumber, experienceYears, crewName, role, shift,
                    passengerName, age, gender, contact, bookingDate, seatNumber, travelClass,
                    paymentDate, paymentMethod, amountPaid, ticketNumber, issueDate);

            System.out.println("\n--- Ticket Summary ---");
            System.out.println("27857 | Passenger: " + ticket.getPassengerName() + ", Flight: " + ticket.getFlightNumber() + ", Seat: " + ticket.getSeatNumber());
            System.out.println("Total Fare: $" + ticket.calculateFare());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("27857 | Error: Invalid input.");
        } finally {
            sc.close();
        }
    }
}

