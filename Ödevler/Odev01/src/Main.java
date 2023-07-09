import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args) {

        HashMap<String, String> ogrenciler = new HashMap<>();
        ogrenciler.put("Ali Can", "9-A");
        ogrenciler.put("Neslihan Demir", "9-B");
        ogrenciler.put("Atakan Ocak", "9-C");
        ogrenciler.put("Furkan Ocak", "9-C");
        ogrenciler.put("Furkan Kale", "9-A");
        ogrenciler.put("Emine Aköz", "9-A");
        ogrenciler.put("Ayşe Yılmaz", "9-D");
        ogrenciler.put("Mehmet Demir", "9-B");
        ogrenciler.put("Fatma Kaya", "9-C");
        ogrenciler.put("Ahmet Yıldırım", "9-D");

        for (String ogrenci : ogrenciler.keySet()) {
            String[] adSoyad = ogrenci.split(" ");
            String isim = adSoyad[0];
            if (isim.endsWith("an")) {
                String sinif = ogrenciler.get(ogrenci);
                System.out.println("Öğrenci: " + ogrenci + " - Sınıf: " + sinif);
            }
        }
    }
}
