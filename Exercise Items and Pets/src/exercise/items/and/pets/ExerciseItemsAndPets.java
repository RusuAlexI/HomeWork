
package exercise.items.and.pets;


public class ExerciseItemsAndPets {


    public static void main(String[] args) {
        ItemSold firstItemSold=new ItemSold(45, "This is the first item sold", 45.8);
        ItemSold secondItemSold=new PetSold(true, true, true, 58, "This is the second item sold", 89.2);
        PetSold firstPetSold=new PetSold(true, false, false, 25, "first pet sold", 0);
        
        System.out.println(firstItemSold.toString());
        System.out.println(secondItemSold.toString());
        System.out.println(firstPetSold.toString());
        
    }
    
}
