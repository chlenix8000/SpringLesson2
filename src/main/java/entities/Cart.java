package entities;

import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.Map;

@Component
//@Scope("prototype")
public class Cart {
    private Map<Integer, Product> newCart;

    public Cart() {
        newCart = new HashMap<Integer, Product>();
    }
    public Map<Integer, Product> getCart() {
        return newCart;
    }
}

