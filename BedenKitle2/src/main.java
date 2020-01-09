
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
   
        
       Scanner scanner = new Scanner(System.in);
       
        System.out.print("Kilonuzu Giriniz;");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuzu giriniz (Örn:1,75):");
        double boy = scanner.nextDouble();
        
        double bki = (kilo / (boy * boy));
        
        if (bki <= 18.5) {
            System.out.println(bki + " Zayıf");
        }
        // && operatorü kullanılarak yazılması daha iyi örnek (bki >=18.5 && bki < 25)
        else if (bki <= 25) {
            System.out.println(bki + " Normal");
        }
        else if (bki <= 30){
            System.out.println(bki + " Fazla Kilolu");
        }
        else if (bki >= 30) {
            System.out.println(bki + " Obez");
        }
}
    
}
