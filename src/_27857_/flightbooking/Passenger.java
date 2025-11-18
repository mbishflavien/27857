package _27857_.flightbooking;

public class Passenger extends CabinCrew {
    private String passengerName;
    private int age;
    private String gender;
    private String contact;

    public Passenger(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail, String flightNumber, String departure,
                     String destination, double baseFare, String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift, String passengerName, int age, String gender, String contact) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears, crewName, role, shift);
        if (passengerName == null || passengerName.isEmpty()) throw new IllegalArgumentException("Error: Passenger name required");
        if (age <= 0) throw new IllegalArgumentException("Error: Age must be > 0");
        if (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other")) throw new IllegalArgumentException("Error: Gender must be Male, Female, or Other");
        if (contact == null || contact.isEmpty()) throw new IllegalArgumentException("Error: Contact required");
        this.passengerName = passengerName;
        this.age = age;
        this.gender = gender;
        this.contact = contact;
    }

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { if (passengerName == null || passengerName.isEmpty()) throw new IllegalArgumentException("Error: Passenger name required"); this.passengerName = passengerName; }

    public int getAge() { return age; }
    public void setAge(int age) { if (age <= 0) throw new IllegalArgumentException("Error: Age must be > 0"); this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { if (!gender.equals("Male") && !gender.equals("Female") && !gender.equals("Other")) throw new IllegalArgumentException("Error: Gender must be Male, Female, or Other"); this.gender = gender; }

    public String getContact() { return contact; }
    public void setContact(String contact) { if (contact == null || contact.isEmpty()) throw new IllegalArgumentException("Error: Contact required"); this.contact = contact; }
}

