import java.util.Scanner;

class HanhTinh{
    String name;
    double khoiLuong;
    double banKinh;
    double khoiLuongVat;
    static double G = 6.67300e-11;
    HanhTinh(String name,double khoiLuong, double banKinh, double khoiLuongVat){
        this.name = name;
        this.khoiLuong = khoiLuong;
        this.banKinh = banKinh;
        this.khoiLuongVat = khoiLuongVat;
    }
    public double trongLucBeMat(){
        return this.khoiLuong*G/(this.banKinh*this.banKinh);
    }
    public double khoiLuongBemat(){
        return this.trongLucBeMat()/TraiDat.G_TraiDat*this.khoiLuongVat;
    }
    public String toString(){
        return "Your weight on " + this.name +  " is " + String.format("%.2f", this.khoiLuongBemat());
    }
        
}
class TraiDat {
    String name = "TraiDat";
    static double khoiLuong = 5.976e+24;
    static double banKinh = 6.37814e6;
    static double G_TraiDat =khoiLuong*HanhTinh.G/(banKinh*banKinh);
}

public class Planet {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String hanhTinh = scanner.nextLine();
        Double khoiluong = Double.parseDouble(scanner.nextLine());
        Double bankinh = Double.parseDouble(scanner.nextLine());
        Double khoiluongVat = Double.parseDouble(scanner.nextLine());
        HanhTinh hanhTinh1 =new HanhTinh(hanhTinh, khoiluong, bankinh, khoiluongVat);
        System.out.println(hanhTinh1);
        
    }
}
