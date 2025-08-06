package CarGarage.files;

public final class Services {
    private final String name;
    private final double price;

    public Services(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - ₹" + price;
    }
}
