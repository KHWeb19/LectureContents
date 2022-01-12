public class Knight extends Warrior {
    private int anger;

    public Knight () {
        super();

        strUpdate(MAJOR);
        conUpdate(MAJOR);
        dexUpdate(MINOR);
        agiUpdate(MINOR);
        iqUpdate(MINOR);
        menUpdate(MINOR);

        anger = 0;
    }
}
