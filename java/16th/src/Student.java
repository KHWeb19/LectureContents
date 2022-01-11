// extends가 상속 받는 키워드
public class Student extends Person {
    // 상속 받았기 때문에
    // Person 내부에 있는 name, age 정보를 활용할 수 있음
    private String major;
    
    public Student (String name, int age, String major) {
        // super()는 자신의 상위(부모)를 의미함
        super(name, age);
        
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" + '\n' +
                super.toString() + '\n' +
                "major='" + major + '\n' +
                '}';
    }
}
