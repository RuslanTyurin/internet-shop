public class Basket {
    private static String items = "";
    private static int totalPrice = 0;

    public static void main(String[] args) {
        add("Колбаса", 76);
        add("Молоко", 110);
        add("Масло", 115);
        print("Содержимое корзины");
        clear();
        print("Содержимое корзины");
        System.out.println(totalPrice);
        int totalPrice = 15;
        System.out.println(totalPrice);

    }

    public static void add(String name, int price){
        if (contains(name)) {
          return;
        }
        items = items + "\n" + name + " - " + price;
        totalPrice = totalPrice + price;

    }

    public static void clear(){
        items = "";
        totalPrice = 0;
    }

    public static int getTotalPrice(){
        return totalPrice;
    }

    public static boolean contains(String name){
        return items.contains(name);
    }

    public static void print(String title){
        System.out.println(title);
        if (items.isEmpty()){
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
        System.out.println("Общая цена корзины: "+ getTotalPrice());
    }
}
