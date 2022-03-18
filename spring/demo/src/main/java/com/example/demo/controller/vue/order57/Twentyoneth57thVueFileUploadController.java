package com.example.demo.controller.vue.order57;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
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

                // 필요하다면 생성 날자와 시간(date) 정보를 추가
                // 좀 더 구별이 필요하다면 아이디까지 같이 결합시켜도 무방
                // 아이디/날자/이미지
                FileOutputStream writer = new FileOutputStream(
                        "./images/" + multipartFile.getOriginalFilename());

                log.info("디렉토리에 파일 배치 성공!");

                writer.write(multipartFile.getBytes());
                writer.close();
            }
        } catch (Exception e) {
            return "Upload Fail!!!";
        }

        log.info("requestUploadFile(): Success!!!");

        return "Upload Success!!!";
    }
}
