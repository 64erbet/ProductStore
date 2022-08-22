import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WareHouse {
    public List<Product> productList = new ArrayList<>();

    public void addProductsToList() {
        productList.add(new Product('A', 1.25, 3, 3.00));
        productList.add(new Product('B', 4.25, null, null));
        productList.add(new Product('C', 1.00, 6, 5.00));
        productList.add(new Product('D', 0.75, null, null));
    }
    public Double calculateTotalCost(String purchasedGoodsList) {
        addProductsToList();
        Map<Character, Integer> goodsMap = new HashMap<>();
        char[] purchasedGoodsListChar = purchasedGoodsList.toCharArray();

        for (char simbolChar : purchasedGoodsListChar) {
            boolean alreadyExist = false;
//            System.out.println("*** simbolChar from переданной строки покупок = " + Character.toUpperCase(simbolChar));
            if (!itsAProduct(simbolChar)) {
//                System.out.println(simbolChar + " - это не товар !!!!");
                continue;
            }
            if (goodsMap.size() == 0) {
                goodsMap.put(Character.toUpperCase(simbolChar), 1);
//                System.out.println("Записали в goodsMap родукт " + Character.toUpperCase(simbolChar) + " в первый раз");
//                System.out.println("goodsMap = " + goodsMap);
            } else {
                for (Character goodFromGoodsMap : goodsMap.keySet()) {
//                    System.out.println("goodFromGoodsMap из goodsMap.keySet = " + goodFromGoodsMap);
                    if (Character.toUpperCase(simbolChar) == Character.toUpperCase(goodFromGoodsMap)) {
                        alreadyExist = true;
                        goodsMap.put(Character.toUpperCase(goodFromGoodsMap), goodsMap.get(goodFromGoodsMap)+1);
//                        System.out.println("*** Увеличили колличество продукта " + Character.toUpperCase(simbolChar) + " на единицу");
                    }
                }
                if (!alreadyExist) {
                    goodsMap.put(Character.toUpperCase(simbolChar), 1);
//                    System.out.println("Записали в goodsMap родукт " + Character.toUpperCase(simbolChar) + " в первый раз");
                }
            }
        }
//        System.out.println("goodsMap = " + goodsMap);
        return (cost(goodsMap));
    }
    public boolean itsAProduct(Character simbolChar) {
        boolean itsAProduct = false;
        for (Product product : productList) {
            if (Character.toUpperCase(simbolChar) == Character.toUpperCase(product.getName())) {
                itsAProduct = true;
            }
        }
        if (!itsAProduct) {
//            System.out.println(simbolChar + " - это НЕ ПРОДУКТ нашего магазина");
        }
        return (itsAProduct);
    }

    private Double cost(Map<Character, Integer> goodsMap) {
        Double totalCost = 0.00;
        for (Map.Entry<Character, Integer> entry : goodsMap.entrySet()) {
            for (Product product : productList) {
                if (Character.toUpperCase(entry.getKey()) == Character.toUpperCase(product.getName())) {
                    //*************** Акционные ценники (со скидкой) ********************
                    if (product.getPromotionalQuantity() != null &&
                        entry.getValue() >= product.getPromotionalQuantity()) {
//                        entry.getValue() % product.getPromotionalQuantity() == 0 {
                        totalCost += entry.getValue() / product.getPromotionalQuantity()
                                * product.getPromotionalPrice();
                        totalCost += entry.getValue() % product.getPromotionalQuantity() * product.getPiecePrice();
                    }
                    //*******************************************************************
                    else {
                        totalCost += entry.getValue() * product.getPiecePrice();
                    }
                }
            }
        }
        return (totalCost);
    }
}
