public class javadebug{
    public static void main(String[] args) {
        int res = func(5);
        System.out.println(res);
    }
    public static int func(int x){
        int sum = 0;
        outer: for(int i = 0; i < x;i++){
            sum ++;
            if(i == 4) continue;
            inner: for(int j = 0; j < x;j++){
                if(j == i) continue outer;
                if(i == 3) break;
                if(i == 2) break outer;
            }
        }
        return sum;
    }
}