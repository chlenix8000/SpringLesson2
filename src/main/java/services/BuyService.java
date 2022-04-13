package services;

import entities.Cart;
import entities.ProductRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class BuyService {
    ProductRepository productRepository;
    Cart cart;
    public BuyService(ProductRepository productRepository, Cart cart) {
        this.productRepository = productRepository;
        this.cart = cart;
    }
    @PostConstruct
    public void start() {
        System.out.println("Консольное приложение");
        System.out.println(productRepository.getProducts().toString());
    }
}
