import java.util.Scanner;

public class STACK001_Compress_Duplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- >0){
            String[] input = scanner.nextLine().split(" ");
            int  l = input.length;
            int[] arr = new int[l];
            for(int i = 0; i < l;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            compressDuplicates(arr, l);
            System.out.println();
        }
    }
    public static void compressDuplicates(int[] arr, int n){
        int tmp = 1;
        for(int i = 0; i < n-1;i++){
            if(arr[i] != arr[i+1]){
                System.out.print(tmp +" " + arr[i]+" ");
                tmp = 1;
            }else{
                tmp ++;
            }
        }
        System.out.print(tmp +" "+ arr[n-1]);
    }
}

