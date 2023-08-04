package com.security.application.service;

import com.security.domain.model.OrderDetail;
import com.security.domain.ports.in.OrderDetailUseCase;

import java.util.List;
import java.util.Optional;

public class OrderDetailService implements OrderDetailUseCase {
    public final OrderDetailUseCase orderDetailUseCase;

    public OrderDetailService(OrderDetailUseCase orderDetailUseCase) {
        this.orderDetailUseCase = orderDetailUseCase;
    }

    @Override
    public OrderDetail createOrderDetail(OrderDetail orderDetail) {
        return orderDetailUseCase.createOrderDetail(orderDetail);
    }

    @Override
    public Optional<OrderDetail> getOrderDetailById(Long id) {
        return orderDetailUseCase.getOrderDetailById(id);
    }


    @Override
    public List<OrderDetail> getAllOrderDetails() {
        return orderDetailUseCase.getAllOrderDetails();
    }

    @Override
    public Optional<OrderDetail> updateOrderDetail(Long id, OrderDetail orderDetail) {
        return orderDetailUseCase.updateOrderDetail(id, orderDetail);
    }

    @Override
    public boolean deleteOrderDetail(Long id) {
        return orderDetailUseCase.deleteOrderDetail(id);
    }
}
