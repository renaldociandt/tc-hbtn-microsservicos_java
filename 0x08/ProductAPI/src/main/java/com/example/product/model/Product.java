package com.example.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long id;
    private String code;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime createdOne;
    private Boolean status;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (!id.equals(product.id)) return false;
        if (!code.equals(product.code)) return false;
        if (!name.equals(product.name)) return false;
        if (!description.equals(product.description)) return false;
        if (!price.equals(product.price)) return false;
        if (!createdOne.equals(product.createdOne)) return false;
        return status.equals(product.status);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + code.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + createdOne.hashCode();
        result = 31 * result + status.hashCode();
        return result;
    }
}
