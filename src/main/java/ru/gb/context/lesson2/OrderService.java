package ru.gb.context.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderService {
    @Autowired
    Cart cart;

    public void createOrderFromProduct() {
        System.out.println("В корзине:");
        List<Product> orderServiceCart = cart.getCartProducts();
        for (Product pre : orderServiceCart) {
            System.out.println(pre.getName());
        }
    }
}
