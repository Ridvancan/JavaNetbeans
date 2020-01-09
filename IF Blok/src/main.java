
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
   
        
       
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("İsminizi Giriniz:");
        String isim = scanner.nextLine();
        System.out.print("Yaşınızı Giriniz:");
        int yas = scanner.nextInt();
        
        if (yas >= 18) {
            
            System.out.println("Hoşgeldiniz " + isim);
        }
        
        else {
            
            System.out.println("Üzgünüm Giriş Yapamazsınız" + " Sayın " + isim);
        }
        
                
                
}
    
}
