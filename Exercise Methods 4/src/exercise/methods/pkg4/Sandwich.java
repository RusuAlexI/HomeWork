
package exercise.methods.pkg4;



public class Sandwich {
    
    private String ingredient = "";
    private String breadType = "";
    private double price = 0;
    
    public static int k = 4;
    
    public Sandwich() {
        this("ingredients","bread type",0);
    }

    public Sandwich(String ingredient, String breadType, double price) {
        this.ingredient = ingredient;
        this.breadType = breadType;
        this.price = price;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public static void burnBread(){
        System.out.println("AAaaaaaa!");           
    }
    
}
