import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz : ");
        int mat = scan.nextInt();
        System.out.print("Fizik Notunuzu Giriniz : ");
        int fizik = scan.nextInt();
        System.out.print("Kimya Notunuzu Giriniz : ");
        int kimya = scan.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz : ");
        int turkce = scan.nextInt();
        System.out.print("Tarih Notunuzu Giriniz : ");
        int tarih = scan.nextInt();
        System.out.print("Müzik Notunuzu Giriniz : ");
        int muzik = scan.nextInt();
        float ortalama = (float)((mat + fizik + kimya + turkce + tarih + muzik) / 6);
        System.out.print("Not Ortalamanız : " + ortalama);
        int gecmeNotu = 60;
        boolean gecmeDurumu = ortalama >= (float)gecmeNotu;
        String str = gecmeDurumu ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.print("\nGeçme Durumunuz : " + str);
    }
}
