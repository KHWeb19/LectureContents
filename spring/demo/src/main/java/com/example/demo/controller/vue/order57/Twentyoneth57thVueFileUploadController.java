package com.example.demo.controller.vue.order57;

import com.example.demo.controller.vue.order57.request.RequestFileInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/57th/file")
@CrossOrigin(origins = "http://localhost:8081", allowedHeaders = "*")
public class Twentyoneth57thVueFileUploadController {

    //@Autowired
    //FileUploadService service;

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
                /*
                FileOutputStream writer = new FileOutputStream(
                        "./images/" + multipartFile.getOriginalFilename());
                 */
                FileOutputStream writer = new FileOutputStream(
                        "../../vcli/frontend_lecture/src/assets/uploadImg/" + multipartFile.getOriginalFilename());


                log.info("디렉토리에 파일 배치 성공!");

                writer.write(multipartFile.getBytes());

                //service.recordFileInfo("vue_path/" + multipartFile.getOriginalFilename());

                writer.close();
            }
        } catch (Exception e) {
            return "Upload Fail!!!";
        }

        log.info("requestUploadFile(): Success!!!");

        return "Upload Success!!!";
    }

    @ResponseBody
    @PostMapping(value = "/uploadImgWithString", consumes = {MediaType.MULTIPART_FORM_DATA_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String requestUploadFileWithString (
            @RequestPart(value="fileList") List<MultipartFile> fileList,
            @RequestPart(value="info") RequestFileInfo info
            ) {

        log.info("requestUploadFile(): " + fileList);
        log.info("info: " + info);

        try {
            for (MultipartFile multipartFile : fileList) {
                log.info("requestUploadFile() - Make file: " +
                        multipartFile.getOriginalFilename());

                FileOutputStream writer = new FileOutputStream(
                        "../../vcli/frontend_lecture/src/assets/uploadImg/" + multipartFile.getOriginalFilename());

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
