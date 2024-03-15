class MyStuff {
    private String name;
    MyStuff(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof MyStuff))
            return false;
        MyStuff other = (MyStuff)obj;
        return this.name.equals(other.name);
    }
    public String value_compared(MyStuff other){
        if(this.equals(other))
            return "same";
        return "different";
    }
    public String reference_compared(MyStuff other){
        if(this == other)
            return "same";
        return "different";
    }
}


public class ELAB2303 {
    public static void main(String[] args) {
        MyStuff m1 = new MyStuff("PC");
        MyStuff m2 = new MyStuff("PC");
        // if(m2.equals(m1)){
        //     System.out.println("same");
        // }else{
        //     System.out.println("different");
        // }

        System.out.println("value compared: " + m2.value_compared(m1));
        System.out.println("reference compared: "+m2.reference_compared(m1));
    }
}