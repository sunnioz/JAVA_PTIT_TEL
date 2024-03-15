import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ELAB2302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> list_Student = new ArrayList<>();
        while(scanner.hasNextLine()){
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            list_Student.add(new Student(name, age));
        }
        for(Student x : list_Student){
            x.display();
        }
        System.out.println(Student.getTotal());
    }
}

class Student{
    private String name;
    private int age;
    public static int numberofStudent = 0;
    public void display(){
        if(this.age >= 18){
            System.out.println(this.name);
        }
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
        numberofStudent ++;
    }
    public static int getTotal(){
        return numberofStudent;
    }
}