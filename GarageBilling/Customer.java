package CarGarage.files;

public class Customer{
    String name;
    String Phn;
    Car car;

    public String getName() {
        return name;
    }

    public String getPhn() {
        return Phn;
    }

    public Car getCar() {
        return car;
    }

    public Customer(String name, String phn, Car car) {
        this.name = name;
        Phn = phn;
        this.car = car;
    }
}
