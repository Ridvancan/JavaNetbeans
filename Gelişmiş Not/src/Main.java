
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("1.Vize Notunuzu Giriniz:");
        int vize1 = scanner.nextInt();
        System.out.print("2.Vize Notunuzu Giriniz:");
        int vize2 = scanner.nextInt();
        System.out.print("Final Notunuzu Giriniz:");
        int finalnot = scanner.nextInt();
        System.out.println("Okul Ortalamanızı Giriniz:");
        double ortalama = scanner.nextDouble();
        
                
        double notort = ((vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalnot * 4 / 10.0));
        
        if (notort >= 90) {
            System.out.println("AA Aldınız...");                      
        }
        else if (notort >= 85) {
            System.out.println("BA Aldınız...");
        }
        else if (notort >= 80) {
            System.out.println("BB Aldınız...");
        }
        else if (notort >= 75) {
            System.out.println("BC Aldınız...");
        }
        else if (notort >= 70) {
            System.out.println("CC Aldınız...");
        }
        else if (notort >= 65) {
            System.out.println("DC Aldınız...");
        }
        else if (notort >= 60) {
            System.out.println("DD Aldınız...");
            
            if (ortalama < 2.50){
                System.out.println("Dersi Tekrar Almanızda Fayda Var");
            }
                
        }
        else if (notort >= 55) {
            System.out.println("FD Aldınız...");
        }
        else {
            System.out.println("Dersi Geçemediniz...");
        }
        
        
        
}
           
    
}
