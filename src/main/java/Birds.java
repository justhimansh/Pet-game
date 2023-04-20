/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Birds extends Species{
    
    private int flyingSpeed;

    //bird constructor

    public Birds(int flyingSpeed, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
        this.flyingSpeed = flyingSpeed;
    }
    

    /**
     * @return the flyingSpeed
     */
    public int getFlyingSpeed() {
        return flyingSpeed;
    }

    /**
     * @param flyingSpeed the flyingSpeed to set
     */
    public void setFlyingSpeed(int flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }  
}
