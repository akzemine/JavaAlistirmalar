import java.util.Scanner;

public class Main {
    static int exp(int a, int b) {

        if (a == 1 || b == 0) {
            return 1;
        }

        return a * exp(a, b - 1);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.print("İlk sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();

        System.out.println(exp(a, b));
    }
}