public class Patient extends User {
    WellnessTracker tracker;

    public Patient(String name, String email) {
        super(name, email);
        this.tracker = new WellnessTracker();
    }

    void displayInfo() {
        System.out.println("Patient: " + name);
    }
}
