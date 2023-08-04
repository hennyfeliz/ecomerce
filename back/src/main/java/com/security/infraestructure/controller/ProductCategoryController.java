package com.security.infraestructure.controller;

import com.security.application.service.ProductCategoryService;
import com.security.domain.model.ProductCategory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {
    private final ProductCategoryService productCategoryService;

    public ProductCategoryController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }

    @GetMapping("/")
    public ResponseEntity<List<ProductCategory>> getAllProductCategorys(){
        List<ProductCategory> productCategorys = productCategoryService.getAllProductCategorys();
        return new ResponseEntity<>(productCategorys, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductCategory> getProductCategoryById(@PathVariable Long id){
        return productCategoryService.getProductCategoryById(id)
                .map(productCategory -> new ResponseEntity<>(productCategory, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<ProductCategory> getProductCategoryByName(@PathVariable String name){
        return productCategoryService.getProductCategoryByName(name)
                .map(productCategory -> new ResponseEntity<>(productCategory, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/")
    public ResponseEntity<ProductCategory> createProductCategory(@RequestBody ProductCategory productCategory){
        ProductCategory createdProductCategory = productCategoryService.createProductCategory(productCategory);
        return new ResponseEntity<>(createdProductCategory, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductCategory> updateProductCategory(@PathVariable Long id, @RequestBody ProductCategory productCategory){
        return productCategoryService.updateProductCategory(id, productCategory)
                .map(productCategoryk -> new ResponseEntity<>(productCategoryk, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProductCategoryById(@PathVariable Long id){
        return (productCategoryService.deleteProductCategory(id)) ? ResponseEntity.ok("ProductCategory deleted.") : new ResponseEntity<>("ProductCategory not found", HttpStatus.NOT_FOUND);
    }
}
