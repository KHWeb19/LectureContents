public class School {
    Meal meal;
    //Lecture lecture;
    //Exam exam;

    public void initSchool () {
        meal = new Meal();
        meal.initMeal();
    }
}

// 학교에서 하는 일과
// 1. 식사        - Meal
// 2. 수업        - Lecture
// 3. 시험        - Exam
// 4. 청소    x
// 5. 연애    x