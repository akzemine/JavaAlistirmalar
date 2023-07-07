import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int derece;
        Scanner input = new Scanner(System.in);
        System.out.println("Hava sıcaklığı: ");
        derece = input.nextInt();

        if(derece < 5){
            System.out.println("Kayak");
        }
        else if (derece > 5 && derece < 15) {
            System.out.println("Sinema");
        }
        else if (derece > 15 && derece < 25) {
            System.out.println("Piknik");
        }
        else if (derece > 25) {
            System.out.println("Yüzme");
        }

    }
}