package domen;
/* Добавляем класс Бутылка, который наследует
 * все свойства Продукта
 * */
public class Bottle extends Product {
    /*
     * Добавляем объем бутылки
     * */
    private double volume;

    public Bottle(long id, String name, double price, int place, double volume) {
        super(id, name, price, place);

        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bottle{" + super.toString() +
                "volume=" + volume +
                '}';
    }
}
