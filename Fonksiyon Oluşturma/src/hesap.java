
import java.awt.BorderLayout;
import java.util.Scanner;

public class hesap {
    public static int toplama (int a,int b) {
        
        return (a + b);
          }
    public static int toplama (int a,int b, int c) {
        
        return (a + b + c);
          }
    public static int çarpma (int a,int b) {
        
        return (a * b);
          }
    public static int çarpma (int a,int b,int c) {
        
        return (a * b * c);
          }
    public static int çıkarma (int a,int b) {
        
        return (a - b);
          }
    public static int bölme (int a,int b) {
        
        return (a / b);
          }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String islemler = "1.Toplama İşlemi\n"
                             +"2.Çıkarma İşlemi\n"
                             +"3.Çarpma İşlemi\n"
                             +"4.Bölme İşlemi\n"
                             +"Çıkış.";       
     System.out.println("**************************");
            System.out.println(islemler);
            System.out.println("**************************");
            
    while (true)    {
            
        System.out.println("İşlem Seçiniz...");
            String islem = scanner.nextLine();       
            if (islem.equals("1")) {
                System.out.print("Kaç Sayı Toplanacak (2 veya 3):");
                int kacsayi = scanner.nextInt();
                scanner.nextLine();
                if (kacsayi == 2) {
                System.out.print("Birinci Sayı:");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayı:");
                int b = scanner.nextInt();
                scanner.nextLine();                
                System.out.println("Toplamın Sonucu: " + toplama(a, b));
           
 } 
                else if (kacsayi ==3 ) {
                System.out.print("Birinci Sayı:");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayı:");
                int b = scanner.nextInt();
                System.out.print("Üçüncü Sayı:");
                int c = scanner.nextInt();
                scanner.nextLine();                
                System.out.println("Toplamın Sonucu: " + toplama(a, b,c));
                }
         }
                else if (islem.equals("2")) {               
                System.out.print("Birinci Sayı:");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayı:");
                int b = scanner.nextInt();
                scanner.nextLine();                
                System.out.println("İşlem Sonucu: " + çıkarma(a, b));
                
         }
                else if (islem.equals("3")) {
                System.out.print("Kaç Sayı Çarpılacak (2 veya 3):");
                int kacsayi = scanner.nextInt();             
                  
                if (kacsayi == 2) {
                System.out.print("Birinci Sayı:");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayı:");
                int b = scanner.nextInt();
                scanner.nextLine();                
                System.out.println("Çarpımın Sonucu: " + çarpma(a, b));
                }
                
                else if (kacsayi == 3 ) {
                System.out.print("Birinci Sayı:");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayı:");
                int b = scanner.nextInt();
                System.out.print("Üçüncü Sayı:");
                int c = scanner.nextInt();
                scanner.nextLine();                
                System.out.println("Çarpımın Sonucu: " + çarpma(a, b, c));
                }
                }
                else if (islem.equals("4")) {               
                System.out.print("Birinci Sayı:");
                int a = scanner.nextInt();
                System.out.print("İkinci Sayı:");
                int b = scanner.nextInt();
                scanner.nextLine();    
                System.out.println("Bölümlerin Sonucu : " + bölme(a, b));
                }
                
            }
    }
    }




