import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk değeri giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci değeri giriniz: ");
        b = input.nextInt();

        int total = 1;
        for(int i = 0; i<b; i++){
            total *= a;
        }
        System.out.println("Cevap: " + total);
    }
}