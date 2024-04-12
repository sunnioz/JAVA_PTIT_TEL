import java.io.*;
import java.util.Scanner;

class MyMethods {
    public static void m(int x) {
        try {
            m2(x);
            System.out.println(1);
        } catch (Exception e) {
            if(e instanceof ArithmeticException){
                System.out.println(2);
            }
            else if(e instanceof IOException){
                System.out.println(3);
            }
        }
    }

    public static void m2(int x) throws IOException {
        System.out.println(4);
        if (x == 1)
            throw new IOException();
        if (x == 0)
            throw new ArithmeticException();
        System.out.println(5);
    }
}



public class ELAB2306 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        MyMethods.m(x);

    }
}
