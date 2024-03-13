import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i <= n;i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int result = quadrant(x,y);
            System.out.println(result);
        }
        sc.close();
	}
    static int quadrant(double x,double y){
        if(x == 0 || y == 0){
            return 0;
        }else if(x > 0 && y > 0){
            return 1;
        }else if(x < 0 && y > 0 ){
            return 2;
        }else if(x < 0 && y < 0){
            return 3;
        }else{
            return 4;
        }
    }
}