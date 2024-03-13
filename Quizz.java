import java.util.*;

public class Quizz {
    public static void main(String[] args) {
        Student student = new Student("Chien", "PTIT", "063", "12-12-2002");
        BankAccount account = new BankAccount(student,20000);
        account.credit(500);
        account.dedit(400);
    System.out.println( account.getBalance());
    }
}

class BankAccount {
    private Student owner;
    private double balance;

    public void BankAccount(Student owner,double balance){
        this.owner = owner;
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public boolean dedit(double amount){
        if(amount < this.balance) return true;
        return false;
    }
    public void credit(double amount){
        balance += amount;
    }

}

class Student {
    private String name;
    private String address;
    private String StudentID;
    private String dateofBirth;

    public Student (String name, String address, String StudentID, String dateofBirth){
        this.name = name;
        this.address = address;
        this.StudentID = StudentID;
        this.dateofBirth= dateofBirth; 
    }
}