public class Course {
    Teacher teacher;   // Teacher sınıfından teacher nesnesi atadık.
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher){    // bu metot dışarıdan aldığım teacher nesnemi içerideki teacher nesnesine eşitleyecek.
        if(teacher.branch.equals(this.prefix)){     // Teacher sınıfındaki özellikler buradaki teacher nesnesine taşınıyor. O da Main sınıfındaki t1 nesnesine denk geliyor.
            this.teacher = teacher;         // dışarıdan aldığım teacher nesnesi = içerideki teacher nesnesi;
        }
        else{
            System.out.println("Öğretmen ve Ders bilgileri uyuşmuyor.");
        }

    }
    void printTeacher(){
        this.teacher.print();  // Course metodunda aldığım teacher'ın printi çalışacak
    }

}
