/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Dogs extends Species{
 
    private int senseOfSmell;

    public Dogs(int senseOfSmell, String speciesBreed, String speciesName, String speciesRarity, String speciesSound, String foodGroup, String petName, int age, int energy, int food, String trait) {
        super(speciesBreed, speciesName, speciesRarity, speciesSound, foodGroup, petName, age, energy, food, trait);
        this.senseOfSmell = senseOfSmell;
    }

    /**
     * @return the senseOfSmell
     */
    public int getSenseOfSmell() {
        return senseOfSmell;
    }

    /**
     * @param senseOfSmell the senseOfSmell to set
     */
    public void setSenseOfSmell(int senseOfSmell) {
        this.senseOfSmell = senseOfSmell;
    }
 
}
