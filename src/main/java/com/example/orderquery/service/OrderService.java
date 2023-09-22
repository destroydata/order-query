package com.example.orderquery.service;

import com.example.orderquery.domain.entity.Order;
import com.example.orderquery.domain.request.OrderRequest;
import com.example.orderquery.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;
    public void save(OrderRequest orderRequest){
        Order save = orderRepository.save(orderRequest.toEntity());
    }
    public List<Order> getAll(){
        return orderRepository.findAll();
    }
}
