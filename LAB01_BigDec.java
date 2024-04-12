import java.math.BigDecimal;
import java.util.Scanner;

public class LAB01_BigDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0) {
            String[] inputs = scanner.nextLine().split(" ");
            int n = inputs.length;
            BigDecimal[] arr = new BigDecimal[n];
            for (int i = 0; i < n; i++) {
                arr[i] = new BigDecimal(inputs[i]);
            }
            BigDecimal sum = new BigDecimal(0);
            for (int i = 0; i < n; i++) {
                sum = sum.add(arr[i].remainder(BigDecimal.ONE));
            }
            System.out.println(sum);
        }
    }

}
