package com.apollo.federation.java.tools;

import java.util.List;

public class User {
    private String id;
    private List<Product> recentPurchasedProducts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getRecentPurchasedProducts() {
        return recentPurchasedProducts;
    }

    public void setRecentPurchasedProducts(List<Product> recentPurchasedProducts) {
        this.recentPurchasedProducts = recentPurchasedProducts;
    }
}
