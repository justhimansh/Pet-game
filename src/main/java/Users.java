/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sukhm
 */
public class Users {
    
    private String userName;
    private Pets prefferedPet;

    //user constructor
    public Users(String userName, Pets prefferedPet) {
        this.userName = userName;
        this.prefferedPet = prefferedPet;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the prefferedPet
     */
    public Pets getPrefferedPet() {
        return prefferedPet;
    }

    /**
     * @param prefferedPet the prefferedPet to set
     */
    public void setPrefferedPet(Pets prefferedPet) {
        this.prefferedPet = prefferedPet;
    }
  
}
