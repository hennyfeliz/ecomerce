package com.security.infraestructure.config;

import com.security.application.service.*;
import com.security.application.usecase.*;
import com.security.domain.ports.out.*;
import com.security.infraestructure.repository.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    // users beans config

    @Bean
    public UserService userService(UserRepositoryPort userRepositoryPort){
        return new UserService(new UserUseCaseImpl(userRepositoryPort));
    }

    @Bean
    public UserRepositoryPort userRepositoryPort(JpaUserRepositoryAdapter jpaUserRepositoryAdapter){
        return jpaUserRepositoryAdapter;
    }

    // product category beans config

    @Bean
    public ProductCategoryService productCategoryService(ProductCategoryRepositoryPort productCategoryRepositoryPort){
        return new ProductCategoryService(new ProductCategoryUseCaseImpl(productCategoryRepositoryPort));
    }

    @Bean
    public ProductCategoryRepositoryPort productCategoryRepositoryPort(JpaProductCategoryRepositoryAdapter jpaProductCategoryRepositoryAdapter){
        return jpaProductCategoryRepositoryAdapter;
    }

    // product beans config

    @Bean
    public ProductService productService(ProductRepositoryPort productRepositoryPort){
        return new ProductService(new ProductUseCaseImpl(productRepositoryPort));
    }

    @Bean
    public ProductRepositoryPort productRepositoryPort(JpaProductRepositoryAdapter jpaProductRepositoryAdapter){
        return jpaProductRepositoryAdapter;
    }

    // order beans config

    @Bean
    public OrderService orderService(OrderRepositoryPort orderRepositoryPort){
        return new OrderService(new OrderUseCaseImpl(orderRepositoryPort));
    }

    @Bean
    public OrderRepositoryPort orderRepositoryPort(JpaOrderRepositoryAdapter jpaOrderRepositoryAdapter){
        return jpaOrderRepositoryAdapter;
    }

    // order details beans config

    @Bean
    public OrderDetailService orderDetailService(OrderDetailRepositoryPort orderDetailRepositoryPort){
        return new OrderDetailService(new OrderDetailUseCaseImpl(orderDetailRepositoryPort));
    }

    @Bean
    public OrderDetailRepositoryPort orderDetailRepositoryPort(JpaOrderDetailRepositoryAdapter jpaOrderDetailRepositoryAdapter){
        return jpaOrderDetailRepositoryAdapter;
    }



    // shopping cart beans config

    @Bean
    public ShoppingCartService shoppingCartService(ShoppingCartRepositoryPort shoppingCartRepositoryPort){
        return new ShoppingCartService(new ShoppingCartUseCaseImpl(shoppingCartRepositoryPort));
    }

    @Bean
    public ShoppingCartRepositoryPort shoppingCartRepositoryPort(JpaShoppingCartRepositoryAdapter jpaShoppingCartRepositoryAdapter){
        return jpaShoppingCartRepositoryAdapter;
    }
}
