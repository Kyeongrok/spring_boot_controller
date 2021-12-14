package com.test.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/order")
public class OrderController {

    @GetMapping(value = "/")
    public String getOrder(@RequestParam(name = "limit", defaultValue = "100" ) Integer limit) {
        return "success";
    }

    @PostMapping(value = "/")
    public String getOrderPost() {
        return "success";
    }
}
