
import java.util.Scanner;


public class Kullanici {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
           
       
        int girishakki = 3;
        
         String kullanici = "bilinmez55";
        String parola = "6oymeunc";
        
        System.out.println("*************************");                
        System.out.println("Kullanıcı Girişine Hoşgeldiniz");
        System.out.println("*************************");   
        
        while(true){
            System.out.print("Kullanıcı Adı:");
            String kullanici1 =  scanner.nextLine();
            System.out.print("Parola:");
            String parola1 = scanner.nextLine();
            
            if (kullanici.equals(kullanici1) && parola.equals(parola1)) {
                
                System.out.println("Hoşgeldiniz " + kullanici);
                      break;
            }
            else if (kullanici.equals(kullanici1) && !parola.equals(parola1))  {
                System.out.println("Parola Yanlış");
                girishakki -= 1;
                System.out.println("Giriş Hakkı:" + girishakki);
            }
            else if (!kullanici.equals(kullanici1) && parola.equals(parola1)) {
                System.out.println("Kullanıcı adı yanlış...");
               girishakki -=1;    
               System.out.println("Giriş Hakkı:" + girishakki);
            }
            else {
                System.out.println("Kullanıcı adı ve Şifre Yanlış...");
                girishakki -=1;
                System.out.println("Giriş Hakkı:" + girishakki);
            }
            
            if (girishakki == 0)  {   
            System.out.println("Yanlış Giriş hakkınız doldu!.");
            break;
                    }
        
             
                
                
                
        }
                
                
                
               
        
               
        
        
    }
}
