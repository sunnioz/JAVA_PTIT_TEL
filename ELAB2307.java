import java.io.*;
import java.util.Scanner;

class Utils {
    public static void u(String s) {
        try {
            System.out.println(s);
            z(s);
            try {
                System.out.println(Integer.parseInt(s)+1);
            } catch (Exception e) {
                System.out.println(s.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println(1);
        }
    }

    public static void z(String s) throws IOException{
        System.out.println(2);
        if (s.length() == 1)
            throw new IOException();
        System.out.println(3);
    }
}
public class ELAB2307 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Utils.u(s);
    }
}
