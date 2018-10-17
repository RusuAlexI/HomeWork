
package exercise.horse;


public class Horse {
    private String name;
    private String color;
    private int birthYear;

    public Horse(String name, String color, int birthYear) {
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return "Horse{" + " name=" + name + ", color=" + color + ", birthYear=" + birthYear  + '}';
    }
    
    
    
}
