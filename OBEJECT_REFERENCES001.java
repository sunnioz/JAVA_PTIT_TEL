import java.util.Scanner;

public class OBEJECT_REFERENCES001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while(t-- >0){
            String[] input1 = scanner.nextLine().split(" ",3);
            String[] input2 = scanner.nextLine().split(" ",3);
            int duration1 = Integer.parseInt(input1[2]);
            int duration2 = Integer.parseInt(input2[2]);
            Song s1 = new Song(input1[0],input1[1],duration1);
            Song s2 = new Song(input2[0],input2[1],duration2);
            System.out.println(s1.equals(s2));
        }
    }
}
class Song{
    private String name;
    private String author;
    private int duration;
    Song(String name,String author,  int duration){
        this.name = name;
        this.author = author;
        this.duration = duration;
    }
    public boolean equals(Object song){
        if(!(song instanceof Song)){
            return false;
        }
        Song other = (Song)song;
        return this.name.equals(other.name) & this.author.equals(other.author) & this.duration == other.duration;

    }
}
