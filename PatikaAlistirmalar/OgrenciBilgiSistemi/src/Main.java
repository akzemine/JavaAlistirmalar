
public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca", "555", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "552", "FZK");
        Teacher t3 = new Teacher("Ayşe Hoca", "553", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");  // Yukarıda tanımlanan nesneyi buraya atadık.
        Course fizik = new Course("Fizik", "102", "FZK");
        Course bio = new Course("Biyoloji", "103", "BIO");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        bio.addTeacher(t3);

        Student s1 = new Student("Emine", "123", "4", tarih,fizik,bio);
        s1.addBulkExamNote(100,55,90);
        s1.isPass();

        Student s2 = new Student("Sinem", "124", "4", tarih,fizik,bio);
        s2.addBulkExamNote(30,45,70);
        s2.isPass();

    }
}