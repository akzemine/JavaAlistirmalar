import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r, alan, cevre, π = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz: ");
        r = input.nextDouble();

        alan = π* r * r;
        cevre = 2* π * r;

        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);

    }
}