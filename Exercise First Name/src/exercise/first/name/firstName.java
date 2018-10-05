
package exercise.first.name;


public class firstName {
    private String[] names=new String[3];
    
    public firstName(String first, String second, String third){
    this.names[0]=first;
    this.names[1]=second;
    this.names[2]=third;  
    giveCombinations();
    }
    
    public void giveCombinations(){
        System.out.println(this.names[0]+" and "+this.names[1]);
        System.out.println(this.names[0]+" and "+this.names[2]);
        System.out.println(this.names[1]+" and "+this.names[0]);
        System.out.println(this.names[1]+" and "+this.names[2]);
        System.out.println(this.names[2]+" and "+this.names[0]);
        System.out.println(this.names[2]+" and "+this.names[1]);
    }
}
