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
public class Lune extends CorpsCeleste implements Serializable {

    private String planeteLier;

    public Lune(int id, String nom, double rayon, String planeteLier) {
        super(id, nom, rayon);
        this.planeteLier = planeteLier;
    }

    public void affichageLune() {
        System.out.println("ID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Planete lier: " + planeteLier);
    }
}
