/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpm2_woz5;

import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Player {
    public String pseudoPlayer;
    public ArrayList<Weapon> weaponPlayer;
    private int Power;

    public Player(String pseudo, ArrayList<Weapon> arme, int puissance) {
        this.pseudoPlayer = pseudo;
        this.weaponPlayer = arme;
        this.Power = force;
    }

    public String getPseudo() {
        return pseudoPlayer;
    }

    public void setPseudo(String pseudo) {
        this.pseudoPlayer = pseudo;
    }

    public ArrayList<Weapon> getWeaponPlayer() {
        return weaponPlayer;
    }

    public void setWeaponPlayer(ArrayList<Weapon> weaponPlayer) {
        this.weaponPlayer = weaponPlayer;
    }

    public int getPower() {
        return Power;
    }

    public void setPower(int Power) {
        this.Power = Power;
    }
    

}
