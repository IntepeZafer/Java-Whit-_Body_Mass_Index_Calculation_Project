package com.mycompany.bedenkitleendeksihesaplama;

import java.util.Scanner;

public class BedenKitleEndeksiHesaplama {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Beden Kitle Endesksi Programına Hoş Geldiniz\n");
        
        System.out.print("Kilonuzu Giriniz: ");
        int kg = scanner.nextInt();
        
        System.out.print("Boyunuzu Giriniz (Örnek: 17.5): ");
        double boy = scanner.nextDouble();
        
        double snc = kg / (boy * boy);
        
        if(snc >= 18.5 && snc <= 24.9){
            System.out.println("Kilonuz Normal Değerlerde");
        }else if(snc >= 24.9 && snc <= 29.9){
            System.out.println("Kilonuz Normal Üstünde 1.Obez");
        }else if(snc >= 30.0 && snc <= 34.9){
            System.out.println("Kilonuz Çok Fazla 2.Obez");
        }else{
            System.out.println("Kilonuz Anormal Derece de Yüksek: 3.Obez");
        }
    }
}
