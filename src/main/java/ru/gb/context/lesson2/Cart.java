package ru.gb.context.lesson2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Cart {

    private List<Product> cartProducts;

    public List<Product> getCartProducts() {
        return cartProducts;
    }

    @PostConstruct
    public void initCart() {
        cartProducts = new ArrayList<>();
    }

    public void addInCart(Product productInCart) {
        cartProducts.add(productInCart);
    }

    public void removeFromCart(Product productFromCart) {
        cartProducts.remove(productFromCart);
    }

}
