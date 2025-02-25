import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class More_ArrayList {
    private static  Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        ArrayList<String> groceries = new ArrayList<>();
        boolean flag = true;
        while(flag){
            printActions();
            switch(Integer.parseInt(sc.nextLine())){
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }
    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add item(s) [separated items by commas]:");
        String[] items = sc.nextLine().split(",");
        for (String i : items){
            String trimmed = i.trim();
            if (groceries.indexOf(trimmed) < 0){
                groceries.add(trimmed);
            }
        }
    }
    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove item(s) [separated items by comma]:");
        String[] items = sc.nextLine().split(",");
        for (String i : items){
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }
    private static void printActions(){
        String textBlock = """
                Available actions:
                
                0 - to shutdown
                
                1 - to add items(s) any list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                Enter a number for which action you want to do:
                
                """;
        System.out.print(textBlock + " ");
    }
}
