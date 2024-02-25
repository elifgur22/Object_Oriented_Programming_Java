package com.elif.entity;

import com.elif.enums.Cinsiyet;
import com.elif.enums.HastalikBulastirmaDurumu;
import com.elif.enums.HastalikDurumu;

public class SuperInsan extends Insan{
    public SuperInsan() {
        setHastalikBulastirmaDurumu(HastalikBulastirmaDurumu.BULASTIRMAZ);
        setHastalikDurumu(HastalikDurumu.TASIMIYOR); //hiçbir super insan hastalık taşımadığı için default consta set etmek istedim.
    }

    public SuperInsan(String tcKimlikNo, String ad, String soyad, Cinsiyet cinsiyet, int yas) {
        super(tcKimlikNo, ad, soyad, cinsiyet, yas);
        setHastalikBulastirmaDurumu(HastalikBulastirmaDurumu.BULASTIRMAZ);
        setHastalikDurumu(HastalikDurumu.TASIMIYOR);
    }
}
