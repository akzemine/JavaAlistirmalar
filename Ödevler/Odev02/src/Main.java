import model.Category;
import model.Film;
import model.Platform;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean exitStatus = true;
        int menuControl, adminControl;

        List<Film> FilmList = new ArrayList<>();

        ArrayList<Category> categoryList = new ArrayList<>();
        ArrayList<String> platformList = new ArrayList<>();

        do {

            System.out.println("1-Admin Girişi\n2-Kullanıcı Girişi\n0-Çıkış");
            menuControl = input.nextInt();

            switch (menuControl) {
                case 1:
                    System.out.println("Admin Girişi yapıldı");
                    System.out.println("Yapmak istediğiniz işlemi seçin: ");
                    System.out.println("1-Kategori ekle\n2-Platform ekle\n3-Film Ekle");
                    adminControl = input.nextInt();


                    switch (adminControl) {
                        case 1:
                            input.nextLine();
                            System.out.println("Eklemek istediğiniz kategorinin adını giriniz: ");
                            String newCategoryName = input.nextLine();
                            Category category = new Category(newCategoryName);
                            categoryList.add(category);

                            break;

                        case 2:
                            input.nextLine();
                            System.out.println("Eklemek istediğiniz platformun adını giriniz: ");
                            String newPlatformName = input.nextLine();
                            platformList.add(newPlatformName);

                            break;

                        case 3:
                            System.out.println("Kategori seçin: ");
                            for (int i = 0; i < categoryList.size(); i++) {
                                System.out.println((i + 1) + "-" + categoryList.get(i).getCategoryName());
                            }
                            int catIndex = input.nextInt();

                            System.out.println("Platformu seçin: ");
                            for (int i = 0; i < platformList.size(); i++) {
                                System.out.println((i + 1) + "-" + platformList.get(i));
                            }
                            int platIndex = input.nextInt();
                            input.nextLine();
                            System.out.println("Eklemek istediğiniz filmin adını giriniz: ");
                            String movieName = input.nextLine();
                            System.out.println("Filmin yılını giriniz: ");
                            int movieYear = input.nextInt();
                            input.nextLine();
                            System.out.println("Filmin imdb puanını giriniz: ");
                            double imdbScore = input.nextDouble();

                            Film newFilm = new Film(movieName, movieYear, imdbScore);
                            ArrayList<Category> tempCatList = new ArrayList<>();
                            tempCatList.add(categoryList.get(catIndex - 1));
                            newFilm.setCategoryList(tempCatList);
                            categoryList.get(catIndex - 1).setFilmCount();

                            Platform newPlatform = new Platform();
                            newPlatform.setPlatformName(platformList.get(platIndex - 1));
                            ArrayList<Platform> tempPlatList = new ArrayList<>();
                            tempPlatList.add(newPlatform);
                            newFilm.setPlatformList(tempPlatList);

                            FilmList.add(newFilm);

                            System.out.println("Film kaydı oluşturuldu.");

                            break;
                    }
                    break;

                case 2:
                    System.out.println("Filmleri listelemek için kategori seçiniz: ");
                    for (int i = 0; i < categoryList.size(); i++) {
                        System.out.println((i + 1) + "-" + categoryList.get(i).getCategoryName() + " Kategorideki film sayısı: " + categoryList.get(i).getFilmCount());
                    }
                    int categorySelect = input.nextInt();
                    System.out.println(categoryList.get(categorySelect - 1) + " kategorisinde listelenen filmler: ");

                    for (Film fd : FilmList) {
                        for (Category cat : fd.getCategoryList()) {
                            if (cat.getCategoryName().equals(categoryList.get(categorySelect - 1).getCategoryName())) {
                                System.out.println(fd);
                            }
                        }
                    }

                    break;

                case 0:
                    System.out.println("Çıkış yapılıyor");
                    exitStatus = false;
                    input.close();
            }

        } while (exitStatus == true);

    }
}