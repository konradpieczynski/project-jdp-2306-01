package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.OrderDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/orders")
@CrossOrigin("*")
@RequiredArgsConstructor
public class OrderController {

    @GetMapping
    public List<OrderDto> getOrders() {
        return new ArrayList<>();

    }

    @PostMapping
    public void createOrder(OrderDto orderDto) {

    }

    @GetMapping(value = "{orderId}")
    public OrderDto getOrder(@PathVariable Long orderId) {
        return new OrderDto(1L);

    }

    @PutMapping
    public OrderDto updateOrder(OrderDto orderDto) {
        return new OrderDto(1L);
    }

    @DeleteMapping
    public void deleteOrder(Long orderId) {

    }


}
