
import java.util.ArrayList;

class CartItem {
    String name;
    int price;
    int qty;

    CartItem(String name, int price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    int lineTotal() {
        return price * qty;
    }
}

public class ShoppingCart {
    private ArrayList<CartItem> items = new ArrayList<>();

    private int indexOf(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).name.equalsIgnoreCase(name))
                return i;
        }
        return -1;
    }

    public void add(String name, int price, int qty) {
        int index = indexOf(name);
        if (index != -1) {
            items.get(index).qty += qty;
        } else {
            items.add(new CartItem(name, price, qty));
        }
    }

    public void remove(String name) {
        int index = indexOf(name);
        if (index != -1)
            items.remove(index);
        else
            System.out.println("Item not found");
    }

    public void updateQty(String name, int qty) {
        int index = indexOf(name);
        if (index == -1) {
            System.out.println("Item not found");
        } else if (qty <= 0) {
            items.remove(index);
        } else {
            items.get(index).qty = qty;
        }
    }

    public void printBill() {
        int subtotal = 0;
        for (int i = 0; i < items.size(); i++)
            subtotal += items.get(i).lineTotal();

        int discount = 0;
        if (subtotal >= 1000)
            discount = subtotal / 10;

        int amount = subtotal - discount;
        int delivery = 0;
        if (amount < 500)
            delivery = 40;

        int total = amount + delivery;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Delivery: " + delivery);
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.add("Pen", 20, 5);
        cart.add("Notebook", 60, 10);
        cart.add("Bag", 450, 1);
        cart.add("Pen", 20, 5);

        System.out.println("Bill:");
        cart.printBill();

        cart.remove("Bag");
        System.out.println("After removing Bag:");
        cart.printBill();

        cart.updateQty("Notebook", 2);
        System.out.println("After updating Notebook:");
        cart.printBill();
    }
}
