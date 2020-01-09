
import java.util.Scanner;


public class Bki {
    public static void main(String[] args) {
        
       
                Scanner scanner = new Scanner(System.in);
                
                System.out.print("Kilonuzu Giriniz:");
                int kilo = scanner.nextInt();
              System.out.print("Boyunuzu Girinizi Örnek(1,75):");
                double boy = scanner.nextDouble();
                
                double bkii = kilo / (boy * boy);
                System.out.println("Boy Kilo Endeksiniz" + bkii );
                     
    }
}
