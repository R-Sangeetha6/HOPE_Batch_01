package com.ecommerce.service;
import com.ecommerce.model.Product;
import java.util.*;
public class CartService {
    private ArrayList<Product> cart=new ArrayList<>();
    public void addProduct(Product product){
        cart.add(product);
    }
    public int calculateTotal(){
        int total=0;
        for(Product product:cart){
            total+=product.getPrice();
        }
        return total;
    }
    public void showCart(){
        for(Product p:cart){
            p.display();
        }
    }
}
