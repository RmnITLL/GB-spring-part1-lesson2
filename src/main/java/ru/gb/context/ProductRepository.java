package ru.gb.context;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init() {
        products = (Arrays.asList(
                new Product(1L, "Milk", 0.99),
                new Product(2L, "Orange", 1.99),
                new Product(3L, "Whisky", 19.99),
                new Product(4L, "Cake", 3.99),
                new Product(5L, "Sausage", 2.99)
        ));
    }

    public Product findById(Long id) {
        return products.stream().filter(p -> p.getId().equals(id)).findFirst().orElseThrow(() -> new RuntimeException());
    }

    Iterable<Product> getProducts() {
        return products;
    }


}
