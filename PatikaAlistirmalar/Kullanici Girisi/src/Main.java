import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı girin: ");
        userName = input.nextLine();
        System.out.print("Parola girin: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız");
        }
        else{
            System.out.println("Bilgileriniz Yanlış! Tekrar Deneyiniz.");
        }

    }
}