package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    Map<Product, Integer> cartMap = new HashMap<>();


    public void add(Product product, int addQuantity) {
        /*if (cart.get(product) == null) {
            cart.put(product, quantity);
        } else {
            cart.put(product, cart.get(product) + quantity);
        }*/
        int existingQuantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, existingQuantity + addQuantity);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Product product : cartMap.keySet()) {
            System.out.println("상품: " + product + " 수량: " + cartMap.get(product));
        }
    }

    public void minus(Product product, int minusQuantity) {
        /*cartMap.remove(product, quantity);*/
        int existingQuantity = cartMap.getOrDefault(product, 0);

        int newQuantity = existingQuantity - minusQuantity;
        if (newQuantity <= 0) {
            cartMap.remove(product);
        } else {
            cartMap.put(product, newQuantity);
        }
    }
}
