import java.util.Scanner;

abstract class Car {
    protected double price;
    protected int year;

    public Car(double price, int year) {
        this.price = price;
        this.year = year;
    }
    abstract double calculateSalePrice();
    protected static double maxSalePrice = 0;
    protected static void updateMaxSalePrice(double salePrice){
        if(salePrice > maxSalePrice){
            maxSalePrice = salePrice;
        }
    }
    public static String getMaxSalePice(){
        return formatString(maxSalePrice);
    }
    public String toString() {
        return "Price: " + formatString(this.calculateSalePrice()) +" VND | Year: " + this.year;
    }
    public static String formatString(double price){
        String formattedPrice = "";
        String temp =  String.format("%.2f", price);
        for (int i = temp.length() - 1; i >= 0; i--) {
            formattedPrice = temp.charAt(i) + formattedPrice;
            if(temp.charAt(i) == '.') continue;
            if ((temp.length() - i) % 3 == 0 && i != 0) {
            formattedPrice = "," + formattedPrice;
            }
        }
        return formattedPrice;
    }
    
}

class ClassicCar extends Car {
    ClassicCar(double price, int year) {
        super(price, year);
    }
    @Override
    double calculateSalePrice(){
        double totalPrice = this.price * 1.12 + 20e6;
        return totalPrice;
    }
}
class SportCar extends Car {
    SportCar(double price, int year) {
        super(price, year);
    }
    @Override
    double calculateSalePrice(){
        double totalPrice = 0;
        if(this.year > 2018){
            totalPrice = price * 0.8;
        }else if(this.year > 2010){
            totalPrice = price * 0.5;
        }
        else{
            totalPrice = price * 0.1;
        }
        return totalPrice;
    }

}

public class ELAB2308{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- >0) {
            String[] inputs = scanner.nextLine().split(" ");
            String type = inputs[0];
            if(type.equals("SC")){
                SportCar sportCar = new SportCar(Double.parseDouble(inputs[1]), Integer.parseInt(inputs[2]));
                Car.updateMaxSalePrice(sportCar.calculateSalePrice());
                System.out.println(sportCar);
            }
            else if(type.equals("CC")){
                ClassicCar classicCar = new ClassicCar(Double.parseDouble(inputs[1]), Integer.parseInt(inputs[2]));
                Car.updateMaxSalePrice(classicCar.calculateSalePrice());
                System.out.println(classicCar);
            }
        }
        System.out.println("Most Expensive: " + Car.getMaxSalePice() + " VND");
    }
}