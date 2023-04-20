/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Species extends Pets{
    
    private String speciesBreed;
    private String speciesName;
    private String speciesRarity;
    private String speciesSound;
    private String foodGroup;

    //
    public Species(String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        super(petName, age, energy, food, trait);
        this.speciesBreed = speciesBreed;
        this.speciesName = speciesName;
        this.speciesRarity = speciesRarity;
        this.speciesSound = speciesSound;
        this.foodGroup = foodGroup;
    }    


    /**
     * @return the speciesBreed
     */
    public String getSpeciesBreed() {
        return speciesBreed;
    }

    /**
     * @param speciesBreed the speciesBreed to set
     */
    public void setSpeciesBreed(String speciesBreed) {
        this.speciesBreed = speciesBreed;
    }

    /**
     * @return the speciesName
     */
    public String getSpeciesName() {
        return speciesName;
    }

    /**
     * @param speciesName the speciesName to set
     */
    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    /**
     * @return the speciesRarity
     */
    public String getSpeciesRarity() {
        return speciesRarity;
    }

    /**
     * @param speciesRarity the speciesRarity to set
     */
    public void setSpeciesRarity(String speciesRarity) {
        this.speciesRarity = speciesRarity;
    }

    /**
     * @return the speciesSound
     */
    public String getSpeciesSound() {
        return speciesSound;
    }

    /**
     * @param speciesSound the speciesSound to set
     */
    public void setSpeciesSound(String speciesSound) {
        this.speciesSound = speciesSound;
    }

    /**
     * @return the foodGroup
     */
    public String getFoodGroup() {
        return foodGroup;
    }

    /**
     * @param foodGroup the foodGroup to set
     */
    public void setFoodGroup(String foodGroup) {
        this.foodGroup = foodGroup;
    }
    
    @Override
    public String printInfo(){
        String output = " ";
        
        output = "Name: " + this.getPetName() + ", "
                + "Age: " + this.getAge() + ", "
                + "Animal: " + this.getSpeciesName() + ", "
                + "Breed: " + this.getSpeciesBreed() + "\n";
        
        return output;
    }
  
}
