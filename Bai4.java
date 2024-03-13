import java.math.BigInteger;
import java.util.Scanner;

public class Bai4 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < t;i++){
            BigInteger res = BigInteger.ZERO;
            String s = scanner.nextLine();
            String[] ops = s.split(" ");
            BigInteger op1 = new BigInteger(ops[0]);
            BigInteger op2 = new BigInteger(ops[2]);
            char op = ops[1].charAt(0);
            switch (op) {
                case '+':
                    res = op1.add(op2);
                    break;
                case '-':
                    res = op1.subtract(op2); 
                    break;
                default:
                    res = op1.multiply(op2);
                    break;
            }
            System.out.println(res);
        }
    }
}
