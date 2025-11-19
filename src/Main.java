public class Main {
    public static void main(String[] args) {
       Basket vasyaBasket = new Basket();
       vasyaBasket.add("Молоко", 80);
       vasyaBasket.add("Хлеб", 40);

       Basket lisaBascet = new Basket();
       lisaBascet.add("Член резиновый", 500);
       lisaBascet.add("Вино", 390);

       vasyaBasket.print("Корзина Васи");
       lisaBascet.print("Корзина Лизы");

    }
}
