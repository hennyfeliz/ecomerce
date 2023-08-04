package com.security.infraestructure.controller;

import com.security.application.service.OrderDetailService;
import com.security.domain.model.OrderDetail;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderdetail")
public class OrderDetailController {
    private final OrderDetailService orderDetailDetailService;

    public OrderDetailController(OrderDetailService orderDetailDetailService) {
        this.orderDetailDetailService = orderDetailDetailService;
    }

    @GetMapping("/")
    public ResponseEntity<List<OrderDetail>> getAllOrderDetails(){
        List<OrderDetail> orderDetailDetails = orderDetailDetailService.getAllOrderDetails();
        return new ResponseEntity<>(orderDetailDetails, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDetail> getOrderDetailById(@PathVariable Long id){
        return orderDetailDetailService.getOrderDetailById(id)
                .map(orderDetailDetail -> new ResponseEntity<>(orderDetailDetail, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/")
    public ResponseEntity<OrderDetail> createOrderDetail(@RequestBody OrderDetail orderDetailDetail){
        OrderDetail createdOrderDetail = orderDetailDetailService.createOrderDetail(orderDetailDetail);
        return new ResponseEntity<>(createdOrderDetail, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrderDetail> updateOrderDetail(@PathVariable Long id, @RequestBody OrderDetail orderDetailDetail){
        return orderDetailDetailService.updateOrderDetail(id, orderDetailDetail)
                .map(orderDetailDetailk -> new ResponseEntity<>(orderDetailDetailk, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOrderDetailById(@PathVariable Long id){
        return (orderDetailDetailService.deleteOrderDetail(id)) ? ResponseEntity.ok("OrderDetail deleted.") : new ResponseEntity<>("OrderDetail not found", HttpStatus.NOT_FOUND);
    }
}
