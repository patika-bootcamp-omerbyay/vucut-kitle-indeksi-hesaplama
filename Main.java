import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri tanımlıyoruz
        double boy, kilo, vki;
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan boy bilgisini alıyoruz
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        // Kullanıcıdan kilo bilgisini alıyoruz
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        // VKI Formülü: Kilo / (Boy * Boy)
        vki = kilo / (boy * boy);

        // Sonucu ekrana yazdırıyoruz
        System.out.println("Vücut Kitle İndeksiniz : " + vki);

        input.close();
    }
}
