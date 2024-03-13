import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- >0) {
            FlightBooking.resetSeats();
            String[] input = scanner.nextLine().split(" ");
            int n = input.length;
            int id;
            String request;
            for(int i = 0; i < n;i+=2){
                id = Integer.parseInt(input[i]);
                request = input[i+1];
                switch (request) {
                    case "Booking":
                        FlightBooking.Booking();
                        break;
                    case "Cancel":
                        FlightBooking.Cancel();
                    default:
                        FlightBooking.Confirmed(id);
                        break;
                }
            }
            System.out.println();
        }
    }
}

class FlightBooking{
    public String flightId = "OOP24";
    private static int seatAvailable = 180;
    public static void printSeat(){
        System.out.print("[Seat Available: " + seatAvailable + "]");
    }
    public static void Booking(){
        seatAvailable --;
        printSeat();
    }
    public static void Cancel(){
        seatAvailable ++;
        printSeat();
    }
    public static void Confirmed(int t){
        System.out.print("--User " + t+ " Confirmed--");
        printSeat();
    }
    public static void resetSeats() {
        seatAvailable = 180; 
    }
}
