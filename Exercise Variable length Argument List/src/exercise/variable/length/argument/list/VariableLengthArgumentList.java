
package exercise.variable.length.argument.list;


public class VariableLengthArgumentList {
    
    public VariableLengthArgumentList(){
    
    }
  
    public int calculateProduct(int...passedValue){
    int product=1;
    
    for(int i:passedValue){
    product*=i;
    }
    return product;
    }
}
