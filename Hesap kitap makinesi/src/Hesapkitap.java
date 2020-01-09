
import java.util.Scanner;

public class Hesapkitap {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        
        System.out.println("*****************************");
        String islemler = "1.Toplama İşlemi\n"
                         +"2.Çıkarma İşlemi\n"
                         +"3.Çarpma İşlemi\n"
                         +"4.Bölme İşlemi";
        System.out.println(islemler);
        System.out.println("*****************************");
        System.out.println("İşlem Seçiniz...");
        String islem = scanner.nextLine();
        
                switch (islem) {
                    case "1":
                        System.out.print("Birinci Sayı:");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı:");
                        b = scanner.nextInt();
                        System.out.println("Sonuç:" + (a+b));
                        break;
                    case "2":
                        System.out.print("Birinci Sayı:");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı:");
                        b = scanner.nextInt();
                        System.out.println("Sonuç:" + (a-b));
                        break;
                       
                        case "3":
                        System.out.print("Birinci Sayı:");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı:");
                        b = scanner.nextInt();
                        System.out.println("Sonuç:" + (a*b));
                        break;
                            
                    case "4":
                        System.out.print("Birinci Sayı:");
                        a = scanner.nextInt();
                        System.out.print("İkinci Sayı:");
                        b = scanner.nextInt();
                        System.out.println("Sonuç:" + ((double)a/b));
                        break;
                    default:
                            System.out.println("Geçersiz İşlem");
                                
                        
                }
                    
                
}
            
}
