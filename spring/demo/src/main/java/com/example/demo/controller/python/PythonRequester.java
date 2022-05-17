package com.example.demo.controller.python;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/python-request")
public class PythonRequester {

    @GetMapping("spring2python")
    public ModelAndView spring2Python(Model model) {
        log.info("spring2Python()");

        List<HttpMessageConverter<?>> converters =
                new ArrayList<>();

        converters.add(new FormHttpMessageConverter());
        converters.add(new StringHttpMessageConverter());

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(converters);

        String result = restTemplate.getForObject(
                "http://localhost:5000/python-request",
                String.class
        );

        log.info("result = " + result);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("python/pyResult");

        model.addAttribute("resultMsg", result);

        return modelAndView;
    }
}
