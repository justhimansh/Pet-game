
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Project1 {

    public static void main(String[] args) {
        Pets dog = new Dogs(5, "Husky", "Dog", "Rare", "Woof", "Carnivore", "Max", 2, 100, 100, "Energetic");
        Pets cat = new Cats(true, "Tabby", "Cat", "Not rare", "Meow", "Carnivore", "Maxine", 1, 100, 100, "Lazy");
        Pets fish = new Fish("Fresh water", "Arowana", "Fish", "Rare", "Glubglubglub", "Omnivore", "Andy", 3, 100, 100, "Grumpy");
        Pets bird = new Birds(9, "Parrot", "Bird", "Not rare", "Chirp", "Herbivore", "Lucy", 6, 100, 100, "Playful");
        Pets horse = new Horses(3.8, "Mustang", "Horse", "Rare", "Neigh", "Herbivore", "Chad", 3, 100, 100, "Prideful");
        Pets insect = new Insects(false, false, "Cockroach", "Insect", "Not rare", "Hiss", "Omnivore", "Chris", 3, 100, 100, "Skittish");
        Scanner scan = new Scanner(System.in);
        int userInput = 0;    
        
        
        System.out.println("What is your username?");
        String userName = scan.nextLine();
        
        System.out.println("\nWhich pet would you like?\nThere are currently: \n" 
                + "1) " + dog.printInfo() 
                + "2) " + cat.printInfo() 
                + "3) " + fish.printInfo() 
                + "4) " + bird.printInfo() 
                + "5) " + horse.printInfo() 
                + "6) " + insect.printInfo());
        
        userInput = scan.nextInt();
        Pets preferredPet = null;
        switch (userInput){
            case 1:
                preferredPet = dog;
                break;
            case 2:
                preferredPet = cat;
                break;
            case 3:
                preferredPet = fish;
                break;
            case 4:
                preferredPet = bird;
                break;
            case 5:
                preferredPet = horse;
                break;
            case 6:
                preferredPet = insect;
                break;
        }
        
        Users user = new Users(userName, preferredPet);   
    }
    
    public void createUser(){
        
    }
    
}
