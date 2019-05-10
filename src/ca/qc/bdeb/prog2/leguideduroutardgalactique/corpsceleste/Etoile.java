/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste;

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

    /**
     * COnstructeur etoile
     * @param nom nom etoile
     * @param rayon rayon etoile
     * @param planetesLier Planete lier etoile
     * @param phase phase etoile
     * @param masse masse etoile
     */
    public Etoile(String nom, double rayon, ArrayList<CorpsCeleste> planetesLier, int phase, double masse) {
        super(nom, rayon);
        this.planetesLier = planetesLier;
        this.phase = phase;
        this.masse = masse;
    }

    /**
     * Setter phase
     * @param phase phase
     */
    public void setPhase(int phase) {
        this.phase = phase;
    }

    /**
     * Setter Masse
     * @param masse masse
     */
    public void setMasse(double masse) {
        this.masse = masse;
    }

    /**
     * Setter Planetes lier
     * @param planetesLier planetes lier
     */
    public void setPlanetesLier(ArrayList<CorpsCeleste> planetesLier) {
        this.planetesLier = planetesLier;
    }

    /**
     * Nb de planete lier
     * @return Nb de planete lier
     */
    public int nombreDePlaneteLier() {
        int nbreDePlanete = 0;
        for (int i = 0; i < planetesLier.size(); i++) {
            nbreDePlanete++;
        }
        return nbreDePlanete;
    }

    /**
     * To string affichage
     * @return affichage etoile
     */
    @Override
    public String toString() {
        return "\nID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Phase: " + phase + "\n"
                + "Masse: " + masse + "\n"
                + "Planete(s) lier(s): " + planetesLier;

    }
}
