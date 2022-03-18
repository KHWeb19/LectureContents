package com.example.demo.controller.vue.order57;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/57th/file")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
public class Twentyoneth57thVueFileUploadController {

    @ResponseBody
    @PostMapping("/uploadImg")
    public String requestUploadFile (
            @RequestParam("fileList") List<MultipartFile> fileList) {

        log.info("requestUploadFile(): " + fileList);

        try {
            for (MultipartFile multipartFile : fileList) {
                log.info("requestUploadFile() - Make file: " +
                        multipartFile.getOriginalFilename());
            }
        } catch (Exception e) {
            return "Upload Fail!!!";
        }

        log.info("requestUploadFile(): Success!!!");

        return "Upload Success!!!";
    }
}
