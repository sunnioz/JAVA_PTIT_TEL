import java.util.HashMap;

public class COLLECTION001 {

    public static void main(String[] args) {
        Warehouse.addProdut("milk",10);
        Warehouse.addProdut("coffee", 7);
        System.out.println("prices:");

        System.out.println("milk: " + Warehouse.stock("milk"));
        System.out.println("coffee: " + Warehouse.stock("coffee"));
        System.out.print("sugar: " + Warehouse.stock("sugar"));

    }
}
class Warehouse{
    static HashMap<String,Integer> warehouse = new HashMap<>();
    static void addProdut(String product, int stock){
        warehouse.put(product,stock);
    }
    static int stock(String product){
        try {
            return warehouse.get(product);
        } catch (Exception e) {
            // TODO: handle exception
            return -99;
        }
        
    }
}