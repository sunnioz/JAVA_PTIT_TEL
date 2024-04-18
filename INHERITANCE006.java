interface Pet {
    String getName();
    void setName(String name);
    void play();

}
class Animal{
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    public void walk(){
        System.out.println("This animal walks on " + legs + " legs.");
    }
    public void eat(){
    }
}
class Cat extends Animal implements Pet{
    private String name;
    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this(" ");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void play(){
        System.out.println(this.name +" likes to play with string.");
    }
    public void eat(){
        System.out.println("Cats like to eat spiders and mice.");
    }
}
class Fish extends Animal implements Pet{
    private String name;
    public Fish(String name){
        super(0);
        this.name = name;
    }
    public Fish(){
        this(" ");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void play(){
        System.out.println( "Fish swim in their tanks all day.");
    }
    public void walk(){
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim.");
    }
    public void eat(){
        System.out.println("Fish eat pond scum.");
    }
}
class Spider extends Animal{
    public Spider(){
        super(8);
    }
    public void eat(){
        System.out.println("The spider eats a fly.");
    }
}

public class INHERITANCE006 {
    public static void main(String[] args) {
        Cat c = new Cat("Fluffy");
        Fish f = new Fish("F");
        Spider s = new Spider();
        f.play();
        f.walk();
        c.play();
        c.eat();
        s.eat();
        c.walk();
        s.walk();
    }
}
