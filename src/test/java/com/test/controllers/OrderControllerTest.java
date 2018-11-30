package com.test.controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderControllerTest {

    @Autowired
    protected TestRestTemplate restTemplate;

    @Test
    public void testGetOrder() {
        String body = this.restTemplate.getForObject("/api/v1/order/", String.class);
        assertEquals("success", body);
    }

    @Test
    public void testGetOrderPost() {
        HttpEntity<String> request = new HttpEntity<>("");
        String body = this.restTemplate.postForObject("/api/v1/order/", request, String.class);
        assertEquals("success", body);
    }
}