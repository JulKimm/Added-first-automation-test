package absoftMortalwombat;

public class AgeChecker {
    private final int MIN_AGE = 18;

    public boolean canPlayGame(int age) {
        return age >= MIN_AGE;
    }
    public boolean canNotPlayGame(int age) {
        return age <= MIN_AGE;
    }
}
