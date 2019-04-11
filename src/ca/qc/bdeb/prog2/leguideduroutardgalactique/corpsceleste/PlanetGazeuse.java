/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste;

/**
 *
 * @author Lyssandre Chrzaszcz
 */
public class PlanetGazeuse extends CorpsCeleste {

    private boolean atmosphereCompatible, presenceVie, anneau;

    public PlanetGazeuse(int id, String nom, double rayon, boolean atmosphereCompatible, boolean presenceVie, boolean anneau) {
        super(id, nom, rayon);
        this.atmosphereCompatible = atmosphereCompatible;
        this.presenceVie = presenceVie;
        this.anneau = anneau;
    }
}
