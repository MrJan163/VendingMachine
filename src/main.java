
import domen.Bottle;
import domen.HotDrink;
import domen.Product;
import services.CoinDespenser;
import services.Display;
import services.Holder;
import services.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception{
        Product product1 = new Product(1, "Chips Lais", 3.50, 7);
        Product product2 = new Product(2, "Chocolate", 5, 2);
        Product product3 = new Product(3, "Nuts", 6.3, 8);
        /* Добавляем Бутылку в автомат
         */
        Bottle bottle = new Bottle(4, "Coca Cola", 8.2, 11, 0.5);
        HotDrink hotDrink1 = new HotDrink(5, "Nestea", 7.4, 5, 0.33, +10 );
        HotDrink hotDrink2 = new HotDrink(6, "Coffe", 10.2, 6, 0.2, +55);

        /*
         * Добавляем Товар в список продуктов
         */
        List<Product> ourList = new ArrayList<>();
        ourList.add(product1);
        ourList.add(product2);
        ourList.add(product3);
        ourList.add(bottle);
        ourList.add(hotDrink1);
        ourList.add(hotDrink2);



        Holder holder = new Holder();
        Display display = new Display();
        CoinDespenser coinDespenser = new CoinDespenser();


        VendingMachine machine = new VendingMachine(holder, display, coinDespenser, ourList);
        for (Product item : machine.getProducts()) {
        System.out.println(item);
        }






    }
}
