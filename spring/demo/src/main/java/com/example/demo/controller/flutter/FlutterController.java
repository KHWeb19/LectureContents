package com.example.demo.controller.flutter;

import com.example.demo.controller.flutter.request.FlutterRequest;
import com.example.demo.controller.jpa.order58.request.MemberRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/flutter-test")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FlutterController {

    @PostMapping("/login")
    public Boolean flutterMemberLogin (@RequestBody FlutterRequest request) {
        log.info("flutterMemberLogin(): " + request);

        return true;
    }
}
