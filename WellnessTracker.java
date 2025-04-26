public class WellnessTracker {
    MoodEntry moodEntry;
    SleepLog sleepLog;

    public WellnessTracker() {
        this.moodEntry = new MoodEntry();
        this.sleepLog = new SleepLog();
    }

    void trackMood(int level) {
        moodEntry.setMoodLevel(level);
    }

    void logSleep(int hours) {
        sleepLog.logHours(hours);
    }
}
