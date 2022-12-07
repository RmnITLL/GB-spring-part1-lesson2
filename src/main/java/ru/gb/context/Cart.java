package ru.gb.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cart {

    private ProductService productService;

    @Autowired
    public Cart(ProductService productService) {
        this.productService = productService;
    }

    public void createCartOrder(Long productId) {
        System.out.println("В корзине продукт(ы): ");
        System.out.print(productService.getTitleById(productId));
    }
}
