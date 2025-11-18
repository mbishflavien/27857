package _27857_.flightbooking;

public class Airport extends Entity {
    private String airportName;
    private String code;
    private String location;

    public Airport(int id, String createdDate, String updatedDate, String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        if (airportName == null || airportName.isEmpty()) throw new IllegalArgumentException("Error: Airport name required");
        if (!code.matches("[A-Z]{3}")) throw new IllegalArgumentException("Error: Airport code must be 3 uppercase letters");
        if (location == null || location.isEmpty()) throw new IllegalArgumentException("Error: Airport location required");
        this.airportName = airportName;
        this.code = code;
        this.location = location;
    }

    public String getAirportName() { return airportName; }
    public void setAirportName(String airportName) { if (airportName == null || airportName.isEmpty()) throw new IllegalArgumentException("Error: Airport name required"); this.airportName = airportName; }

    public String getCode() { return code; }
    public void setCode(String code) { if (!code.matches("[A-Z]{3}")) throw new IllegalArgumentException("Error: Airport code must be 3 uppercase letters"); this.code = code; }

    public String getLocation() { return location; }
    public void setLocation(String location) { if (location == null || location.isEmpty()) throw new IllegalArgumentException("Error: Airport location required"); this.location = location; }
}

