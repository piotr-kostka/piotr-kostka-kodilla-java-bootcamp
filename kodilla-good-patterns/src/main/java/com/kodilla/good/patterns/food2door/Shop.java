package com.kodilla.good.patterns.food2door;

public class Shop {

    private String shopName;
    private ProductOrder productOrder;

    public Shop(String shopName, ProductOrder productOrder) {
        this.shopName = shopName;
        this.productOrder = productOrder;
    }

    public String getShopName() {
        return shopName;
    }

    public ProductOrder getProductOrder() {
        return productOrder;
    }

    @Override
    public String toString() {
        return "shop: " + shopName + "; order: " + productOrder;
    }
}
