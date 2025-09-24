package src.com.mypetproject;

public class Pet{
    //attribte fields:
    public String species;

    //constructor method:
    public Pet(String species){
        this.species = species;

    }

    //behavior
    public void getSpecies(){
        System.out.println("This pet is a: " + species);
    }

}