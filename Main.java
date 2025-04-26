public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Ali", "ali@example.com");
        Therapist therapist = new Therapist("Dr. Khan", "khan@example.com");

        patient.displayInfo();
        therapist.displayInfo();

        patient.tracker.logSleep(6);
        patient.tracker.trackMood(1);

        TherapySession session = new TherapySession(patient, therapist);
        session.conductSession();

        EmergencyAlertMonitor monitor = new EmergencyAlertMonitor(patient);
        monitor.start();
    }
}
