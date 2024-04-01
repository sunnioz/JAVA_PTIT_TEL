import java.util.Scanner;

public class COLLECTION002 {
    public static String pick(String a, String b){
        return a.length() > b.length() ? a : b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- >0){
            String res = "";
            String[] input = scanner.nextLine().split(" ");
            for(int i = 0; i < input.length-1;i+=2){
                res = res + " " + pick(input[i], input[i+1]);
            }
            if(input.length %2 == 1) res = res + " " + input[input.length - 1];
            System.out.println(res.substring(1));
        }
    }
}
