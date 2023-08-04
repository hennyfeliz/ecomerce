package com.security.infraestructure.controller;

import com.security.application.service.ShoppingCartService;
import com.security.domain.model.ShoppingCart;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/")
    public ResponseEntity<List<ShoppingCart>> getAllShoppingCarts(){
        List<ShoppingCart> shoppingCarts = shoppingCartService.getAllShoppingCarts();
        return new ResponseEntity<>(shoppingCarts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ShoppingCart> getShoppingCartById(@PathVariable Long id){
        return shoppingCartService.getShoppingCartById(id)
                .map(shoppingCart -> new ResponseEntity<>(shoppingCart, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/")
    public ResponseEntity<ShoppingCart> createShoppingCart(@RequestBody ShoppingCart shoppingCart){
        ShoppingCart createdShoppingCart = shoppingCartService.createShoppingCart(shoppingCart);
        return new ResponseEntity<>(createdShoppingCart, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ShoppingCart> updateShoppingCart(@PathVariable Long id, @RequestBody ShoppingCart shoppingCart){
        return shoppingCartService.updateShoppingCart(id, shoppingCart)
                .map(shoppingCartk -> new ResponseEntity<>(shoppingCartk, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteShoppingCartById(@PathVariable Long id){
        return (shoppingCartService.deleteShoppingCart(id)) ? ResponseEntity.ok("ShoppingCart deleted.") : new ResponseEntity<>("ShoppingCart not found", HttpStatus.NOT_FOUND);
    }
}
