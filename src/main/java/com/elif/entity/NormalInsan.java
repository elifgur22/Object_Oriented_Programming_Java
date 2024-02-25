package com.elif.entity;


import com.elif.enums.Cinsiyet;
import com.elif.enums.HastalikBulastirmaDurumu;

public class NormalInsan extends Insan{

    public NormalInsan() {
        this.setHastalikBulastirmaDurumu(HastalikBulastirmaDurumu.BULASTIRABILIR);
    }

    public NormalInsan(String tcKimlikNo, String ad, String soyad, Cinsiyet cinsiyet, int yas) {
        super(tcKimlikNo, ad, soyad, cinsiyet, yas);
        this.setHastalikBulastirmaDurumu(HastalikBulastirmaDurumu.BULASTIRABILIR);

    }
}
