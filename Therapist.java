public class Therapist extends User {

    public Therapist(String name, String email) {
        super(name, email);
    }

    @Override
    void displayInfo() {
        System.out.println("Therapist: " + name);
    }
}
