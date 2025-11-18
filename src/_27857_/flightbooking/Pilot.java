package _27857_.flightbooking;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;

    public Pilot(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure,
                 String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare);
        if (pilotName == null || pilotName.isEmpty()) throw new IllegalArgumentException("Error: Pilot name required");
        if (licenseNumber == null || licenseNumber.isEmpty()) throw new IllegalArgumentException("Error: License number required");
        if (experienceYears < 2) throw new IllegalArgumentException("Error: Experience years must be at least 2");
        this.pilotName = pilotName;
        this.licenseNumber = licenseNumber;
        this.experienceYears = experienceYears;
    }

    public String getPilotName() { return pilotName; }
    public void setPilotName(String pilotName) { if (pilotName == null || pilotName.isEmpty()) throw new IllegalArgumentException("Error: Pilot name required"); this.pilotName = pilotName; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { if (licenseNumber == null || licenseNumber.isEmpty()) throw new IllegalArgumentException("Error: License number required"); this.licenseNumber = licenseNumber; }

    public int getExperienceYears() { return experienceYears; }
    public void setExperienceYears(int experienceYears) { if (experienceYears < 2) throw new IllegalArgumentException("Error: Experience years must be at least 2"); this.experienceYears = experienceYears; }
}

