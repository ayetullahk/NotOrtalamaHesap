
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,beden,resim;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz:  ");
        mat= inp.nextInt();
        System.out.print("Fizik notunu giriniz:  ");
        fizik= inp.nextInt();
        System.out.print("Türkçe notunu giriniz:  ");
        turkce= inp.nextInt();
        System.out.print("Beden Eğtimi notunu giriniz:  ");
        beden= inp.nextInt();
        System.out.print("Resim Dersi notunu giriniz:  ");
        resim= inp.nextInt();
        int toplam=mat+fizik+turkce+beden+resim;
        double ortalama=toplam/5;
        System.out.println("Ortalamanız:" + ortalama);
        boolean kosul = ortalama >= 60;
        System.out.println(kosul ? "Geçtiniz" : "Kaldınız");

    }
}