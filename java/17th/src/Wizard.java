public class Wizard extends Magician {
    private int boost;

    public Wizard () {
        super();

        strUpdate(MINOR);
        conUpdate(MINOR);
        dexUpdate(MINOR);
        agiUpdate(MINOR);
        iqUpdate(MAJOR);
        menUpdate(MAJOR);

        boost = 0;
    }
}
