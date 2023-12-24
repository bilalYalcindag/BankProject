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
public class Hesap {
    
  private int hesapNumarasi;
  private double bakiye = 0;
  private ArrayList<Islem> islemler;

    public Hesap(int hesapNumarasi , double bakiye) {
        
    this.bakiye = bakiye;
    this.hesapNumarasi = hesapNumarasi;
    
    islemler = new ArrayList<Islem>();
        
    }

    public int getHesapNumarasi() {
        return hesapNumarasi;
    }

    public double getBakiye() {
        return bakiye;
    }

    public ArrayList<Islem> getIslemler() {
        return islemler;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
  
    public void ParaYatir(double miktar){
        
        setBakiye(bakiye+miktar);
        
    }
    
    public void ParaCek(double miktar){
        
        if(miktar <= getBakiye()){
            setBakiye(bakiye-miktar);
        }
        else{
            System.out.println("Yetersiz bakiye");
        }    
    }
    
    public void GunlukFaizHesapla(double faizOrani){
       double faizliPara = ((bakiye * faizOrani)/100)+ bakiye;
       
       System.out.println("Paraniz faizde bir gün sonra " + faizliPara + "miktarina ulasacaktir");
   }

    public void ParaTransferi(int hedefHesapNumarasi, double miktar){
        Banka banka = new Banka("BizimBanka","Erzurum");
        banka.ParaTransferi(getHesapNumarasi(), hedefHesapNumarasi, miktar);
    }

   

    
    

}
