/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste;

import java.io.Serializable;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
public abstract class CorpsCeleste implements Serializable {

    private static int idSequentiel = 1;

    protected String nom;
    protected int id;
    protected double rayon;

    public CorpsCeleste(String nom, double rayon) {
        this.id = idSequentiel++;
        this.nom = nom;
        this.rayon = rayon;
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon;
    }

    public void affichageObjetLier() {
    }
}
