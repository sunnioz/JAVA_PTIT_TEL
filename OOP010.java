class OOP010{
    public static void main(String[] args) {
        Product one = new Product("Tape measure");
        Product two = new Product("Plaster","home improvement section");
        Product three = new Product("Tyre",5);
        one.toString();
        two.toString();
        three.toString();
    }

}

class Product{
    public String name;
    public String location;
    public int weight;

    public Product(String name){
        this.name = name;
        this.location = "shelf";
        this.weight = 1;
    }
    public Product(String name, String location){
        this.name = name;
        this.location = location;
        this.weight = 1;
    }
    public Product(String name, int weight){
        this.name = name;
        this.location = "shelf";
        this.weight = weight;
    }
    public String toString(){
        System.out.println(this.name+" ("+this.weight+"kg) "+"can be found from the "+this.location);
        return "";
    }
}