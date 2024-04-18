import java.util.Scanner;

public class LAB01_ClassMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0){
            String s = scanner.nextLine();
            String[] inputs = s.split(" ");
            System.out.println(s.length()+" "+inputs.length);
        }
    }

}
