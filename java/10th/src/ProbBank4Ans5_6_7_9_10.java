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

        // 평균을 구하는 7번 문제의 경우엔 고려해야할 사항이 추가로 있다.
        // 평균의 종류가 몇 개 있을까 ??? ㅋㅋㅋ
        // 산술 평균, 기하 평균, 조화 평균, 중간값, 4분위수상의 평균, 빈도값 (mean: 평균)
        // 우선 편의상 그냥 결합시키자 ... (정석은 분리시켜야함)
    }
}
