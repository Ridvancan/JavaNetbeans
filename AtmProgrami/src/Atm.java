
import java.util.Scanner;


public class Atm {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int bakiye = 2000;
        
        String islemler ="1.Bakiye Öğrenme\n"
                        +"2.Para Çekme\n"
                        +"3.Para Yatırma\n"
                        +"q İptal / Kart İade";
        System.out.println("****************");
        System.out.println(islemler);
        System.out.println("****************");
      
                      while(true) {
            
            System.out.println("İşlem Seçiniz...");
            String islem = scanner.nextLine();
            
           if (islem.equals("q"))
           {
               System.out.println("İşlem İptal Edildi, Kartınızı Alınız...");
            break;
           }
           else if (islem.equals("1")) { 
               System.out.println("Bakiyeniz = " + bakiye);
               
               
           }
            else if (islem.equals("2")) { 
                System.out.print("Çekmek İstediğiniz Tutar= ");
                
                int tutar =scanner.nextInt();
                scanner.nextLine();                                                                     
                        
                if (bakiye - tutar < 0) {
                    
                    System.out.println("Bakiye Yetersiz...Bakiyeniz =" + bakiye);
                    
                }
                
                else {
                    
                    
                    bakiye -= tutar;
               System.out.println("Yeni Bakiyeniz = " + bakiye);
               
                } 
                       
                       
                              
               
           }
           else if (islem.equals("3")) { 
              System.out.print("Yatırmak İstediğiniz Tutar = ");
              int tutar = scanner.nextInt();
               scanner.nextLine();
               
               bakiye += tutar;
               System.out.println("Yeni Bakiyeniz= " + bakiye);
               
               
           }
           else {
               
               System.out.println("Geçersiz İşlem...");
           
           }
           
           
        }
        
                
        
        
        
        
    }
    
}
