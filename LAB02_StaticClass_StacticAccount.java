import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LAB02_StaticClass_StacticAccount {

    static class Account{
        int id;
        String name;
        BigInteger balance;
        static int total = 0;
        Account(String name, BigInteger balance){
            this.id = total + 1;
            this.name = name;
            this.balance = balance;
            total ++;
        }
        public String toString(){
            String id_r = String.format("%03d", this.id);
            return "[" + id_r + ", "+ this.name +", "+ balance +"]";
        }
        public boolean rut(BigInteger amount ){
            if(this.balance.compareTo(amount) >= 0){
                this.balance = balance.subtract(amount);
                return true;
            }
            return false;
        }
        public void nap(BigInteger amount){
            this.balance = this.balance.add(amount);
        }
        public static void reset(){
            total = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- >0) {
            Account.reset();
            List<Account> list_Account = new ArrayList<>();
            String[] input = scanner.nextLine().split(" ");
            String tmp = "";
            for(int i = 1; i < input.length;i++){
                try {
                    BigInteger balance_i = new BigInteger(input[i]);
                    list_Account.add(new Account(tmp.trim(), balance_i));
                    tmp = "";
                } catch (Exception e) {
                    tmp = tmp + " " + input[i];
                }
            }
            String[] input_request = scanner.nextLine().split(" ");
            int total_c = Account.total;
            for(int i = 1; i < input_request.length;i++){
                switch (input_request[i]) {
                    case "rut":
                        int id_r = Integer.parseInt(input_request[i+1]);
                        BigInteger amount_r = new BigInteger(input_request[i+2]);
                        if(id_r-1 < total_c)
                            list_Account.get(id_r-1).rut(amount_r);
                        break;
                    case "nap":
                        int id_n = Integer.parseInt(input_request[i+1]);
                        BigInteger amount_n = new BigInteger(input_request[i+2]);
                        if(id_n-1 < total_c)
                            list_Account.get(id_n-1).nap(amount_n);                        
                        break;
                    case "chuyen":
                        int id_m = Integer.parseInt(input_request[i+1]);
                        int id_s = Integer.parseInt(input_request[i+2]);
                        BigInteger amount_c = new BigInteger(input_request[i+3]);
                        if(id_m - 1 < total_c && id_s -1 < total_c){
                            if(list_Account.get(id_m-1).rut(amount_c)){
                                list_Account.get(id_s-1).nap(amount_c);
                            }
                        }
                        break;
                    default:
                        break;
                }
            }
            for(Account i: list_Account){
                System.out.print(i.toString());
            }
            System.out.println();
        }
    }

}


