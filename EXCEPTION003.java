import java.util.Scanner;

public class EXCEPTION003 {
    public static void hasVowels(String str) throws Exception{
        //(a, e, i, o, u, A, E, I, O, U) 
        for(char x: str.toCharArray()){
            if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U'){
                System.out.println("String has vowels");
                return;
            }
        }
        throw new Exception("String not contain vowels");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0){
            String s = scanner.nextLine();
            try {
                hasVowels(s);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
