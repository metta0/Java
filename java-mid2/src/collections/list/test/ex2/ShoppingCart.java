package collections.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items = new ArrayList<>();


    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");

        for (Item item : items) {
            System.out.println(item.getName() +',' + item.getTotalPrice());
        }

        int totalPrice = calculateTotal();
        System.out.println("전체 가격 합:" + totalPrice);
    }

    private int calculateTotal() {
        int totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
