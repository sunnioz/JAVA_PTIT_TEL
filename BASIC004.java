import java.util.Scanner;

public class BASIC004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- >0){
            System.out.println("Hi "+ scanner.nextLine());
        }
    }   
}
