
import java.util.Scanner;

public class Hipotenüs {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
        int uzunluk1;
        int uzunluk2;
        
        System.out.print("Birinci uzunluğu Giriniz:");
        uzunluk1 = scanner.nextInt();
        System.out.print("İkinci uzunluğu Giriniz:");
        uzunluk2 = scanner.nextInt();
        
        double h = Math.sqrt(uzunluk1 * uzunluk1 + uzunluk2 * uzunluk2);
        System.out.println("Hipotenüs" + h);
        System.out.println("Seni Çok Seviyorum Habicem");
       
        
           
}
    
}
