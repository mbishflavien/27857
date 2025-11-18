package _27857_.flightbooking;

public class Flight extends Airline {
    private String flightNumber;
    private String departure;
    private String destination;
    private double baseFare;

    public Flight(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure,
                  String destination, double baseFare) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail);
        if (flightNumber == null || flightNumber.isEmpty()) throw new IllegalArgumentException("Error: Flight number required");
        if (departure == null || departure.isEmpty()) throw new IllegalArgumentException("Error: Departure required");
        if (destination == null || destination.isEmpty()) throw new IllegalArgumentException("Error: Destination required");
        if (baseFare <= 0) throw new IllegalArgumentException("Error: Base fare must be > 0");
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.baseFare = baseFare;
    }

    public String getFlightNumber() { return flightNumber; }
    public void setFlightNumber(String flightNumber) { if (flightNumber == null || flightNumber.isEmpty()) throw new IllegalArgumentException("Error: Flight number required"); this.flightNumber = flightNumber; }

    public String getDeparture() { return departure; }
    public void setDeparture(String departure) { if (departure == null || departure.isEmpty()) throw new IllegalArgumentException("Error: Departure required"); this.departure = departure; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { if (destination == null || destination.isEmpty()) throw new IllegalArgumentException("Error: Destination required"); this.destination = destination; }

    public double getBaseFare() { return baseFare; }
    public void setBaseFare(double baseFare) { if (baseFare <= 0) throw new IllegalArgumentException("Error: Base fare must be > 0"); this.baseFare = baseFare; }
}

