package src.com.mypetproject;

public class Cat extends Pet{
    
    //attributes
    private int age;
    private String color;

    //constructor method
    public Cat(int age, String color, String species){
        super(species);
        this.color = color;
        this.age = age;
    }
    //behaviors
    public void meow(){
        System.out.println("mrow? the " + color + " " + species + " cried");
    }
}