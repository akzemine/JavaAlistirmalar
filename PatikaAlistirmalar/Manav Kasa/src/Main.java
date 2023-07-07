import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double armut, elma, domates, muz, patlıcan;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kg armut: ");
        armut = input.nextDouble();
        System.out.print("Kaç kg elma: ");
        elma = input.nextDouble();
        System.out.print("Kaç kg domates: ");
        domates = input.nextDouble();
        System.out.print("Kaç kg muz: ");
        muz = input.nextDouble();
        System.out.print("Kaç kg patlıcan: ");
        patlıcan = input.nextDouble();

        double aUcret, eUcret, dUcret, mUcret, pUcret;
        aUcret = armut * 2.14;
        eUcret = elma * 3.67;
        dUcret = domates * 1.11;
        mUcret = muz * 0.95;
        pUcret = patlıcan * 5.00;

        double total = aUcret + eUcret + dUcret + mUcret + pUcret;
        System.out.println("Toplam tutar: " + total + " TL");

    }
}