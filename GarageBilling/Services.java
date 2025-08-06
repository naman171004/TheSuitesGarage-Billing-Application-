package CarGarage.files;

public class Services {
    String name;
    double price;

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Services(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
