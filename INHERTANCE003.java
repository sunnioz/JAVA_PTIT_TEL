import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class T{
    public static String formatString(double x){
        return String.format("%.2f", x);
    }
}

class Item{
    private String name;
    private double price;
    private double discount;
    Item(String name, double price, double discount){
        this.name = name;
        this.price = price;
        this.discount = discount;
    }
    double getPrice(){
        return price;
    }
    double getDiscount(){
        return discount;
    }
    public String toString(){
        return this.name + " $" + T.formatString(this.price) + " (-$" + T.formatString(this.discount) + ")";
    }
}

class Employee{
    private String name;
    Employee(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class GroceryBill{
    private Employee clerk;
    ArrayList<Item> items = new ArrayList<Item>();
    private  double total;
    GroceryBill(Employee clerk){
        this.clerk = clerk;
    }
    void add(Item i){
        total+=i.getPrice();
        items.add(i);
    }
    double getTotal(){
        return total;
    }
    Employee getClerk(){
        return clerk;
    }
    public String toString(){
        String s = "";
        s += "items:\n";
        for(Item i : items){
            s += "   "+i.toString()+"\n";
        }
        s = s + "total: $"+T.formatString(this.total)+"\n";
        s = s + "Clerk: "+clerk.getName()+"\n";
        return s;
    }
}
class DiscountBill extends GroceryBill{
    double discountAmount;
    DiscountBill(Employee clerk){
        super(clerk);
    }
    void add(Item i){
        super.add(i);
        discountAmount += i.getDiscount();
    }
    public String toString(){
        String s = "";
        s += "items:\n";
        for(Item i : items){
            s += "   "+i.toString()+"\n";
        }
        s = s + "sub-total: $"+ T.formatString(super.getTotal()) +"\n";
        s = s + "discount: $"+ T.formatString(discountAmount) +"\n";
        s = s + "total: $"+T.formatString(super.getTotal() - discountAmount)+"\n";
        s = s + "Clerk: "+super.getClerk().getName()+"\n";
        return s;
    }
}
public class INHERTANCE003 {
    public static void main(String[] args) {
        Employee clerk1 = new Employee("Grocery Bill");
        Employee clerk2 = new Employee("Discount Bill");
        Item item1 = new Item("item 1",2.3,0);
        Item item2 = new Item("item 2",3.45,0);
        Item item3 = new Item("item 3",20,15);
        Item item4 = new Item("item 4",40,35);
        Item item5 = new Item("item 5",50,55);
        GroceryBill bill = new GroceryBill(clerk1);
        bill.add(item1);
        bill.add(item2);
        System.out.println(bill.toString());
        DiscountBill discountBill = new DiscountBill(clerk2);
        discountBill.add(item3);
        discountBill.add(item4);
        discountBill.add(item5);
        System.out.print(discountBill.toString());
    }
}