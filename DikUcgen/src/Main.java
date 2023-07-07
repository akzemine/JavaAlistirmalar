import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kisaKenar, uzunKenar, hipotenus, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.println("Kısa kenarı giriniz: ");
        System.out.println("Uzun kenarı giriniz: ");

        kisaKenar = input.nextDouble();
        uzunKenar = input.nextDouble();

        sonuc = Math.sqrt((kisaKenar * kisaKenar) + (uzunKenar * uzunKenar));
        System.out.println("Hipotenüs= " + sonuc);

    }
}