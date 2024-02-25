package com.elif;

import com.elif.entity.Doktor;
import com.elif.entity.Insan;
import com.elif.entity.NormalInsan;
import com.elif.entity.SuperInsan;
import com.elif.enums.Cinsiyet;
import com.elif.repository.Saglik;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Lütfen aşı olmasını istediğiniz kişi adedini giriniz....:");
        int sayi=sc.nextInt();
        String deneme=sc.nextLine();
        Saglik saglik=new Saglik();
        String tcKimlik;
        String ad;
        String soyad;
        String name=null;
        int yas;

        for(int i=0; i<sayi; i++){
            System.out.println("Lütfen kişi adını giriniz ...: ");
            ad=sc.nextLine();
            System.out.println("Lütfen kişinin soyadını giriniz ...:");
            soyad=sc.nextLine();

            int secim;
            do{
                System.out.println("Lütfen kişinin TC Kimlik Numarasını giriniz ...:");
                tcKimlik=sc.nextLine();
                System.out.println("Lütfen kişinin cinsiyetini numara olarak giriniz ...:");
                System.out.println("1- KADIN");
                System.out.println("2- ERKEK");
                System.out.println("3- BELİRTMEK İSTEMİYOR");
                secim= sc.nextInt();

                if(secim==1){
                    name="KADIN";
                }else if(secim==2){
                    name="ERKEK";
                } else if (secim==3) {
                    name="BELIRTMEK_ISTEMIYOR";
                }else{
                    System.out.println("Lütfen tekrar cinsiyeti önündeki numarası ile 1,2,3 şeklinde belirtiniz:");
                }

            }while(secim>2);
            System.out.println("Lütfen kişinin yaşını giriniz ...: ");
            yas=sc.nextInt();
            Insan insan=new NormalInsan(tcKimlik,ad,soyad,Cinsiyet.valueOf(name),yas);
            saglik.asilamaYap(insan);
        }


        System.out.println("***************************");
        Insan insan6= new Doktor("30012562365", "Angelina", "Jolie", Cinsiyet.KADIN,45,"Kardiyolog", 23);
        System.out.println("Doktorların default olarak aşılı ve hastalığı bulaştırabileceğini kontrol ediyorum: ");
        System.out.println(insan6.toString());
        System.out.println("**************************");
        System.out.println();
        Insan insan7= new SuperInsan("30012432365", "Mehmet", "Günsur", Cinsiyet.ERKEK,55);
        System.out.println("Süper insanların default olarak hasta olmaz ya da hastalığı bulaştırmayacağını eklediğimi kontrol ediyorum: ");
        System.out.println(insan7.toString());
        System.out.println();
        System.out.println("***************************");
        System.out.println("***** TÜM AŞI OLAN İNSANLARIN LİSTESİ *****");
        for(Insan insan: saglik.asilananInsanlarTumu()){
            System.out.println(insan);
        }
    }
}
