import java.util.HashMap;
import java.util.Scanner;

public class COLLECTION003 {
    public static int rarest(HashMap<String,Integer> map){
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for (Integer value : map.values()) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }
        int minFrequency = Integer.MAX_VALUE;
        int rarestInteger = Integer.MAX_VALUE;
        for (Integer i : frequency.keySet()) {
            int value = i;
            int freq = frequency.get(i);
            if (freq < minFrequency || (freq == minFrequency && value < rarestInteger)) {
                minFrequency = freq;
                rarestInteger = value;
            }
        }
        return rarestInteger;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- >0) {
            String[] input = scanner.nextLine().split(" ");
            HashMap<String,Integer> map = new HashMap<>();
            for(int i = 0; i < input.length;i+=2){
                map.put(input[i], Integer.parseInt(input[i+1]));
            }
            System.out.println(rarest(map));
        }
    }
}
