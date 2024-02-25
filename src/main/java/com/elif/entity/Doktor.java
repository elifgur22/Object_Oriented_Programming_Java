package com.elif.entity;

import com.elif.enums.AsiDurumu;
import com.elif.enums.Cinsiyet;
import com.elif.enums.HastalikBulastirmaDurumu;

public class Doktor extends Insan{
    String uzmanlikAlani;
    int hastaSayisi;

    public Doktor() {
        super();
        this.setAsiDurumu(AsiDurumu.ASILIDIR);
        this.setHastalikBulastirmaDurumu(HastalikBulastirmaDurumu.BULASTIRABILIR);
    }

    public Doktor(String tcKimlikNo, String ad, String soyad, Cinsiyet cinsiyet, int yas, String uzmanlikAlani, int hastaSayisi) {
        super(tcKimlikNo, ad, soyad, cinsiyet, yas);
        this.uzmanlikAlani = uzmanlikAlani;
        this.hastaSayisi = hastaSayisi;
        this.setAsiDurumu(AsiDurumu.ASILIDIR);
        this.setHastalikBulastirmaDurumu(HastalikBulastirmaDurumu.BULASTIRABILIR);
    }

    @Override
    public String toString() {
        return "Doktor{" +
                "uzmanlikAlani='" + uzmanlikAlani + '\'' +
                ", hastaSayisi=" + hastaSayisi +
                '}';
    }
}
