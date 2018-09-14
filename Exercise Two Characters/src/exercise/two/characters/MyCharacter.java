
package exercise.two.characters;

final public class MyCharacter {
    private String characterGender;
    private String characterRace;
    private String characterClass;
    private int characterLevel;
    private int characterHealthPoints;
    private int characterMagicPoints;
    private int characterAttackPower;
    private int characterDefence;
    private int characterAgility;

    public MyCharacter(int characterGender, int characterRace, int characterClass) {
        setCharacterGender(characterGender);
        setCharacterRace(characterRace);
        setCharacterClass(characterClass);
    }

    
    
    public MyCharacter() {
        
    }

    public String getCharacterGender() {
        return characterGender;
    }

    public void setCharacterGender(int characterGender) {
        switch(characterGender){
                case 1: this.characterGender="Female"; break;
                case 2: this.characterGender="Male"; break; } 
    }

    public String getCharacterRace() {
        return characterRace;
    }

    public void setCharacterRace(int characterRace) {
        switch(characterRace){
                case 1: this.characterRace="Human"; break;
                case 2: this.characterRace="Dwarf"; break; 
                case 3: this.characterRace="Elf"; break; 
                case 4: this.characterRace="Orc"; break; } 
        
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(int characterClass) {
        switch(characterClass){
                case 1: this.characterClass="Warrior"; break;
                case 2: this.characterClass="Thief"; break; 
                case 3: this.characterClass="Priest"; break; 
                case 4: this.characterClass="Mage"; break; } 
    }

    public void displayCharacterAttributes(){
        switch (this.characterClass) {
            case "Warrior": 
                this.characterLevel=1;
                this.characterHealthPoints=12;
                this.characterMagicPoints=8;
                this.characterAttackPower=14;
                this.characterDefence=8;
                this.characterAgility=5;
                break;
            case "Thief":
                this.characterLevel=1;
                this.characterHealthPoints=12;
                this.characterMagicPoints=8;
                this.characterAttackPower=12;
                this.characterDefence=4;
                this.characterAgility=4;
                break;
            case "Priest":
                this.characterLevel=1;
                this.characterHealthPoints=14;
                this.characterMagicPoints=15;
                this.characterAttackPower=14;
                this.characterDefence=7;
                this.characterAgility=4;  
                break;
            case "Mage":
                this.characterLevel=1;
                this.characterHealthPoints=9;
                this.characterMagicPoints=14;
                this.characterAttackPower=4;
                this.characterDefence=4;
                this.characterAgility=4;
                break;
            default:
                break;
        }
        
        System.out.println("The characters attributes are:\n"
                + "Gender:"+characterGender+"\n"
                + "Race:"+characterRace+"\n"
                + "Class:"+characterClass+"\n"
                + "With the following beginner skill points:\n"
                +"Level: "+characterLevel+"\n"
                +"HP: "+characterHealthPoints+"\n"
                +"MP: "+characterMagicPoints+"\n"
                +"AP: "+characterAttackPower+"\n"
                +"Defence: "+characterDefence+"\n"
                +"Agility: "+characterAgility);
    
 

    }
}