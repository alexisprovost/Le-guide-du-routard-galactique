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

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public void setMasse(double masse) {
        this.masse = masse;
    }

    public void setPlanetesLier(ArrayList<CorpsCeleste> planetesLier) {
        this.planetesLier = planetesLier;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Phase: " + phase + "\n"
                + "Masse: " + masse + "\n";

    }
}
