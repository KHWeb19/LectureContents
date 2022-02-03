package com.example.demo.entity.order30.probBank.response;

import com.example.demo.entity.order30.probBank.RegularPolygon;
import lombok.Data;

@Data
public class PolygonResponse {
    private float area;

    public PolygonResponse (RegularPolygon rp) {
        area = rp.getArea();
    }
}
