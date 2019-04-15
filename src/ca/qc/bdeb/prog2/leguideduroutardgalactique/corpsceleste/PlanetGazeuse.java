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
public class PlanetGazeuse extends CorpsCeleste implements Serializable {

    private boolean atmosphereCompatible, presenceVie, anneau;

    public PlanetGazeuse(int id, String nom, double rayon, boolean atmosphereCompatible, boolean presenceVie, boolean anneau) {
        super(id, nom, rayon);
        this.atmosphereCompatible = atmosphereCompatible;
        this.presenceVie = presenceVie;
        this.anneau = anneau;
    }

    public void affichageGazeuse() {
        System.out.println("ID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Presence de vie: " + presenceVie + "\n"
                + "Atmosphere compatible: " + atmosphereCompatible + "\n"
                + "Presence d'anneau(x):" + anneau + "\n");
    }
}
