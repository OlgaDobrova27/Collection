package Product;

import java.util.HashSet;
import java.util.Set;

public class ProductList {
    public static Set<Product> productList = new HashSet<>();

    public static void printListOfProduct() {
        System.out.println("*** Список продуктов: ");

        for (Product product : productList) {
            System.out.println(product.getName() + " - " + product.getPrice() + "руб.");
        }
    }

    protected static void addProductToList(Product newProduct) {
        if (!productList.add(newProduct)) {
            throw new RuntimeException("Такой продукт уже есть в списке");
        }
    }

    public static boolean removeProductOnList(String nameToRemove) {
           if (productList.remove(nameToRemove)) {
                System.out.println("удален из множества!");
                return true;
            }

        System.out.println("Продукт" + nameToRemove + "не найден из множества!");
        return false;
    }

    public static boolean checkProductInList(String nameToCheck) {
        for (Product product : productList) {
            if (product.getName().equals(nameToCheck)) {
                System.out.println(nameToCheck + "уже куплен");
                return true;
            }
        }
        return false;
    }
}
