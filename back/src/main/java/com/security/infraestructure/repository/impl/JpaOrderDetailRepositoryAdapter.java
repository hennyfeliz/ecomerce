package com.security.infraestructure.repository.impl;

import com.security.domain.model.OrderDetail;
import com.security.domain.ports.out.OrderDetailRepositoryPort;
import com.security.infraestructure.repository.JpaOrderDetailRepository;
import com.security.infraestructure.entities.OrderDetailEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaOrderDetailRepositoryAdapter implements OrderDetailRepositoryPort {
    public final JpaOrderDetailRepository jpaOrderDetailRepository;

    public JpaOrderDetailRepositoryAdapter(JpaOrderDetailRepository jpaOrderDetailRepository) {
        this.jpaOrderDetailRepository = jpaOrderDetailRepository;
    }

    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        OrderDetailEntity orderDetailEntity = OrderDetailEntity.fromDomainModel(orderDetail);
        OrderDetailEntity savedOrderDetail = jpaOrderDetailRepository.save(orderDetailEntity);
        return savedOrderDetail.toDomainModel();
    }

    @Override
    public Optional<OrderDetail> findById(Long id) {
        return jpaOrderDetailRepository.findById(id)
                .map(OrderDetailEntity::toDomainModel);
    }

    @Override
    public List<OrderDetail> findAll() {
        return jpaOrderDetailRepository.findAll().stream()
                .map(OrderDetailEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<OrderDetail> update(OrderDetail orderDetail) {
        if(jpaOrderDetailRepository.existsById(orderDetail.getId())){
            OrderDetailEntity orderDetailEntity = OrderDetailEntity.fromDomainModel(orderDetail);
            OrderDetailEntity updatedOrderDetail = jpaOrderDetailRepository.save(orderDetailEntity);
            return Optional.of(updatedOrderDetail.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if(jpaOrderDetailRepository.existsById(id)){
            jpaOrderDetailRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
