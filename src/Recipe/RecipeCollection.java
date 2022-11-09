package Recipe;

import Product.Product;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RecipeCollection {
    public static Set<Recipe> recipes = new HashSet<>();
    private static boolean getName;


    public static void addRecipe(Recipe recipe) {
        for (var recipeInCollection : recipes) {
            if (recipeInCollection.getNameOfRecipe().equals(recipe.getNameOfRecipe())) {
                throw new RuntimeException("Такой рецепт");
            }
        }
        recipes.add(recipe);
    }

    public static void printAllRecipes() {
        System.out.println("***Книга рецептов");
        for (Recipe recipe : recipes) {
            System.out.println(recipe.getNameOfRecipe() + ": ");
            for (Product product : recipe.getProduct()) {

                System.out.print(getName +" - " + product.getWeight() + "кг,");
                System.out.println("Общая стоимость продуктов" + recipe.getTotalCostRecipe() + "руб");
            }
        }
    }
}