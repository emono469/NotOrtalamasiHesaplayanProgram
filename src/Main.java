import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int mat, fizik, muzik, tarih, turkce, kimya;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz: ");
        mat = scanner.nextInt();

        System.out.println("Fizik notunu giriniz: ");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunu giriniz: ");
        kimya = scanner.nextInt();

        System.out.println("Türkçe notunu giriniz: ");
        turkce = scanner.nextInt();

        System.out.println("Tarih notunu giriniz: ");
        tarih = scanner.nextInt();

        System.out.println("Müzik notunu giriniz: ");
        muzik = scanner.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + muzik;
        int ortalama = toplam / 6;
        System.out.println("Derslerin ortalaması: " + ortalama);

        boolean sonuc = ortalama > 60;
        String sonucBildirimi = sonuc ? "Geçti" : "Kaldı";
        System.out.println(sonucBildirimi);

    }
}