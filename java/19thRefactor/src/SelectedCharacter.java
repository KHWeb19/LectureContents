public class SelectedCharacter {
    private Integer selectedNum;
    private Object character;

    public SelectedCharacter (Integer selectedNum, Object character) {
        this.selectedNum = selectedNum;
        this.character = character;
    }

    public Integer getSelectedNum() {
        return selectedNum;
    }

    public Object getCharacter() {
        return character;
    }
}
