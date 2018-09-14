
package exercise.two.characters;

import java.util.Scanner;
public class ExerciseTwoCharacters {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        MyCharacter firstCharacter=new MyCharacter();
        MyCharacter secondCharacter=new MyCharacter(1, 2, 3);
        Boolean truth=true; 
        
        System.out.println("Choose the first characters Gender (1-Female, 2-Male):");
        int gender=scan.nextInt();
        while (truth){
        if(gender>0 && gender<3) {firstCharacter.setCharacterGender(gender); truth=false; break;} 
                else System.out.println("You entered a wrong number, Please choose the first characters race "
                        + "(1-Human, 2-dwarf, 3-elf, 4-Orc):");
                     gender=scan.nextInt(); }
        
       System.out.println("Choose the first characters race (1-Human, 2-Dwarf, 3-Elf, 4-Orc):");
       int race=scan.nextInt();
       
       truth=true; 

        while(truth){
            if (race>0 && race<5) {firstCharacter.setCharacterRace(race); truth=false; break;} 
                else System.out.println("You entered a wrong number, Please choose the first characters race "
                        + "(1-Human, 2-dwarf, 3-elf, 4-Orc):");
                     race=scan.nextInt(); }
        
        System.out.println("Choose the first characters Class (1-Warrior, 2-Thief, 3-Priest, 4-Mage):");
        int characterClass=scan.nextInt();
        
        truth=true; 
        
        while (truth){
        if(characterClass>0 && characterClass<5) {firstCharacter.setCharacterClass(characterClass); truth=false; break;} 
                else System.out.println("You entered a wrong number, Please choose the first characters race "
                        + "(1-Human, 2-dwarf, 3-elf, 4-Orc):");
                     characterClass=scan.nextInt(); }

      firstCharacter.displayCharacterAttributes();
        System.out.println("\nSecond character data:");
      secondCharacter.displayCharacterAttributes();
      
        
    }
    
}
