
package exercise.items.and.pets;


public class ItemSold {
private int invoiceNumber;
private String description;
private double price;

    public ItemSold(int invoiceNumber, String description, double price) {
        this.invoiceNumber = invoiceNumber;
        this.description = description;
        this.price = price;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ItemSold{" + "invoiceNumber=" + invoiceNumber + ", description=" + description + ", price=" + price + "} ";
    }
    
    

}
