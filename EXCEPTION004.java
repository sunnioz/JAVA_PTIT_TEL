import java.util.Scanner;

class Person{
    String name;
    int age;
    Person(String name, int age) throws Exception{
        this.name = name;
        this.age = age;

    }
    public String inString() throws Exception{
        if(name.equals("")||name == null ||name.length() > 40){
            throw new Exception("Name is not valid");
        }
        if(age < 0 || age > 120){
            throw new Exception("Age is not valid");
        }
        return "Name: " + name + "--Age:" + age;
    }

}

public class EXCEPTION004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- > 0){
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            try{
                Person person = new Person(name, age);
                System.out.println(person.inString());
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
