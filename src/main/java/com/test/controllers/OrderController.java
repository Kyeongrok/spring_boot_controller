package com.test.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/order", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public class OrderController {

    @GetMapping(value = "/")
    public String getOrder() {
        return "success";
    }
}
