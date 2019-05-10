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
public class PlaneteNaine extends CorpsCeleste {

    private Sorte typeDeNaine;

    public enum Sorte {
        ASTEROIDE,
        EPARS,
        CUBEWANO,
        AUTRE
    }

    /**
     * COnstructeur planete naine
     * @param nom nom planete naine
     * @param rayon rayon planete naine
     * @param typeDeNaine typeDeNaine planete naine 
     */
    public PlaneteNaine(String nom, double rayon, Sorte typeDeNaine) {
        super(nom, rayon);
        this.typeDeNaine = typeDeNaine;
    }

    /**
     * Setter typeDeNaine 
     * @param typeDeNaine typeDeNaine 
     */
    public void setTypeDeNaine(Sorte typeDeNaine) {
        this.typeDeNaine = typeDeNaine;
    }
    
    /**
     * To string    
     * @return Affichage planete naine
     */
    @Override
    public String toString() {
        return "\nID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Type de Naine: " + typeDeNaine + "\n";
    }
}
