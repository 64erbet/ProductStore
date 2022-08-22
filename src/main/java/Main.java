import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WareHouse wareHouse = new WareHouse();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите список продуктов");
        String productList = scanner.nextLine();
        System.out.println("Цена (с учетом скидок) наших покупок (ели такие есть в нашем магазине) = "
                    + wareHouse.calculateTotalCost(productList));
    }
}
