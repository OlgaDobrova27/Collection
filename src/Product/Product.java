package Product;

import java.util.Objects;

import static Product.ProductList.addProductToList;

public class Product {
    private final String name;
    private final int price;
    private final int count;

    public Product(String name, int price, int count) {
        this.count = count;
        if (name != null && !name.isBlank() && !name.isEmpty() && price > 0) {
            this.name = name;
            this.price = price;
            addProductToList(this);
        } else {
            throw new RuntimeException("Заполните карточку товара" + name + "корректно!");
        }
    }

    public String toString() {
        return name +
                "(цена" + price + "руб";
    }

    public boolean equals(Object o) {
        if (this == o) return true;

        Product products = (Product) o;
        return price == products.price && Objects.equals(name, products.name);
    }

    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public Object getWeight() {
        return null;
    }
}
