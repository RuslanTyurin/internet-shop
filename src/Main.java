public class Main {
    public static void main(String[] args) {
       Basket vasyaBasket = new Basket();
       vasyaBasket.add("Молоко", 80);
       vasyaBasket.add("Хлеб", 40);

       Basket lisaBascet = new Basket(400);
       lisaBascet.add("Член резиновый", 500);
       lisaBascet.add("Вино", 390);
       Basket mashaBasket = new Basket("Стол", 5000);

       mashaBasket.print("Корзина Маши");
       vasyaBasket.print("Корзина Васи");
       lisaBascet.print("Корзина Лизы");

    }
}
