package com.example.ribbon.controller;

import com.example.ribbon.service.HiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hi")
public class HiControler {

    @Resource
    private HiService hiService;

    @GetMapping(value = "/test")
    public String test(@RequestParam String name) {
        return hiService.hiService(name);
    }
}
