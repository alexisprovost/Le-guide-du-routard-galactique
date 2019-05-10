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
public class PlaneteGazeuse extends CorpsCeleste {

    private boolean atmosphereCompatible, presenceVie, anneau;

    /**
     * COnstructeur Planete gazeuse
     * @param nom nom Planete gazeuse
     * @param rayon rayon Planete gazeuse
     * @param atmosphereCompatible atmosphereCompatible Planete gazeuse
     * @param presenceVie presenceVie Planete gazeuse
     * @param anneau anneau Planete gazeuse
     */
    public PlaneteGazeuse(String nom, double rayon, boolean atmosphereCompatible, boolean presenceVie, boolean anneau) {
        super(nom, rayon);
        this.atmosphereCompatible = atmosphereCompatible;
        this.presenceVie = presenceVie;
        this.anneau = anneau;
    }

    /**
     * Setter Presence vie
     * @param presenceVie presenceVie 
     */
    public void setPresenceVie(boolean presenceVie) {
        this.presenceVie = presenceVie;
    }

    /**
     * Setter  atmosphereCompatible 
     * @param atmosphereCompatible  atmosphereCompatible 
     */
    public void setAtmosphereCompatible(boolean atmosphereCompatible) {
        this.atmosphereCompatible = atmosphereCompatible;
    }

    /**
     * Setter anneau
     * @param anneau anneau
     */
    public void setAnneau(boolean anneau) {
        this.anneau = anneau;
    }
    
    /**
     * To string
     * @return affichage planete gazeuse
     */
    @Override
    public String toString() {
        return "\nID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Presence de vie: " + presenceVie + "\n"
                + "Atmosphere compatible: " + atmosphereCompatible + "\n"
                + "Presence d'anneau(x):" + anneau + "\n";
    }
}
