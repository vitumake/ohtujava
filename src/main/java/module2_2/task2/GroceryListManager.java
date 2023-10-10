package module2_2.task2;

import java.util.HashMap;

public class GroceryListManager {
    private HashMap<String, Double> groceryList = new HashMap<>();

    public void addItem(String item, double cost) {
        groceryList.put(item, cost);
    }

    public Double removeItem(String item) {
        return groceryList.remove(item);
    }

    public void displayList() {
        groceryList.forEach((k, v)->{
            System.out.println(k+" Cost: "+v+"e");
        });
    }

    public boolean checkItem(String item) {
        return groceryList.get(item)==null?false:true;
    }

    public double calculateTotalCost() {
        return groceryList.values().stream().reduce(0.0, (a, b)->a+b);
    }

    public static void main(String[] args) {
        GroceryListManager gList = new GroceryListManager();

        System.out.println("Grocery list:");
        gList.addItem("Apples", 0.5);
        gList.addItem("Milk", 1.5);
        gList.addItem("Bread", 2.2);
        gList.displayList();
        System.out.print("\nTotal cost of products in list: "+gList.calculateTotalCost()+"e\n");

        System.out.print("\n Is \"Milk\" in the grocery list? " + gList.checkItem("Milk"));
        System.out.println("\nRemoving \"Milk\" from the grocery list...");
        gList.removeItem("Milk");

        System.out.println("\nUpdated grocery list:");
        gList.displayList();
        System.out.print("\nTotal cost of products in list: "+gList.calculateTotalCost()+"e");
    }
}
