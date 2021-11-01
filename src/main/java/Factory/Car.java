package Factory;

public abstract class Car {
    protected final int manufacturingYear;
    protected String color;

    public Car(int manufacturingYear, String color) {
        this.manufacturingYear = manufacturingYear;
        this.color = color;
    }


    public abstract void printDetails();
}
