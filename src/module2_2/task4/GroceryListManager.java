package module2_2.task4;

import java.util.HashMap;

public class GroceryListManager {
        private HashMap<String, Integer> groceryList = new HashMap<>();

    public void addItemWithQuantity(String item, int amnt) {
        groceryList.put(item, amnt);
    }

    public int removeItem(String item) {
        return groceryList.remove(item);
    }

    public void displayAvailableItems() {
        groceryList.forEach((k, v)->{
            if(v>-1)System.out.println(k+" x "+v);
        });
    }

    public boolean checkItem(String item) {
        return groceryList.get(item)==null?false:true;
    }

    public void updateQuantity(String item, int amnt) {
        groceryList.put(item, amnt);
    }

    public static void main(String[] args) {
        GroceryListManager gList = new GroceryListManager();

        System.out.println("Grocery list:");
        gList.addItemWithQuantity("Apple", 5);
        gList.addItemWithQuantity("Milk", 1);
        gList.addItemWithQuantity("Bread", 2);
        gList.displayAvailableItems();

        gList.updateQuantity("Apple", 10);
        gList.updateQuantity("Milk", -1);

        System.out.println("\nUpdated grocery list:");
        gList.displayAvailableItems();
    }
}
