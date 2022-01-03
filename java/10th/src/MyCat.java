public class MyCat {
    int age;
    float weight;
    final String defaultSound = "Meow";

    final int FEED = 1;
    final int TRAINING = 2;
    final int RANGE = TRAINING - FEED + 1;

    final int SCHEDULE_NUM = 3;

    int scheduleNum;

    int simulationCnt;

    public void initMyCat (int age, float weight) {
        this.age = age;
        this.weight = weight;

        simulationCnt = 0;
    }
    private void feed () {
        System.out.println("고오급 사료를 먹습니다!");

        weight += 0.1f;

        System.out.println("운동 하세요!");
    }
    private void warningMessage () {
        System.out.println(defaultSound);

        if (weight > 8) {
            System.out.printf("운동 안하면 고양이 비만 됩니다: %.1f\n", weight);
        } else if (weight < 6) {
            System.out.printf("너무 많이 빼도 위험합니다: %.1f\n", weight);
        } else {
            System.out.printf("현재 고양이는 정상입니다: %.1f\n", weight);
        }
    }
    private void training () {
        weight -= 0.1f;

        System.out.println("몸무게를 조금 뺀것 같습니다!");
    }
    private int getRandomPattern () {
        return (int) (Math.random() * RANGE + FEED);
    }

    public void simulation () {
        boolean endFlag = false;
        int cnt = 0;

        while (true) {
            System.out.println("오늘은 무엇을 할까요 ? (하루 일과는 3가지를 선택합니다)");

            for (int i = 0; i < SCHEDULE_NUM; i++) {
                scheduleNum = getRandomPattern();

                switch (scheduleNum) {
                    case FEED:
                        feed();
                        break;
                    case TRAINING:
                        training();
                        break;
                }

                warningMessage();
                cnt++;

                if (cnt > 365) {
                    System.out.println("냥이는 가족들과 함께 오래오래 햄볶하게 살았답니다 ^^");
                    endFlag = true;
                    break;
                } else if (weight > 12.0f) {
                    System.out.println("병원 ㅠ");
                    endFlag = true;
                    break;
                } else if (weight < 5.1f) {
                    System.out.println("병원 가요 ㅠ");
                    endFlag = true;
                    break;
                }
            }

            if (endFlag) {
                break;
            }
        }
    }

    private boolean checkSimulation () {
        boolean checkSim = false;

        simulationCnt++;
        System.out.printf("%d 일차!", simulationCnt);

        if (simulationCnt > 365) {
            System.out.println("냥이는 가족들과 함께 오래오래 햄볶하게 살았답니다 ^^");
        } else if (weight > 12.0f) {
            System.out.println("병원 ㅠ");
        } else if (weight < 5.1f) {
            System.out.println("병원 가요 ㅠ");
        } else {
            checkSim = true;
            return checkSim;
        }

        return checkSim;
    }

    public void simulation2 () {
        boolean endFlag = false;
        int cnt = 0;

        while (checkSimulation()) {
            System.out.println("오늘은 무엇을 할까요 ? (하루 일과는 3가지를 선택합니다)");

            for (int i = 0; i < SCHEDULE_NUM; i++) {
                scheduleNum = getRandomPattern();

                switch (scheduleNum) {
                    case FEED:
                        feed();
                        break;
                    case TRAINING:
                        training();
                        break;
                }

                warningMessage();
            }
        }
    }
}
