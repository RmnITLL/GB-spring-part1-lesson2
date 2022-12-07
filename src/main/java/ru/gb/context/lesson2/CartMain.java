package ru.gb.context.lesson2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CartMain {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ProductService productService = context.getBean("productService", ProductService.class);
        Cart cart = context.getBean("cart", Cart.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);
        cart.addInCart(productService.findByTitle("product #1"));
        cart.addInCart(productService.findByTitle("product #3"));
        cart.addInCart(productService.findByTitle("product #2"));
        cart.addInCart(productService.findByTitle("product #5"));
        orderService.createOrderFromProduct();
        ((AnnotationConfigApplicationContext)context).close();
    }
}
