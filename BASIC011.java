import java.util.Scanner;

public class BASIC011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- >0){
            String[] input = scanner.nextLine().split(" ");
            int l = input.length;
            int[] arr = new int[l];
            for(int i = 0; i <l;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            System.out.println(minGap(arr));
        }
    }
    public static int minGap(int[] arr){
        int n = arr.length;
        if(n < 2)
            return 0;
        int min = Integer.MAX_VALUE;
        int tmp;
        for(int i = 1; i < n;i++){
            tmp = arr[i] - arr[i-1];
            if(min < tmp){
                min = tmp;
            }
        }
        return min;
    }
}
