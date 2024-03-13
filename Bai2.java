import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] in;
        in = scanner.nextLine().split(" ");
        int n = in.length;
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = Integer.parseInt(in[i]);
        }
        int target = scanner.nextInt();
        int[] result = new int[]{};
outter: for(int i = 0; i < n-1;i++){ 
            for(int j = i+1; j< n;j++ ){
                if(arr[i] + arr[j] == target){
                    result = new int[]{i,j};
                    break outter;
                }
            }
        }
        for(int i = 0; i < result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}

