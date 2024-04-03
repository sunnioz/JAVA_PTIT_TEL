import java.util.ArrayList;
import java.util.Scanner;

class Point {
    public String name;
    private double x;
    private double y;
    private double z;
    public Point(String name,double x, double y, double z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

}

class Line  {
    Point a;
    Point b;
    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public double distance(){
        double res = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX())+(a.getY()-b.getY())*(a.getY()-b.getY())+(a.getZ()-b.getZ())*(a.getZ()-b.getZ()));
        return res;
    }
    public String toString(){
        double dis = distance();
        String tmp = "Line " + a.name+b.name+": ";
        return dis > 0 ? tmp + String.format("%.2f", dis):tmp+"same point";
    }
}
public class ELAB2313 {
    public static Point find(String name, ArrayList<Point> list){
        for(Point x: list){
            if(x.name.equals(name))
                return x;
        }
        return new Point("Not Found", 0, 0, 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Point> list = new ArrayList<>();
        try {
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                try {
                    String[] inputco = scanner.nextLine().split(" ");
                    Point point = new Point(name,Double.parseDouble(inputco[0]),Double.parseDouble(inputco[1]),Double.parseDouble(inputco[2]));
                    list.add(point);
                } catch (Exception e) {
                    Point begin = find(name, list);
                    if(begin.name.equals("Not Found")){
                        throw new Exception("invalid input");
                    }
                    for(Point x: list){
                        if(x.name.equals(begin.name)) continue;
                        System.out.println(new Line(begin,x));
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("invalid input");
        }
    }
}