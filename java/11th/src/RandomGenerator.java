public class RandomGenerator {
    int intMax, intMin, intRange;

    public RandomGenerator (final int intMin, final int intMax) {
        this.intMin = intMin;
        this.intMax = intMax;

        intRange = intMax - intMin + 1;
    }

    public int intGenerate () {
        return (int) (Math.random() * intRange + intMin);
    }

    public boolean confirmRandom () {
        int tmp;

        for (int i = 0; i < 10000; i++) {
            tmp = intGenerate();

            if (tmp < 4 || tmp > 97) {
                return false;
            }
        }

        return true;
    }
}
