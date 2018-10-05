
package exercise.replacearray;
//import java.util.Arrays;

public class Replace {
    private String stringToChange;
    private char oldCharacter;
    private char newCharacter;
    
    
    public Replace(String stringToChange,char oldCharacter, char newCharacter){
        this.stringToChange=stringToChange;
        changeACharacter(oldCharacter, newCharacter);
    }
    
    public Replace(String stringToChange,char oldCharacter, char newCharacter,int replaceStartingWith){
        this.stringToChange=stringToChange;
        changeACharacter(oldCharacter, newCharacter,replaceStartingWith);
    }
    
    public Replace(String stringToChange,char oldCharacter, char newCharacter,int replaceStartingWith, int counter){
        this.stringToChange=stringToChange;
        changeACharacter(oldCharacter, newCharacter,replaceStartingWith,counter);
    }
    
    
    
    public String getString(){
    return this.stringToChange;
    }
    
    
public String changeACharacter(char oldCharacter, char newCharacter){
        System.out.println(this.stringToChange);
        char[] characterToArray=stringToChange.toCharArray();
        
                for (int i=0; i<characterToArray.length;i++){
                if (characterToArray[i]==oldCharacter) characterToArray[i]=newCharacter;
                }
                
                this.stringToChange=String.valueOf(characterToArray);//Arrays.toString(characterToArray);
                return this.stringToChange;
}

public String changeACharacter(char oldCharacter, char newCharacter, int replaceStartingWith){
        System.out.println(this.stringToChange);
        
        char[] characterToArray=stringToChange.toCharArray();
        int iterator=0;
        
                for (int i=0; i<characterToArray.length;i++){
                  if (characterToArray[i]==oldCharacter) iterator++;  
                if (characterToArray[i]==oldCharacter && iterator>=replaceStartingWith) characterToArray[i]=newCharacter;
                }
                
                this.stringToChange=String.valueOf(characterToArray);//Arrays.toString(characterToArray);
                return this.stringToChange;
}

public String changeACharacter(char oldCharacter, char newCharacter, int replaceStartingWith,int howManyTimes){
        System.out.println(this.stringToChange);
        
        char[] characterToArray=stringToChange.toCharArray();
        int iterator=0;
        
                for (int i=0; i<characterToArray.length;i++){
                  if (characterToArray[i]==oldCharacter) iterator++;  
                  
                if (characterToArray[i]==oldCharacter && iterator>=replaceStartingWith && howManyTimes>0) 
                {characterToArray[i]=newCharacter; howManyTimes--;}
                }
                
                this.stringToChange=String.valueOf(characterToArray);//Arrays.toString(characterToArray);
                return this.stringToChange;
}


}
