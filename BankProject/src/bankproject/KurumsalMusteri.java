/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankproject;

import java.util.ArrayList;


public class KurumsalMusteri extends Musteri{
    
    private String sirketAdi;
    private String vergiNo;
    private String email;
    private String telefonNumarasi;
    private ArrayList<Hesap> hesaplar = new ArrayList<Hesap>();

    public KurumsalMusteri(String sirketAdi, String vergiNo, String email, String telefonNumarasi, String ad, String soyad, String tcKimlikNo) {
        super(ad, soyad, tcKimlikNo);
        this.sirketAdi = sirketAdi;
        this.vergiNo = vergiNo;
        this.email = email;
        this.telefonNumarasi = telefonNumarasi;
    }
    
    public KurumsalMusteri(String ad, String soyad , String tcKimlikNo){
        super(ad, soyad, tcKimlikNo);
    }

    public String getSirketAdi() {
        return sirketAdi;
    }

    public String getVergiNo() {
        return vergiNo;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public ArrayList<Hesap> getHesaplar() {
        return hesaplar;
    }

    public void setSirketAdi(String sirketAdi) {
        this.sirketAdi = sirketAdi;
    }

    public void setVergiNo(String vergiNo) {
        this.vergiNo = vergiNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public void setHesaplar(ArrayList<Hesap> hesaplar) {
        this.hesaplar = hesaplar;
    }

    public void KurumsalBilgileriGoruntule(){
        System.out.println("Sirket Adi : " + sirketAdi + "Vergi no : " + vergiNo + "Telefon Numarası : " + telefonNumarasi
          + "email : " + email);
    }
 
    public void krediBasvurusuYap(String krediTuru,double faizOrani ,int vade,int talepEdilenMiktar){
        
       Kredi kredi = new Kredi(krediTuru , faizOrani , vade ,talepEdilenMiktar);
       
    }
    
    public void HesapOzetiGoruntule(int hesapNumarasi){
        
        for(Hesap hesap : hesaplar){
           
           if(hesap.getHesapNumarasi() == hesapNumarasi){
               System.out.println("Hesap Numarasi : " + hesap.getHesapNumarasi() + "Bakiye : " + hesap.getBakiye());
               
           } 
        }
    }
}
