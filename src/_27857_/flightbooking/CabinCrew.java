package _27857_.flightbooking;

public class CabinCrew extends Pilot {
    private String crewName;
    private String role;
    private String shift; // Day or Night

    public CabinCrew(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure,
                     String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears);
        if (crewName == null || crewName.isEmpty()) throw new IllegalArgumentException("Error: Crew name required");
        if (role == null || role.isEmpty()) throw new IllegalArgumentException("Error: Crew role required");
        if (!shift.equals("Day") && !shift.equals("Night")) throw new IllegalArgumentException("Error: Shift must be 'Day' or 'Night'");
        this.crewName = crewName;
        this.role = role;
        this.shift = shift;
    }

    public String getCrewName() { return crewName; }
    public void setCrewName(String crewName) { if (crewName == null || crewName.isEmpty()) throw new IllegalArgumentException("Error: Crew name required"); this.crewName = crewName; }

    public String getRole() { return role; }
    public void setRole(String role) { if (role == null || role.isEmpty()) throw new IllegalArgumentException("Error: Crew role required"); this.role = role; }

    public String getShift() { return shift; }
    public void setShift(String shift) { if (!shift.equals("Day") && !shift.equals("Night")) throw new IllegalArgumentException("Error: Shift must be 'Day' or 'Night'"); this.shift = shift; }
}
