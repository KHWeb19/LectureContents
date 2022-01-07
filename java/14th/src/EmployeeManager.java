public class EmployeeManager {
    Employee[] empArr;

    public EmployeeManager (final float firstPay, final int num) {
        empArr = new Employee[num];

        for (int i = 0; i < num; i++) {
            empArr[i] = new Employee(firstPay);
        }
    }

    public void allocEmpIncRatio (int year) {
        for (int i = 0; i < empArr.length; i++) {
            empArr[i].allocIncRatio(year);
        }
    }

    public void calcPayment (int year) {
        for (int i = 0; i < empArr.length; i++) {
            empArr[i].calcPayment(year);
        }
    }

    public void paymentSimulation (int year) {
        // 어차피 연수를 입력 받으므로
        // 직원들의 전체 랜덤한 증가율을 미리 할당한 이후
        // 그다음에 7년치를 계산하도록 한다.
        allocEmpIncRatio(year);
        calcPayment(year);
    }
}
