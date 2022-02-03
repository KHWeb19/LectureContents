package com.example.demo.entity.order30.response;

import com.example.demo.entity.order30.EddiLotto;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class LottoResponse {
    Map<Integer, String> selectArrMap;

    public LottoResponse (EddiLotto el) {
        selectArrMap = new HashMap<>();
        int[] selectArr = el.getSelectArr();

        for (int i = 0; i < selectArr.length; i++) {
            selectArrMap.put(selectArr[i], "O");
        }
    }
}
