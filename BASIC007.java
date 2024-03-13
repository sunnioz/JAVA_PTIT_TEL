import java.util.Scanner;

public class BASIC007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- >0) {
            int year = Integer.parseInt(scanner.nextLine());
            System.out.println(year + " : "+check(year));
        }
    }
    public static String check(int n){
        if(n%4 == 0 & !(n%100 == 0)){
            return "Leap-year";
        }
        return "Non Leap-year";
    }
}
