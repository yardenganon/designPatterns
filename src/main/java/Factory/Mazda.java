package Factory;

public class Mazda extends Car {

    enum WindowType {
        GLASS,
        SUPERGLASS,
    }

    protected WindowType mazdaWindowType;
    public Mazda(int manufacturingYear, String color, WindowType mazdaWindowType ) {
        super(manufacturingYear, color);
        this.mazdaWindowType = mazdaWindowType;
    }

    @Override
    public void printDetails() {
        System.out.println(Mazda.class.getSimpleName() + " " + this.manufacturingYear + " " + this.color + " " + this.mazdaWindowType.toString());
    }
}
