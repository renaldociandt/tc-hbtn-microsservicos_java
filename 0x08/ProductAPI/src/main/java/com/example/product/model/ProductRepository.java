package com.example.product.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ProductRepository {

    private List<Product> list = new ArrayList<Product>();

    public List<Product> getAllProducts() {
        return list;

    }

    public Product getProductById(Integer id) {
        for (Product product: list) {
            if (product.getId() == id.longValue()){
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product s) {

        list.add(s);
    }

    public Long buscarProduto(){
        for (Product product: list) {
            return product.getId();
        }
        return null;
    }

    public void updateProduct(Product s) {
        if (Objects.equals(buscarProduto(), s.getId())){
            list.set(buscarProduto().intValue(), s);
        }

    }

    public void removeProduct(Product s) {
        list.remove(s);

    }

    public void addList(List<Product> listOfProducts) {
        list.addAll(listOfProducts);

    }
}