
package exercise.motto;


public class Bread {
    public final static String MOTTO="The staff of life";
    private String breadType;
    private int caloriesPerSlice; 

    public Bread(String breadType, int caloriesPerSlice) {
        this.breadType = breadType;
        this.caloriesPerSlice = caloriesPerSlice;
    }

    public String getBreadType() {
        return breadType;
    }

    public int getCaloriesPerSlice() {
        return caloriesPerSlice;
    }

    public static String getMOTTO() {
        return MOTTO;
    }
    
    
}

