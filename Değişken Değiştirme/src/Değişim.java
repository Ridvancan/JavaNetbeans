
import java.util.Scanner;


public class Değişim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        int sayi2;
        
        System.out.print("Bir Sayı Giriniz:");
        
        sayi1 = scanner.nextInt();
        
        System.out.print("Bir Sayı Daha Giriniz:");
        
        sayi2 = scanner.nextInt();
        
        System.out.println("Sayılar Değiştirilmeden Önce");
        
        System.out.println("Birinci Sayi:" + sayi1);
        
        System.out.println("İkinci Sayi:"+ sayi2);
        
        System.out.println("Sayılar Değiştikten Sonra");
        
       int gecici = sayi1;
       sayi1 = sayi2;
       sayi2 = gecici;
       
        System.out.println("Birinci Sayi:" + sayi1);
        System.out.println("İkinci Sayi:" + sayi2);
        
        
                
        
    }
}
