import java.util.Scanner;

public class OOP002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- >0) {
            String[] input = scanner.nextLine().split(" ");
            int l = input.length;
            int[] arr = new int[l];
            for(int i = 0; i < l;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            System.out.println(new Rectangle(arr[0], arr[1], arr[2], arr[3]));
        }
    }
}

class Rectangle{
    int x;
    int y;
    int width;
    int Height;
    Rectangle(int x, int y, int width, int Height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.Height = Height;
    }
    public String toString(){
        return "Rectangle[x=" + this.x +",y="+ this.y +",width="+this.width+",height="+this.Height+"]";
    }
}
