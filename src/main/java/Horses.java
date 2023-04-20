/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Horses extends Species{
    
    private double jumpHeight;

    //horse constructor

    public Horses(double jumpHeight, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
        this.jumpHeight = jumpHeight;
    }
    

    /**
     * @return the jumpHeight
     */
    public double getJumpHeight() {
        return jumpHeight;
    }

    /**
     * @param jumpHeight the jumpHeight to set
     */
    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}
