import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mesafe,yas,tip;
        double perKM = 0.1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mesafeyi KM türünden giriniz:");
        mesafe = sc.nextInt();
        System.out.println("Yaşınızı giriniz:");
        yas = sc.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        tip = sc.nextInt();
        double tutar = mesafe * perKM;
        if((mesafe <= 0) || (yas <= 0) || (tip != 1 && tip != 2)){
            System.out.println("Hatalı veri girdiniz!");
            return;
        }
        if(yas < 12){
            tutar = tutar / 2;
        }
        else if(yas >= 12 && yas <= 24){
            tutar -= tutar * 0.1;
        }
        else if(yas > 65){
            tutar -= tutar * 0.3;
        }
        if(tip == 2){
            tutar -= tutar * 0.2;
            tutar = tutar * 2;
        }
        System.out.println("Toplam tutar: " + tutar);
    }
}