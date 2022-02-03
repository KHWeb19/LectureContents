package com.example.demo.entity.order30.probBank;

import lombok.Getter;

@Getter
public class EddiLotto {
    int totalNum;
    int selectNum;

    int[] peopleArr;
    int[] selectArr;

    int max, range;
    final int MIN = 1;

    public EddiLotto(final int totalNum, final int selectNum) {
        this.totalNum = totalNum;
        this.selectNum = selectNum;

        max = totalNum;
        range = max - MIN + 1;

        peopleArr = new int[totalNum];
        selectArr = new int[selectNum];
    }

    public boolean isDuplicate (int rand, int[] arr, int cnt) {
        for (int i = 0; i < cnt; i++) {
            if (arr[i] == rand) {
                return true;
            }
        }

        return false;
    }

    public void allocPeopleNumber () {
        int rand;

        for (int i = 0; i < totalNum; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (isDuplicate(rand, peopleArr, i));

            peopleArr[i] = rand;
        }
    }
    public void allocSelectNumber () {
        int rand;

        for (int i = 0; i < selectNum; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (isDuplicate(rand, selectArr, i));

            selectArr[i] = rand;
        }
    }

    public void allocNonDuplicateArrNumber (final int cnt, int[] arr) {
        int rand;

        for (int i = 0; i < cnt; i++) {
            do {
                rand = (int) (Math.random() * range + MIN);
            } while (isDuplicate(rand, arr, i));

            arr[i] = rand;
        }
    }

    public void printPeopleArr () {
        for (int i = 1; i <= totalNum; i++) {
            //System.out.printf("%4d", peopleArr[i - 1]);

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public void checkWinner () {
        for (int i = 0; i < selectNum; i++) {
            for (int j = 0; j < totalNum; j++) {
                if (selectArr[i] == peopleArr[j]) {
                    //System.out.printf("위치 %d 당첨!!!\n", j);
                    break;
                }
            }
        }
    }

    public void raffle () {
        allocNonDuplicateArrNumber(totalNum, peopleArr);
        allocNonDuplicateArrNumber(selectNum, selectArr);
        checkWinner();
    }
}
