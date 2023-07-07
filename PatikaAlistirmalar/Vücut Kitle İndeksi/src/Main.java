import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        double boy, kilo;
        Scanner input = new Scanner(System.in);

        System.out.println("Boy Bilgisi: ");
        System.out.println("Kilo Bilgisi: ");

        boy = input.nextDouble();
        kilo = input.nextDouble();

        double sonuc = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksi: " + sonuc);
    }
}