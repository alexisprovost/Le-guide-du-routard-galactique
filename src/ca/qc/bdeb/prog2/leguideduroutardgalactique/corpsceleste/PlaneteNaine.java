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
public class PlaneteNaine extends CorpsCeleste implements Serializable {

    private String type;

    public PlaneteNaine(int id, String nom, double rayon, String type) {
        super(id, nom, rayon);
        this.type = type;
    }

    public void affichage() {
        System.out.println("ID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Type: " + type + "\n");
    }
}
