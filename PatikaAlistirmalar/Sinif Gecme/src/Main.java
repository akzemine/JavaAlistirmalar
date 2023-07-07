import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.println("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.println("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.println("Müzik notunuz: ");
        muzik = input.nextInt();

        double average = (mat+fizik+turkce+kimya+muzik)/5;

        if(average > 55){
            System.out.println("Geçtiniz");
        }
        else{
            System.out.println("Kaldınız");
        }

    }
}