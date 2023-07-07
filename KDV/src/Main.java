import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvOranı = 0.18, yeniTutar, kdvTutarı;
        Scanner input = new Scanner(System.in);
        System.out.println("Tutarı giriniz: ");
        tutar = input.nextDouble();
        System.out.println("KDV'siz fiyat: " + tutar);


        kdvTutarı = tutar * kdvOranı;
        yeniTutar = tutar + kdvTutarı;

        System.out.println("KDV'li fiyat: " + yeniTutar);
        System.out.println("KDV tutarı: " + kdvTutarı);

    }
}
