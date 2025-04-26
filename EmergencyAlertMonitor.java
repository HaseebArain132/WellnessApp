public class EmergencyAlertMonitor extends Thread {
    Patient patient;

    public EmergencyAlertMonitor(Patient patient) {
        this.patient = patient;
    }

    public void run() {
        while (true) {
            if (patient.tracker.moodEntry.getMoodLevel() < 2) {
                System.out.println("Emergency alert for " + patient.name + "!");
                break;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
