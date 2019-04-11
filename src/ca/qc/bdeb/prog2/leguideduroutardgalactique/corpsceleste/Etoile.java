/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
public class Etoile extends CorpsCeleste {

    private String planetLier;
    private int phase;
    private double masse;

    public Etoile(int id, String nom, double rayon, String planetLier, int phase, double masse) {
        super(id, nom, rayon);
        this.planetLier = planetLier;
        this.phase = phase;
        this.masse = masse;
    }
}
