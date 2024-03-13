import java.text.SimpleDateFormat;
import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] input = scanner.nextLine().split(" ");
        List<String> results = new ArrayList<>();
        int n = input.length;
        String tmp ="";
        for(int i = 0; i < n;i++){
            try {
                Integer.parseInt(input[i]);
                results.add(tmp.trim());
                results.add(input[i]);
                tmp ="";
            } catch (Exception e) {
                tmp = tmp +" "+ input[i];
            }
        }
        for(String x: results){
            System.out.println(x);
        }
    }
}