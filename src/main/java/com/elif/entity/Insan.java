package com.elif.entity;

import com.elif.enums.AsiDurumu;
import com.elif.enums.Cinsiyet;
import com.elif.enums.HastalikBulastirmaDurumu;
import com.elif.enums.HastalikDurumu;

import java.text.DateFormat;

public abstract class Insan {

    private String tcKimlikNo;
    private String ad;
    private String soyad;
    private Cinsiyet cinsiyet;
    private HastalikBulastirmaDurumu hastalikBulastirmaDurumu;
    private HastalikDurumu hastalikDurumu;
    private AsiDurumu asiDurumu;
    private int yas;
    private DateFormat asilanmaTarihi;

    public Insan() {
    }

    public Insan(String tcKimlikNo, String ad, String soyad, HastalikBulastirmaDurumu hastalikBulastirmaDurumu, HastalikDurumu hastalikDurumu) {
        this.tcKimlikNo = tcKimlikNo;
        this.ad = ad;
        this.soyad = soyad;
        this.hastalikBulastirmaDurumu = hastalikBulastirmaDurumu;
        this.hastalikDurumu = hastalikDurumu;
    }

    public Insan(String tcKimlikNo, String ad, String soyad,Cinsiyet cinsiyet, int yas) {
        this.tcKimlikNo = tcKimlikNo;
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet=cinsiyet;
        this.yas=yas;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "tcKimlikNo='" + tcKimlikNo + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", cinsiyet=" + cinsiyet +
                ", hastalığı bulaştırma durumu=" + hastalikBulastirmaDurumu +
                ", asiDurumu=" + asiDurumu +
                ", yas=" + yas +
                '}';
    }


    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public HastalikBulastirmaDurumu getHastalikBulastirmaDurumu() {
        return hastalikBulastirmaDurumu;
    }

    public void setHastalikBulastirmaDurumu(HastalikBulastirmaDurumu hastalikBulastirmaDurumu) {
        this.hastalikBulastirmaDurumu = hastalikBulastirmaDurumu;
    }

    public HastalikDurumu getHastalikDurumu() {
        return hastalikDurumu;
    }

    public void setHastalikDurumu(HastalikDurumu hastalikDurumu) {
        this.hastalikDurumu = hastalikDurumu;
    }

    public AsiDurumu getAsiDurumu() {
        return asiDurumu;
    }

    public void setAsiDurumu(AsiDurumu asiDurumu) {
        this.asiDurumu = asiDurumu;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public DateFormat getAsilanmaTarihi() {
        return asilanmaTarihi;
    }

    public void setAsilanmaTarihi(DateFormat asilanmaTarihi) {
        this.asilanmaTarihi = asilanmaTarihi;
    }
}
