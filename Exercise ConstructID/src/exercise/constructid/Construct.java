
package exercise.constructid;

import sun.reflect.annotation.AnnotationParser;


public class Construct {
   
    private String userName;
    private String userAddress;
    
    public Construct(String userName, String userAddress){
    this.userAddress=userAddress;
    this.userName=userName;
    getInitials(userName, userAddress);
    }
    
    public void getInitials(String userName, String userAddress){
    String nameInitials="";
    String addressInitials="";
    char[] userNameArray=userName.toCharArray();
    char[] userAddressArray=userAddress.toCharArray();
    
    for (int i=0;i< userNameArray.length;i++){
    if(Character.isUpperCase(userNameArray[i])) nameInitials+=userNameArray[i];
    } 
    
    for (int i=0;i< userAddressArray.length;i++){
    if(Character.isDigit(userAddressArray[i])) addressInitials+=userAddressArray[i];
    } 
    
    System.out.println(nameInitials+addressInitials);
    }
}
