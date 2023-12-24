/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankproject;

/**
 *
 * @author Acer
 */
public class Kredi {
   private String krediTuru;
   private double faizOrani;
   private int vade;
   private int talepEdilenMiktar;

    public Kredi(String krediTuru , double faizOrani , int vade , int talepEdilenMiktar) {
     
    this.faizOrani = faizOrani;
    this.krediTuru = krediTuru;
    this.vade = vade;
    this.talepEdilenMiktar = talepEdilenMiktar;
        
    }

    public String getKrediTuru() {
        return krediTuru;
    }

    public double getFaizOrani() {
        return faizOrani;
    }

    public int getVade() {
        return vade;
    }
   
   
}
