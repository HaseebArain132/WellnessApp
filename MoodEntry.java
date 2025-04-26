public class MoodEntry {
    private int moodLevel = 5;

    void setMoodLevel(int level) {
        moodLevel = level;
        System.out.println("Mood level set to " + moodLevel);
    }

    int getMoodLevel() {
        return moodLevel;
    }
}
