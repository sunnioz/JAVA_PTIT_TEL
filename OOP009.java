import java.util.Scanner;

public class OOP009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        Point a = new Point();
        Point b = new Point();
        String[] input;
        for ( int i = 0; i < t;i++) {
            input = scanner.nextLine().split(" ");
            a.x = Integer.parseInt(input[0]);
            a.y = Integer.parseInt(input[1]);
            b.x = Integer.parseInt(input[2]);
            b.y = Integer.parseInt(input[3]);
            System.out.println(a.slope(b));
        }
    }
}

class Point{
    int x;
    int y;
    public double slope(Point other){
        if(other.y == this.y || other.x == this.x) return -1;
        double res = (double)(other.y - this.y)/(other.x - this.x);
        if(res == -0.0) res = 0.0;
        return res;
    }
}