
package exercise.billing;

final public class ComputeBill {
    float priceOfAPhotobook;
    int quantityOrdered;
    int couponValue;
    float totalDue;

    public ComputeBill(float priceOfAPhotobook) {
        
        totalDue(priceOfAPhotobook);
    }

    public ComputeBill(float priceOfAPhotobook, int quantityOrdered) {
        totalDue(priceOfAPhotobook, quantityOrdered);
    }

    public ComputeBill(float priceOfAPhotobook, int quantityOrdered, int couponValue) {
        totalDue(priceOfAPhotobook, quantityOrdered, couponValue);
    }
    
    public void totalDue(float priceOfAPhotobook){
        System.out.println("Total due is "+(priceOfAPhotobook+(priceOfAPhotobook*0.8)));
    }
    
    public void totalDue(float priceOfAPhotobook, int quantityOrdered){
        System.out.println("Total due is "+((priceOfAPhotobook*quantityOrdered)+(priceOfAPhotobook*quantityOrdered)*0.8));
        
    }
    
    public void totalDue(float priceOfAPhotobook,float quantityOrdered,int couponValue){
        System.out.println("Total due is "+(((priceOfAPhotobook*quantityOrdered)-couponValue)+(priceOfAPhotobook*quantityOrdered)*0.8));
        
    }
    
    
}
