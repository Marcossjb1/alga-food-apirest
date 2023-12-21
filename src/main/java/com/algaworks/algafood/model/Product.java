package com.algaworks.algafood.model;

import java.math.BigDecimal;

public class Product {

    private String nameOfProduct;
    private BigDecimal totalValue;

    public Product(String nameOfProduct, BigDecimal totalValue) {
        super();
        this.nameOfProduct = nameOfProduct;
        this.totalValue = totalValue;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }
}
