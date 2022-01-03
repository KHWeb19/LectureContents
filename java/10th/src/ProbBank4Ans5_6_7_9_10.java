public class ProbBank4Ans5_6_7_9_10 {
    public static void main(String[] args) {
        // 학생 클래스를 만들어봅시다.

        Student student = new Student();
        student.initStudents("나배달", 20, "배달");

        // 어 ? 어떻게 println()에 student 객체를 넣으니
        // 알아서 내부의 내용이 나올까 ?
        // toString()을 만들면 알아서 println() 사용시 정보가 맵핑되어 출력되게 만들어진다.
        System.out.println(student);
        // toString()이 없으면 Student@1b6d3586 형태의 메모리 주소값이 나온다.
    }
}
