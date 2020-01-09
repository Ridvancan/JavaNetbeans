
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Alistirmalrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random ihtimal = new Random();
        
        
        System.out.println("Merhaba + Basma Programına Hoşgeldiniz...");
        
      int sans;
        while (true){
            System.out.println("Yükseltmek İstediğiniz Eşya Derecesini Seçiniz\n"+
                           "1-)+15--->Pri\n"+
                           "2-)Pri--->Duo\n"+
                           "3-)Duo--->Tri\n"+
                           "4-)Tri--->Tet\n"+
                           "5-)Tet--->Pen\n"+
                           "6-)Programdan Çıkış.");
        String istek =scanner.nextLine();
           
            if(istek.equals("1")){
            
                System.out.println("Geliştirme başarı İhtimali:%40 İtem geliştiriliyor:");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("---");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                
            sans = ihtimal.nextInt(100);
                if (sans <= 40) {
                    System.out.println("Tebrikler İtem yükseltme başarılı Oldu..." +sans);
                    
                }
                else if (sans>40){
                System.out.println("Malesef İtem yükseltme başarısız" + sans);    
            
            }
        
       
        }
            else if(istek.equals("2")){
            
                System.out.println("İtem geliştiriliyor... Geçme ihtimali (%30)");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("---");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
            sans = ihtimal.nextInt(100);
                if (sans <= 30) {
                    System.out.println("Tebrikler İtem yükseltme başarılı Oldu..." + sans);
                    
                }
                else if (sans>30){
                System.out.println("Malesef İtem yükseltme başarısız "+ sans);
              
         
    }
           
            
     }
            else if(istek.equals("3")){
            
                System.out.println("İtem geliştiriliyor... Geçme ihtimali (%20)");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("---");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
            sans = ihtimal.nextInt(100);
                if (sans <= 20) {
                    System.out.println("\nTebrikler İtem yükseltme başarılı Oldu..."+ sans);
                  break;
                }
                else if (sans>20){
                System.out.println("Malesef İtem yükseltme başarısız "+ sans); 
                
     }
     }
            else if(istek.equals("4")){
            
                System.out.println("İtem geliştiriliyor... Geçme ihtimali (%10)");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("---");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
            sans = ihtimal.nextInt(100);
                if (sans <= 10) {
                    System.out.println("Tebrikler İtem yükseltme başarılı Oldu..."+ sans);
                  break;
                }
                else if (sans>10){
                System.out.println("Malesef İtem yükseltme başarısız "+ sans); 
               
        }
    }
            else if(istek.equals("5")){
            
                System.out.println("İtem geliştiriliyor... Geçme ihtimali (%5)");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("---");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("-");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }     
                System.out.print("--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Alistirmalrar.class.getName()).log(Level.SEVERE, null, ex);
                }
            sans = ihtimal.nextInt(100);
                if (sans <= 5) {
                    System.out.println("Tebrikler İtem yükseltme başarılı Oldu..."+ sans);
                 break;
                }
                else if (sans>5){
                System.out.println("Malesef İtem yükseltme başarısız... " + sans);   
               
        }
    }
           else if(istek.equals("6")){
            
                System.out.println("Programdan Çıkılıyor...");
              break;
           }
        }
    }
}
    
    
