
import java.util.Scanner;


public class Benzin {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Aracanız Kilometre Başına kaç kuruş yakıyor (Örnek:0,35):");
        
        double kurus = scanner.nextDouble();
        
        System.out.print("Kaç Kilometre Gittiniz?:");
        
        int km = scanner.nextInt();
        
        System.out.println("Benzin Tutarı" + (kurus * km) + "Tl'dir");
              //;'leri unutma, 
    }
}
