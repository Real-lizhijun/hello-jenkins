package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello Controller
 *
 * @author: lizhijun
 * @date: 2023-10-09 8:47:55
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello-jenkins-finally";
    }
}
