import java.util.*;

class Item{
    private String name;
    private double price;
    private double discount;
    
    Item(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    public double getPrice(){
        return this.price;
    }
    public double getDiscount(){
        return this.discount;
    }
    public String toString(){
        return this.name + " $" + String.format("%.2f",this.price) + " (-$" + String.format("%.2f",this.discount) + ")";
    }
}

class Employee{
    private String name;
    public String getName(){
        return this.name;
    }
    Employee(String name){
        this.name = name;
    }
}

class GroceryBill{
    private Employee clerk;
    protected ArrayList<Item> receipt = new ArrayList<>();
    protected double total = 0;
    protected double sub_total = 0;
    protected double discount = 0;
    GroceryBill(Employee clerk){
        this.clerk = clerk;
    }
    public void add(Item i){
        this.receipt.add(i);
        this.sub_total = this.sub_total + i.getPrice();
        this.discount = this.discount + i.getDiscount();
        this.total = this.total + i.getPrice() - i.getDiscount();
    }
    public double getTotal(){
        return this.total;
    }
    public Employee getEmployee(){
        return this.clerk;
    }
    public String toString(){
        String display = "";
        display = display + "items:\n";
        for(Item i : this.receipt){
            display = display +"   "+ i.toString() + "\n";
        }
        display = display + "total: $" + String.format("%.2f",this.getTotal()) + "\n";
        display = display + "Clerk: " + this.getEmployee().getName();
        return display;
    }
}

class DiscountBill extends GroceryBill{
//    private double discountAmount;
    DiscountBill(Employee clerk){
        super(clerk);
    }
    public void add(Item i){
        super.add(i);
    }
    public String toString(){
        String display = "";
        display = display + "items:\n";
        for(Item i : this.receipt){
            display = display +"   "+ i.toString() + "\n";
        }
        display = display + "sub-total: $"+String.format("%.2f", this.sub_total)+"\n";
        display = display + "discount: $" +String.format("%.2f",this.discount)+ "\n";
        display = display + "total: $" + String.format("%.2f",this.getTotal()) + "\n";
        display = display + "Clerk: " + this.getEmployee().getName();
        return display;
    }

}

public class INHERTANCE003 {
    public static void main(String[] args)  {
        Item item1 = new Item("item 1", 2.3, 0);
        Item item2 = new Item("item 2", 3.45, 0);
        Item item3 = new Item("item 3", 20, 15);
        Item item4 = new Item("item 4", 40, 35);
        Item item5 = new Item("item 5", 50, 35);
        Employee employee1 = new Employee("Grocery Bill");
        Employee employee2 = new Employee("Discount Bill");
        GroceryBill groceryBill = new GroceryBill(employee1);
        groceryBill.add(item1);
        groceryBill.add(item2);
        DiscountBill discountBill = new DiscountBill(employee2);
        discountBill.add(item3);
        discountBill.add(item4);
        discountBill.add(item5);
        System.out.println(groceryBill);
        System.err.println();
        System.out.print(discountBill);
    }
}