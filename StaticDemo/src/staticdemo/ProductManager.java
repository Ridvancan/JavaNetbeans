/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticdemo;


public class ProductManager {

  
    public void urunKaydet(Product product){
        ProductValidator validator = new ProductValidator();
        
        if(validator.isValid(product)){
        System.out.println("Ürün Kaydedildi...");
}
        else{System.out.println("eklenemedi");
        }
    }
}