package Recipe;

import Product.Product;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static Recipe.RecipeCollection.recipes;

public class Recipe {

    private final  String nameOfRecipe;
    private final Set<Product> products = new HashSet<Product>();
    private  int totalCostRecipe;


    public Recipe(String nameOfRecipe) {
        this.nameOfRecipe = nameOfRecipe;
        this.totalCostRecipe = 0;
        recipes.add(this);
    }

    public void addProductInRecipe(Product product, int requiredOuantity) {
        if (products.contains(product)) {
            throw new RuntimeException("Продукт уже добавлен в рецепт!");
        }
        products.add(product);
        // products.put(product, requiredOuantity);
        totalCostRecipe = totalCostRecipe + product.getPrice() * requiredOuantity;
    }

    @Override
    public String toString() { return nameOfRecipe;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return  false;
        Recipe recipes = (Recipe) o;
        return totalCostRecipe == recipes.totalCostRecipe && Objects.equals(nameOfRecipe, recipes.nameOfRecipe) && Objects.equals(products,recipes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfRecipe, products, totalCostRecipe);
    }

    public String getNameOfRecipe() { return nameOfRecipe; }

    public  Set<Product> getProduct() {
        return products;
    }
    public  int getTotalCostRecipe() { return  totalCostRecipe;}
    }

