package Factory;

public class Kia extends Car {

    private String kiaSerialNumber;
    public Kia(int manufacturingYear, String color, String kiaSerialNumber) {
        super(manufacturingYear, color);
        this.kiaSerialNumber = kiaSerialNumber;
    }

    @Override
    public void printDetails() {
        System.out.println(Kia.class.getSimpleName() + " " + this.manufacturingYear + " " + this.color + " " + this.kiaSerialNumber);
    }
}
