public class RandomGenerator {
    int intMax, intMin, intRange;
    int intMax2, intMin2, intRange2;

    int condMin, condMax, condRange;
    int condMin2, condMax2, condRange2;

    final int TWO = 2;
    final int CHECK_NUM = 100000;

    public RandomGenerator (final int intMin, final int intMax) {
        this.intMin = intMin;
        this.intMax = intMax;

        intRange = intMax - intMin + 1;
    }

    public RandomGenerator (
            final int intMin, final int intMax,
            final int intMin2, final int intMax2) {

        this.intMin = intMin;
        this.intMax = intMax;

        this.intMin2 = intMin2;
        this.intMax2 = intMax2;

        intRange = intMax - intMin + 1;
        intRange2 = intMax2 - intMin2 + 1;
    }

    public RandomGenerator (
            final int intMin, final int intMax,
            final int condMin, final int condMax,
            final int condMin2, final int condMax2) {

        this.intMin = intMin;
        this.intMax = intMax;

        intRange = intMax - intMin + 1;

        this.condMin = condMin;
        this.condMax = condMax;

        condRange = condMax - condMin + 1;

        this.condMin2 = condMin2;
        this.condMax2 = condMax2;

        condRange2 = condMax - condMin + 1;
    }

    public int intGenerate () {
        return (int) (Math.random() * intRange + intMin);
    }
    public int intGenerate2 () {
        return (int) (Math.random() * intRange2 + intMin2);
    }
    public int percent50 () {
        return (int) (Math.random() * TWO);
    }

    public int complicatedRandom () {
        if (percent50() == 0) {
            return intGenerate();
        } else {
            return intGenerate2();
        }
    }

    public boolean isRandomNotOk (int rand) {
        if ((rand >= condMin && rand <= condMax) ||
                (rand >= condMin2 && rand <= condMax2)) {
            return false;
        }

        return true;
    }

    public int conditionRandom () {
        int rand, cnt = 0;

        do {
            System.out.printf("%d 번째\n", ++cnt);
            rand = intGenerate();
        } while (isRandomNotOk(rand));

        return rand;
    }

    public boolean confirmRandom () {
        int tmp;

        for (int i = 0; i < CHECK_NUM; i++) {
            tmp = intGenerate();

            if (tmp < intMin || tmp > intMax) {
                return false;
            }
        }

        return true;
    }

    public boolean confirmComplicatedRandom () {
        int tmp, tmp2;

        for (int i = 0; i < CHECK_NUM; i++) {
            tmp = intGenerate();

            if (tmp < intMin || tmp > intMax) {
                return false;
            }

            tmp2 = intGenerate2();

            if (tmp2 < intMin2 || tmp2 > intMax2) {
                return false;
            }
        }

        return true;
    }
}
