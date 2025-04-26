public class TherapySession {
    Patient patient;
    Therapist therapist;

    public TherapySession(Patient patient, Therapist therapist) {
        this.patient = patient;
        this.therapist = therapist;
    }

    void conductSession() {
        System.out.println("Conducting session for " + patient.name + " with therapist " + therapist.name);
    }
}
