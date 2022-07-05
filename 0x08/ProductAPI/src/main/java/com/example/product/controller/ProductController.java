package com.example.product.controller;


import com.example.product.model.Product;
import com.example.product.model.ProductRepository;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductRepository productRepository = new ProductRepository();
    @ApiResponse(code = 12, message = "Responsável por retornar uma mensagem de boas vindas")
    @GetMapping("/welcome")
    public String mensagemBoasVindas() {

        return "BEM VINDO À PRODUCT REST API.";
    }

    @GetMapping(path = "/allProduct")
    @ApiResponse(code = 11, message = "Responsável por retornar uma lista de produtos")
    public List<Product> allProducts(){
        return productRepository.getAllProducts();
    }

    @ApiResponse(code = 12, message = "Responsável por retornar um produto pelo id")
    @GetMapping(path = "/findProductById/{id}")
    public Product findProductById(@PathVariable Integer id){
        return productRepository.getProductById(id);
    }

    @ApiResponse(code = 10, message = "Responsável por adicionar um produto")
    @PostMapping(path = "/addProduct", consumes = "application/json", produces = "application/json")
    public Product addProduct(@RequestBody Product product){
         productRepository.addProduct(product);
         return product;
    }

    @ApiResponse(code = 14, message = "Responsável por atualizar um produto")
    @PutMapping(path = "/updateProduct", consumes = "application/json", produces = "application/json")
    public void upadateProduct(@RequestBody Product product){
        productRepository.updateProduct(product);
    }

    @ApiResponse(code = 13, message = "Responsável por remover um produto")
    @DeleteMapping(path = "/removeProduct", consumes = "application/json", produces = "application/json")
    public void removeProduct(@RequestBody Product product){
        productRepository.removeProduct(product);
    }

}
