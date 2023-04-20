/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Fish extends Species{
    
    private String waterType;

    //fish constructor

    public Fish(String waterType, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
        this.waterType = waterType;
    }
    

    /**
     * @return the waterType
     */
    public String getWaterType() {
        return waterType;
    }

    /**
     * @param waterType the waterType to set
     */
    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }
 
}
