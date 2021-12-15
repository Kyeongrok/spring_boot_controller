package com.test.controllers;

import com.test.domains.Order;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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


    @GetMapping(value = "/json")
    public Order getOrder2(@RequestParam(name = "limit", defaultValue = "100" ) Integer limit) {
        Order order = new Order();
        order.setId(0);
        order.setName("order1");
        return order;
    }

    @GetMapping(value = "/json_list")
    public List<Order> getOrderList(@RequestParam(name = "limit", defaultValue = "100" ) Integer limit) {
        Order order = new Order();
        order.setId(0);
        order.setName("order1");
        List l = new ArrayList();
        l.add(order);
        return l;
    }
}
