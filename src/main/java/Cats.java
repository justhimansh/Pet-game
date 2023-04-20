/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Cats extends Species{
    
    private boolean hasClaws;

    //cat constructor

    public Cats(boolean hasClaws, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
        this.hasClaws = hasClaws;
    }
    
    /**
     * @return the hasClaws
     */
    public boolean isHasClaws() {
        return hasClaws;
    }

    /**
     * @param hasClaws the hasClaws to set
     */
    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    } 
}
