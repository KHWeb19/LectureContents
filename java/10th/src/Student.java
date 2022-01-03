public class Student {
    String name;
    int age;
    String major;

    Score score;

    public void initStudents (String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;

        score = new Score();
        score.initScore();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                ", score=" + score +
                '}';
    }
}
