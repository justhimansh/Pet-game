/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Insects extends Species{
    
    private boolean isVenomous;
    private boolean canFly;

    //insect constructor

    public Insects(boolean isVenomous, boolean canFly, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
        this.isVenomous = isVenomous;
        this.canFly = canFly;
    }

    /**
     * @return the isVenomous
     */
    public boolean isIsVenomous() {
        return isVenomous;
    }

    /**
     * @param isVenomous the isVenomous to set
     */
    public void setIsVenomous(boolean isVenomous) {
        this.isVenomous = isVenomous;
    }

    /**
     * @return the canFly
     */
    public boolean isCanFly() {
        return canFly;
    }

    /**
     * @param canFly the canFly to set
     */
    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }   
}
