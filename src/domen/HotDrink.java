package domen;

public class HotDrink extends Product {
    private double volume;
    private double temperature;

    public HotDrink(long id, String name, double price, int place, double volume, double temperature) {
        super(id, name, price, place);
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" + super.toString() +
                "volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
}
