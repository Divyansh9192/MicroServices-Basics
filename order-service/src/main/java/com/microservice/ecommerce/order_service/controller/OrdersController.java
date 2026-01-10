package com.microservice.ecommerce.order_service.controller;

import com.microservice.ecommerce.order_service.dto.OrderRequestDTO;
import com.microservice.ecommerce.order_service.entity.Orders;
import com.microservice.ecommerce.order_service.service.OrdersService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
@Slf4j
public class OrdersController {
    private final OrdersService ordersService;

    @GetMapping("/helloOrders")
    public String helloFromOrders(){
        return "Hello From Orders Service";
    }

    @GetMapping
    public ResponseEntity<List<OrderRequestDTO>> getAllOrders(){
        List<OrderRequestDTO> orders = ordersService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderRequestDTO> getOrderById(@PathVariable Long id){
        OrderRequestDTO order = ordersService.getOrderById(id);
        return ResponseEntity.ok(order);
    }
}
