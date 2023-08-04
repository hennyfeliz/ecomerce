package com.security.infraestructure.repository.impl;

import com.security.domain.model.Order;
import com.security.domain.ports.out.OrderRepositoryPort;
import com.security.infraestructure.repository.JpaOrderRepository;
import com.security.infraestructure.entities.OrderEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaOrderRepositoryAdapter implements OrderRepositoryPort {
    public final JpaOrderRepository jpaOrderRepository;

    public JpaOrderRepositoryAdapter(JpaOrderRepository jpaOrderRepository) {
        this.jpaOrderRepository = jpaOrderRepository;
    }

    @Override
    public Order save(Order order) {
        OrderEntity orderEntity = OrderEntity.fromDomainModel(order);
        OrderEntity savedOrder = jpaOrderRepository.save(orderEntity);
        return savedOrder.toDomainModel();
    }

    @Override
    public Optional<Order> findById(Long id) {
        return jpaOrderRepository.findById(id)
                .map(OrderEntity::toDomainModel);
    }

    @Override
    public List<Order> findAll() {
        return jpaOrderRepository.findAll().stream()
                .map(OrderEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Order> update(Order order) {
        if(jpaOrderRepository.existsById(order.getId())){
            OrderEntity orderEntity = OrderEntity.fromDomainModel(order);
            OrderEntity updatedOrder = jpaOrderRepository.save(orderEntity);
            return Optional.of(updatedOrder.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaOrderRepository.existsById(id)){
            jpaOrderRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
