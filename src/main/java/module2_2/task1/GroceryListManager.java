package module2_2.task1;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addItem(String item) {
        groceryList.add(item);
    }

    public String removeItem(String item) {
        int i = checkItem(item);
        return i>-1?groceryList.remove(i):null;
    }

    public void displayList() {
        groceryList.forEach(i->System.out.println(checkItem(i)+1+". "+i));
    }

    public int checkItem(String item) {
        return groceryList.indexOf(item);
    }

    public static void main(String[] args) {
        GroceryListManager gList = new GroceryListManager();

        System.out.println("Grocery list:");
        gList.addItem("Apples");
        gList.addItem("Milk");
        gList.addItem("Bread");

        gList.displayList();

        System.out.print("\n Is \"Milk\" in the grocery list? " + (gList.checkItem("Milk")>-1?true:false));
        System.out.println("\nRemoving \"Milk\" from the grocery list...");
        gList.removeItem("Milk");

        System.out.println("\nUpdated grocery list:");
        gList.displayList();
    }
}