package com.mdsantos.learningspring.resources;


import com.mdsantos.learningspring.entities.Category;
import com.mdsantos.learningspring.entities.Product;
import com.mdsantos.learningspring.services.CategoryService;
import com.mdsantos.learningspring.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    private final ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<List<Product>> findAll() {
        List<Product> orders = productService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable(value = "id") Long id) {
        Product order = productService.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(order);
    }
}
