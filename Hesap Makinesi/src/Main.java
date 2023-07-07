import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        n1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz: ");
        int select = input.nextInt();
        System.out.println("Seçim: " + select);

        if(select == 1){
            sonuc = n1 + n2;
            System.out.println("Sonuç: " + sonuc);
        }
        else if (select == 2){
            sonuc = n1 - n2;
            System.out.println("Sonuç: " + sonuc);
        }
        else if (select == 3){
            sonuc = n1 * n2;
            System.out.println("Sonuç: " + sonuc);
        }
        else if (select == 4){
            if(n2 != 0){
                sonuc = n1 / n2;
                System.out.println("Sonuç: " + sonuc);
            }
            else{
                System.out.println("Bir sayı sıfıra bölünemez");
            }
        }
        else{
            System.out.println("Hatalı giriş yaptınız");
        }

    }
}