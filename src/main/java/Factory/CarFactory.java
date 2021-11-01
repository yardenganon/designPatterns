package Factory;

public class CarFactory {

    public Car createCar(String company) {
        return internalCarCreation(company, 2000, "White");
    }

    public Car createCar(String company, int year) {
        return internalCarCreation(company, year, "White");
    }

    public Car createCar(String company, int year, String color) {
        return internalCarCreation(company, year, color);
    }

    private Car internalCarCreation(String company, int year, String color) {
        if (company.equals("kia"))
            return new Kia(year,color,"N/A");
        if (company.equals("mazda"))
            return new Mazda(year, color, Mazda.WindowType.GLASS);
        return null;
    }


    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.createCar("mazda");
        Car car2 = carFactory.createCar("mazda", 2021, "Black");
        Car car3 = carFactory.createCar("kia", 2015);

        car.printDetails();
        car2.printDetails();
        car3.printDetails();
    }
}
