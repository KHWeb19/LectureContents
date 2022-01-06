public class PrivateClass {
    private int age;
    private String name;

    public void setPersonInfo (int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "NonPrivateClass{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
