//test class
package src.com.mypetproject;

public class Main{

    public static void main(String[] args){
        
        Pet newAnimal = new Pet("cat");

        newAnimal.getSpecies();
        
        Cat newCat = new Cat(7, "orange", "cat");
        newCat.meow();
    }

}