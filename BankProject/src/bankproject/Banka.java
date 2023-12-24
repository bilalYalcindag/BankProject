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
public class Banka {
    private String bankaAdi;
    private String adres;
    private ArrayList<Musteri> musteriler;
    private ArrayList<Hesap> hesaplar;
    private ArrayList<Kredi> krediler;
    
    public Banka(String bankaAdi, String adres){
     
     this.bankaAdi = bankaAdi;
     this.adres = adres;
     musteriler = new ArrayList<Musteri>();
     hesaplar = new ArrayList<Hesap>();
     krediler = new ArrayList<Kredi>();
    } 
    
    public void MusteriEkle(Musteri musteri ){
        
     musteriler.add(musteri);
    }
    
    public void HesapEkle(Hesap hesap){
        hesaplar.add(hesap);
    }
    
    public void KrediEkle(Kredi kredi){
       
    krediler.add(kredi);
    }
    
    public Musteri MusteriBul(String tcKimlikNo){
        
      for( Musteri musteri : musteriler ){
      
       if(musteri.getTcKimlikNo().equals(tcKimlikNo)){
           
         return musteri;  
       }   
          
    }   
        System.out.println("Bu tc kimlik no ya ait musteri yok");  
        return null;
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
   
   public void ParaTransferi(int kaynakHesapNumarasi, int hedefHesapNumarasi, double miktar){
       
       for(Hesap hesap: hesaplar){
           
        if(hesap.getHesapNumarasi() == kaynakHesapNumarasi){
         if(hesap.getBakiye()>=miktar){  
         hesap.setBakiye(hesap.getBakiye()-miktar);
           }
         else{
             System.out.println("Yetersiz bakiye");
         }
        }
        
        else if (hesap.getHesapNumarasi() == hedefHesapNumarasi){
          
         hesap.setBakiye(hesap.getBakiye()+miktar);
        }
            
      }
   }
   
   public void GunlukFaizHesapla(double faizOrani, double bakiye){
       double faizliPara = ((bakiye * faizOrani)/100)+ bakiye;
       
       System.out.println("Paraniz faizde bir gün sonra " + faizliPara + "miktarina ulasacaktir");
   }
   
   
}
