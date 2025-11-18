package _27857_.flightbooking;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode;
    private String contactEmail;

    public Airline(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, code, location);
        if (airlineName == null || airlineName.isEmpty()) throw new IllegalArgumentException("Error: Airline name required");
        if (!airlineCode.matches("[A-Za-z]{2,4}")) throw new IllegalArgumentException("Error: Airline code must be 2-4 letters");
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("Error: Invalid contact email format");
        this.airlineName = airlineName;
        this.airlineCode = airlineCode;
        this.contactEmail = contactEmail;
    }

    public String getAirlineName() { return airlineName; }
    public void setAirlineName(String airlineName) { if (airlineName == null || airlineName.isEmpty()) throw new IllegalArgumentException("Error: Airline name required"); this.airlineName = airlineName; }

    public String getAirlineCode() { return airlineCode; }
    public void setAirlineCode(String airlineCode) { if (!airlineCode.matches("[A-Za-z]{2,4}")) throw new IllegalArgumentException("Error: Airline code must be 2-4 letters"); this.airlineCode = airlineCode; }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) { if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) throw new IllegalArgumentException("Error: Invalid contact email format"); this.contactEmail = contactEmail; }
}

