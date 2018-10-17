
package exercise.demo.poems;


public class Poem {

private String nameOfThePoem;
private int numberOfLines;

    public Poem(String nameOfThePoem, int numberOfLines) {
        this.nameOfThePoem = nameOfThePoem;
        this.numberOfLines = numberOfLines;
    }

    public String getNameOfThePoem() {
        return nameOfThePoem;
    }

    public int getNumberOfLines() {
        return numberOfLines;
    }

    @Override
    public String toString() {
        return "Poem{" + "nameOfThePoem=" + nameOfThePoem + ", numberOfLines=" + numberOfLines + '}';
    }


    
}
