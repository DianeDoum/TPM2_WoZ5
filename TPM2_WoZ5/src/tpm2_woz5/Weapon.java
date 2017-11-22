/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpm2_woz5;

/**
 *
 * @author Albenss
 */
public class Weapon {

    private String nom;
    private int degat;

    public Weapon(String nom, int degat) {
        this.nom = nom;
        this.degat = degat;
    }

    public String getNom() {
        return nom;
    }

    public int getDegat() {
        return degat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }

}
