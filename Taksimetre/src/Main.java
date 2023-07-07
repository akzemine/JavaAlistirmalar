import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, taksimetre = 2.20, ucret;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç km: ");

        km = input.nextDouble();
        ucret = 10 + (km * taksimetre);

        if (ucret>=20){
            System.out.println("Ücretiniz: " + ucret);
        }
        else{
            System.out.println("Ücretiniz 20 TL");
        }

    }
}