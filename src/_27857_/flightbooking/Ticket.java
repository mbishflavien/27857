package _27857_.flightbooking;

public final class Ticket extends Payment {
    private String ticketNumber;
    private String issueDate;

    public Ticket(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure,
                  String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift, String passengerName, int age, String gender, String contact,
                  String bookingDate, String seatNumber, String travelClass, String paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, String issueDate) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift,
                passengerName, age, gender, contact, bookingDate, seatNumber, travelClass, paymentDate, paymentMethod, amountPaid);
        if (ticketNumber == null || ticketNumber.isEmpty()) throw new IllegalArgumentException("Error: Ticket number required");
        if (issueDate == null || issueDate.isEmpty()) throw new IllegalArgumentException("Error: Issue date required");
        this.ticketNumber = ticketNumber;
        this.issueDate = issueDate;
    }

    public String getTicketNumber() { return ticketNumber; }
    public void setTicketNumber(String ticketNumber) { if (ticketNumber == null || ticketNumber.isEmpty()) throw new IllegalArgumentException("Error: Ticket number required"); this.ticketNumber = ticketNumber; }

    public String getIssueDate() { return issueDate; }
    public void setIssueDate(String issueDate) { if (issueDate == null || issueDate.isEmpty()) throw new IllegalArgumentException("Error: Issue date required"); this.issueDate = issueDate; }

    public double calculateFare() {
        // Example: total fare = baseFare + taxes (10%) - discount (5%)
        double taxes = getBaseFare() * 0.10;
        double discount = getBaseFare() * 0.05;
        return getBaseFare() + taxes - discount;
    }
}
