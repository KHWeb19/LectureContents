package com.example.demo.entity.order30.probBank;

import lombok.Data;

import java.awt.*;

@Data
public class RegularPolygon {
    private float sideLength;
    //private float numOfSideLen;
    private float area;
    
    // 정삼각형이던, 정사각형이던, 정육각형이던
    // 어떤 형태던 가리지 않고 일반화된 형태로 문제를 풀길 원함
    // 그럼 N 각형에 대해서도 항상 동일한 패턴을 적용할 수 있을 것임
    // 아래 전략은 일반화시킬 수 있는 스마트한 방법을 찾지 못해서임
    // (근대 기억하기론 존재함 - 여기가 수학 올림피아드는 아니니까 구지 이럴 필욘 없어보임)

    /* 아래가 정삼각형이라 가정하고 변의 길이가 2라고 가정

                /|
               / | 4^2 =  2^2    + x^2 ===> x = 2 * sqrt(3)
          2  /   | 2^2 =  1^2    + x^2 ===> x = sqrt(3)
            /    | 1^2 = (1/2)^2 + x^2 ===> x = sqrt(3) / 2
           /-----|
              1

              정삼각형 넓이: 변의 길이 x 변의 길이 x [sqrt(3) / 2] / 2
              정사각형 넓이: 변의 길이 x 변의 길이
              정육각형 넓이: 3 * sqrt(3) * 변의 길이 / 2
         */
    public RegularPolygon (float sideLength) {
        this.sideLength = sideLength;
    }

    public void calcTriangleArea () {
        area = (sideLength * sideLength * (float) Math.sqrt(3.0f) / 2.0f) / 2.0f;
    }
    public void calcRectangleArea () {
        area = sideLength * sideLength;
    }
    public void calcHexagonArea () {
        area = 3.0f * (float) Math.sqrt(3.0f) * sideLength / 2.0f;
    }
}
