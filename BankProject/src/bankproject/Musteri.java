/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankproject;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Musteri {
    
  private String ad;
  private String soyad;
  private String tcKimlikNo;
  private ArrayList<Hesap> hesaplar;
    public Musteri(String ad , String soyad , String tcKimlikNo) {
        
     this.ad = ad;
     this.soyad = soyad;
     this.tcKimlikNo = tcKimlikNo;
     hesaplar = new ArrayList<Hesap>();
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }
    
    public void HesapEkle(Hesap hesap){
        hesaplar.add(hesap);
       
    }
    
    public void hesapOzetiGoruntule(int hesapNumarasi){
      
     for(Hesap hesap : hesaplar){
         
      if(hesap.getHesapNumarasi() == hesapNumarasi){
       
          System.out.println("HESAP OZETİ:\n");
          System.out.println("hesap numarasi: " + hesap.getHesapNumarasi());
          System.out.println("Bakiye: " + hesap.getBakiye());
          for(Islem islem : hesap.getIslemler()){
          System.out.println("İslemler: ");
              System.out.println(islem);
          }
          
          
      }   
     }       
    }
    
    public void KrediBasvurusuYap(Kredi kredi){
        System.out.println("Kredi basvurusu alındı");
    }
    
     public Hesap HesapBul(int hesapNumarasi){
     
       for(Hesap hesap : hesaplar){
           
           if(hesap.getHesapNumarasi() == hesapNumarasi){
               
           return hesap;
           }
       }
       
       System.out.println("Hesap Bulunamadi");
       return null;
   }
  
  
}
