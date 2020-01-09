
import java.util.Scanner;


public class Dovil { 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bir Sayı Giriniz =");
            int a = scanner.nextInt();
            int toplam = 0;
            
        do {
            toplam += a % 10;
            
            a = a / 10;
            
           
           
        } while(a > 0); {
        
        System.out.println("Rakamlar Toplamı=" + toplam);
        
    }
        
        
        
    }
    
}
