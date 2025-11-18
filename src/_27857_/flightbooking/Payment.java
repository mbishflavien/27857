package _27857_.flightbooking;

public class Payment extends Booking {
    private String paymentDate;
    private String paymentMethod;
    private double amountPaid;

    public Payment(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure,
                   String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift, String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass, String paymentDate, String paymentMethod, double amountPaid) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift,
                passengerName, age, gender, contact, bookingDate, seatNumber, travelClass);
        if (paymentDate == null || paymentDate.isEmpty()) throw new IllegalArgumentException("Error: Payment date required");
        if (paymentMethod == null || paymentMethod.isEmpty()) throw new IllegalArgumentException("Error: Payment method required");
        if (amountPaid <= 0) throw new IllegalArgumentException("Error: Amount paid must be greater than 0");
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        this.amountPaid = amountPaid;
    }

    public String getPaymentDate() { return paymentDate; }
    public void setPaymentDate(String paymentDate) { if (paymentDate == null || paymentDate.isEmpty()) throw new IllegalArgumentException("Error: Payment date required"); this.paymentDate = paymentDate; }

    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { if (paymentMethod == null || paymentMethod.isEmpty()) throw new IllegalArgumentException("Error: Payment method required"); this.paymentMethod = paymentMethod; }

    public double getAmountPaid() { return amountPaid; }
    public void setAmountPaid(double amountPaid) { if (amountPaid <= 0) throw new IllegalArgumentException("Error: Amount paid must be greater than 0"); this.amountPaid = amountPaid; }
}
