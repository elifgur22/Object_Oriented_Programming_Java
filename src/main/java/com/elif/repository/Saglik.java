package com.elif.repository;

import com.elif.entity.Insan;
import com.elif.entity.NormalInsan;
import com.elif.enums.AsiDurumu;
import com.elif.enums.HastalikBulastirmaDurumu;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.elif.database.DataBase.*;

/**
 *  Sağlık sınıfı bizim depocumuz olduğu için repository' ekledim. Kendi özellikleri yoktur, sadece bize bilgiyi istiflemesi, bulup getimesi amaçlı kullandığımızı istemişsiniz soruda,
 *  Bu yüzden buraya ekledim.
 */
public class Saglik implements ISaglik {

    public void asilamaYap(Insan insan) {
        if(insan.getHastalikBulastirmaDurumu().equals(HastalikBulastirmaDurumu.BULASTIRABILIR)){
            asilananInsanlar[asilananInsanSayisi++]=insan;
            insan.setAsiDurumu(AsiDurumu.ASILIDIR);
        }
        DateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        Date tarih = new Date();
        insan.setAsilanmaTarihi(sdf);
        System.out.println(insan.getAd() + " adlı, " + insan.getSoyad() + " soyadlı kişi, " +sdf.format(tarih) +" tarihinde aşılanmıştır.");
    }

    public Insan [] asilananInsanlarTumu(){
        Insan [] insanDizi=new NormalInsan[asilananInsanSayisi];

        for(int i=0; i<asilananInsanSayisi; i++){
            insanDizi [i]=asilananInsanlar[i];
        }

        return insanDizi;
        //100 adet kayıt içerisinde null olanları göstermemesini sağlamaya çalıştım.
    }

}
