import java.util.Scanner;

class NotJavaFileException extends Exception {
    public NotJavaFileException(String message) {
        super(message);
    }
}
class Test{
    public static void CheckFileExtension(String s){
        try {
            System.out.println(check(s));
        } catch (NotJavaFileException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int check(String s) throws NotJavaFileException {
        if(s.endsWith(".java")){
            return 1;
        }
        else if(s.equals("") || s == null){
            throw new NotJavaFileException("Not java file exception.Mark is -1");
        }
        else{
            return 0;
        }
    }
}

public class EXCEPTION002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0){
            String s = scanner.nextLine();
            Test.CheckFileExtension(s);
        }
    }

}
