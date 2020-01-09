
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsminizi Girin:");
        String isim = scanner.nextLine();
        
        System.out.print("Notunuzu Girin:");
        int not = scanner.nextInt();
        
        if  (not >= 90) {
            System.out.println("Harf Notunuz: AA " + isim);
        }
        else if (not >=85) {
            System.out.println("Harf Notunuz:BA " + isim);
            
        }
        else if (not >=80) {
            System.out.println("Harf Notunuz:BB " + isim);
            
        }
        else if (not >=75) {
            System.out.println("Harf Notunuz:CB " + isim);
            
        }
        else if (not >=70) {
            System.out.println("Harf Notunuz:CC" + isim);
            
        }
        else if (not >=65) {
            System.out.println("Harf Notunuz:CD " + isim);
            
        }
        else if (not >=60) {
            System.out.println("Harf Notunuz:DD " + isim);
            
        }
        else {
            System.out.println("Dersi Geçemediniz...");
        }
}
}
