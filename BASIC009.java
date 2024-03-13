import java.util.Scanner;

public class BASIC009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- >0){
            Double x = scanner.nextDouble();
            Double y = scanner.nextDouble();
            if(x > 0 & y > 0) System.out.println(1);
            if(x >0 & y < 0) System.out.println(4);
            if(x < 0 & y > 0) System.out.println(2);
            if(x < 0 & y < 0) System.err.println(3);
        }
    }
}
