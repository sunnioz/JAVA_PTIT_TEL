
public class Main{
    public static void main(String[] args){
        Double double1 = 10.89;
        int t = double1.intValue();
        System.out.println(t);
        
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