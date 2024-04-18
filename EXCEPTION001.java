import java.util.Scanner;

class Amount{
    String currency;
    int amount;
    public Amount(String currency, int amount){
        this.currency = currency;
        this.amount = amount;
    }
    void add(Amount amount) throws Exception{
        if(this.currency.equals(amount.currency)){
            this.amount += amount.amount;
        }
        else{
            throw new Exception("Currency doesn't match");
        }
    }
}

public class EXCEPTION001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- >0) {
            String[] inputs = scanner.nextLine().split(" ");
            Amount a = new Amount(inputs[0], Integer.parseInt(inputs[1]));
            Amount b = new Amount(inputs[2], Integer.parseInt(inputs[3]));
            try {
                a.add(b);
                System.out.println(a.amount);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
