package com.security.domain.ports.in;

import com.security.domain.model.OrderDetail;

import java.util.List;
import java.util.Optional;

public interface OrderDetailUseCase {
    OrderDetail createOrderDetail(OrderDetail orderDetail);
    Optional<OrderDetail> getOrderDetailById(Long id);
    List<OrderDetail> getAllOrderDetails();
    Optional<OrderDetail> updateOrderDetail(Long id, OrderDetail orderDetail);
    boolean deleteOrderDetail(Long id);
}
