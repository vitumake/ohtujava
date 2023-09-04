package module2_2.task3;

import java.util.ArrayList;

public class GroceryListManager {
    private ArrayList<String[]> groceryList = new ArrayList<>();

    public void addItemWithCategory(String item, String ctgr) {
        groceryList.add(new String[]{item, ctgr});
    }

    public String removeItem(String item) {
        int i = checkItem(item);
        return i>-1?(groceryList.remove(i))[0]:null;
    }

    public void displayList() {
        groceryList.forEach(i->System.out.println(checkItem(i[0])+1+". "+i[0]));
    }

    public int checkItem(String item) {
        for (String[]i:groceryList) {
            if(i[0].matches(item)) return groceryList.indexOf(i);
        }
        return -1;
    }

    public void displayByCategory(String ctgr) {
        System.out.println("All items in category \""+ctgr+"\":");
        groceryList.forEach(i->{
            if(i[1].matches(ctgr))System.out.println(i[0]);
        });
    }

    public static void main(String[] args) {
        GroceryListManager gList = new GroceryListManager();

        System.out.println("Grocery list:");
        gList.addItemWithCategory("Apple", "Fruit");
        gList.addItemWithCategory("Pear", "Fruit");
        gList.addItemWithCategory("Milk", "Dairy");
        gList.addItemWithCategory("Bread", "Bakery");

        gList.displayList();
        gList.displayByCategory("Fruit");

        System.out.print("\n Is \"Apple\" in the grocery list? "+(gList.checkItem("Apple")>-1?true:false));
        System.out.println("\nRemoving \"Apple\" from the grocery list...");
        
        gList.removeItem("Apple");

        System.out.println("\nUpdated grocery list:");
        gList.displayList();
        gList.displayByCategory("Fruit");
    }
}