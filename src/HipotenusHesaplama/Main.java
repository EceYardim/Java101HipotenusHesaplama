package HipotenusHesaplama;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlayalım
        int kenara, kenarb;
        //Kullanıcıdan dik kenar uzunluklarını alalım
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Kenar uzunluğunu giriniz:");
        kenara = inp.nextInt();
        System.out.print("2. Kenar uzunluğunu giriniz:");
        kenarb = inp.nextInt();
        double kenarc;
        kenarc = Math.sqrt((kenara * kenara) + (kenarb * kenarb));
        System.out.println("Hipotenüs:" + kenarc);

        double cevre, alan;
        cevre = kenara + kenarb + kenarc;
        System.out.println( "Üçgenin Çevresi:" + cevre);
        alan = Math.sqrt(cevre/2*(cevre/2-kenara)*(cevre/2-kenarb)*(cevre/2-kenarc));
        System.out.println( "Üçgenin Alanı: " + alan);

    }
}
