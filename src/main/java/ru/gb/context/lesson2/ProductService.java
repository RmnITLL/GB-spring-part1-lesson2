package ru.gb.context.lesson2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    private List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init() {
        products.add(new Product(1L, "Milk", 2.99));
        products.add(new Product(2L, "Orange", 1.99));
        products.add(new Product(3L, "Bread", 0.99));
        products.add(new Product(4L, "Cheese", 5.99));
        products.add(new Product(5L, "Milk", 2.99));
    }

    public void showAllProducts() {
        for (Product pre : products) {
            System.out.println(pre.toString());
        }
    }

    public Product findByTitle(String name) {
       return products.stream().filter(pre -> pre.getName().equals(name)).findFirst().get();
    }

    public Product getNameById(Long id) {
        return products.stream().filter(pre -> pre.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException());
    }



}
