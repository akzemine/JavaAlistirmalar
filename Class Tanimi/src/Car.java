public class Car {
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    // Parametreli Constructor Metot
    Car(String model, int speed, String color){
        this.model = model;  // this class'ı ifade eder. metodu değil.
        this.speed = speed;
        this.color = color;
        this.type = "Sedan";  // Varsayılan değerleri constructor içine girmeliyiz.
        this.speedLimit = 180;
    }

    // Parametresiz Constructor Metot
    Car(){
        System.out.println("Boş constructor metodu oluşturuldu.");
    }
    int increaseSpeed(int increment){
        if ((this.speed + increment) < this.speedLimit){
            this.speed += increment;
        }
        return this.speed;
    }
    int decreaseSpeed(int decrease){
        if(this.speed > 0){
            this.speed -= decrease;
        }
        return this.speed;
    }
    void printSpeed(){
        System.out.println(this.model + " Hızınız: " + this.speed);
    }

    void printInfo(){
        System.out.println("Model: \t" + this.model);
        System.out.println("Color: \t" + this.color);
        System.out.println("Type: \t" + this.type);
        System.out.println("Speed: \t" + this.speed);
    }

}
