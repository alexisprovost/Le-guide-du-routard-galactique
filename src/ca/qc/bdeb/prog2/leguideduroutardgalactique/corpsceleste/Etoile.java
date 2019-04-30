/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
public class Etoile extends CorpsCeleste {


    private ArrayList<CorpsCeleste> planetesLier = new ArrayList<CorpsCeleste>();
    private int phase;
    private double masse;

    public Etoile(String nom, double rayon, ArrayList<CorpsCeleste> planetesLier, int phase, double masse) {
        super(nom, rayon);
        this.planetesLier = planetesLier;
        this.phase = phase;
        this.masse = masse;
    }

    @Override
    public void affichageObjetLier() {
        System.out.println("\nL'etoile " + nom + " a comme planete(s) liee(s):");
        if (planetesLier.isEmpty() == false) {
            for (int i = 0; i < planetesLier.size(); i++) {
                System.out.println(planetesLier.get(i).getNom());
                System.out.println("\n");
            }
        } else {
            System.out.println("Il n'y a pas de planete(s) liee(s).");
        }
    }

    @Override
    public void affichage() {
        System.out.println("ID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Phase: " + phase + "\n"
                + "Masse: " + masse + "\n");
    }
}
