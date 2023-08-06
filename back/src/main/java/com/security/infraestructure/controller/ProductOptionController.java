package com.security.infraestructure.controller;

import com.security.application.service.ProductOptionService;
import com.security.domain.model.ProductOption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productOption")
public class ProductOptionController {
    private final ProductOptionService productOptionService;

    public ProductOptionController(ProductOptionService productOptionService) {
        this.productOptionService = productOptionService;
    }

    @GetMapping("/")
    public ResponseEntity<List<ProductOption>> getAllProductOptions(){
        List<ProductOption> productOptions = productOptionService.getAllProductOptions();
        return new ResponseEntity<>(productOptions, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductOption> getProductOptionById(@PathVariable Long id){
        return productOptionService.getProductOptionById(id)
                .map(productOption -> new ResponseEntity<>(productOption, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/")
    public ResponseEntity<ProductOption> createProductOption(@RequestBody ProductOption productOption){
        ProductOption createdProductOption = productOptionService.createProductOption(productOption);
        return new ResponseEntity<>(createdProductOption, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductOption> updateProductOption(@PathVariable Long id, @RequestBody ProductOption productOption){
        return productOptionService.updateProductOption(id, productOption)
                .map(productOptionk -> new ResponseEntity<>(productOptionk, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProductOptionById(@PathVariable Long id){
        return (productOptionService.deleteProductOption(id)) ? ResponseEntity.ok("ProductOption deleted.") : new ResponseEntity<>("ProductOption not found", HttpStatus.NOT_FOUND);
    }
}
