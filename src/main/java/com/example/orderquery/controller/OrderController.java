package com.example.orderquery.controller;


import com.example.orderquery.domain.request.OrderRequest;
import com.example.orderquery.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class OrderController {
    private final OrderService service;
    @PostMapping
    public void save(@RequestBody OrderRequest request){
        service.save(request);
    }
}
