import java.util.Scanner;

public class Bai3 {
    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int res = 0;
            String s = scanner.nextLine();
            for(int  i = 0; i < s.length();i++){
                char ch = s.charAt(i);
                if(ch >= '0' & ch <= '9'){
                    res ++;
                }
            }
            System.out.println(res);
        }
    }
}
