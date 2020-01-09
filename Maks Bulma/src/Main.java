
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner (System.in);
        int a;
        int b;
        int c;
        
        System.out.println("Birinci Sayı:");
        a = scanner.nextInt();
        System.out.println("İkinci Sayı:");
        b = scanner.nextInt();
        System.out.println("Üçüncü Sayı:");
        c = scanner.nextInt();
        
        int maks = -1;
        
        if (a >= b && a >= c) {
            
            maks = a;                     
        }
        else if (b >= a && b >= c)  {           
            maks = b;        
        }     
        else {
            maks = c;
        }
              System.out.println("En büyük sayı " + maks);
          
              int min = -2;    
        
              if (a <= b && a <= c) {
            
            min = a;
        }
            else if (b <= a && b <= c) {
                    
                    min = b;
                                       }
            else {
                min = c;
           
        System.out.println("En Küçük Sayı " + min );
        
            }
        
        
        
        
}
    
}
