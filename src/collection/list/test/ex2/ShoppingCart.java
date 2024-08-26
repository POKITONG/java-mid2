package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> list = new ArrayList<>();

    public void addItem(Item item) {
        list.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item item : list) {
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());

        }

        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int total = 0;
        for (Item item : list) {
            total += item.getTotalPrice();
        }

        return total;
    }
}
