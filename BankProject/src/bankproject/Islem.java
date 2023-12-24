/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankproject;


public class Islem {
    
    private String islemTuru;
    private double miktar;

    public Islem(String islemTuru , double miktar) {
        
        this.islemTuru = islemTuru;
        this.miktar = miktar;
    }

    public String getIslemTuru() {
        return islemTuru;
    }

    public double getMiktar() {
        return miktar;
    }

    public void setIslemTuru(String islemTuru) {
        this.islemTuru = islemTuru;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }
    
    
    
}
