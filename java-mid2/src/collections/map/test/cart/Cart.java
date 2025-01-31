package collections.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int count) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) +count);
    }

    public void minus(Product product, int count) {
        int countOfProduct = cartMap.get(product);
        if (countOfProduct <= count) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, cartMap.get(product) - count);
        }
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println(product + ", 수량 : "+ cartMap.get(product));
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartMap=" + cartMap +
                '}';
    }
    // 코드 작성
}
