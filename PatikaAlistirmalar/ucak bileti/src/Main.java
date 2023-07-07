import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km, age, typeFlight;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi girin: ");
        km = input.nextInt();
        System.out.print("Yaşınızı girin: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini girin: ");
        typeFlight = input.nextInt();

        double kmPrice = 0.10;
        double price = km * kmPrice;
        double age12 = 0.50, age24 = 0.10, age65 = 0.30, typeRatio = 0.20, newPrice;

        if (age < 0 || !(typeFlight == 1 || typeFlight == 2) || km < 0) {
            System.out.println("Hatalı Girdiniz. Tekrar Deneyin!");
        } else if (age < 12) {
            newPrice = price - (age12 * price);
            if (typeFlight == 2) {
                newPrice = newPrice - (typeRatio * newPrice);
                newPrice *= 2;
            }
            System.out.println("Ücretiniz: " + newPrice);
        } else if (age > 12 && age < 24) {
            newPrice = price - (age24 * price);
            if (typeFlight == 2) {
                newPrice = newPrice - (typeRatio * newPrice);
                newPrice *= 2;
            }
            System.out.println("Ücretiniz: " + newPrice);
        } else if (age > 65) {
            newPrice = price - (age65 * price);
            if (typeFlight == 2) {
                newPrice = newPrice - (typeRatio * newPrice);
                newPrice *= 2;
            }
            System.out.println("Ücretiniz: " + newPrice);
        }
    }
}