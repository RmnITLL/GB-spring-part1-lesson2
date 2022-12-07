package ru.gb.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class CartMain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("ru.gb.context");
        Cart cart = context.getBean(Cart.class);
        //cart.createCartOrder(3L);

        Scanner sc = new Scanner(System.in);
        Long id = sc.nextLong();
        cart.createCartOrder(id);

        context.close();
    }
}
