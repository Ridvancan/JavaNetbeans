
package staticdemo;



public class StaticDemo {

   
    
    
    public static void main(String[] args) {
     
         ProductManager manager = new ProductManager();
        Product product = new Product();
        product.name ="kk";
        product.price =20.2;
        product.id=2;
        manager.urunKaydet(product);
        
        
    }
    
    
}
