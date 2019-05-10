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
public class PlaneteNaine extends CorpsCeleste {

    private Sorte typeDeNaine;

    public enum Sorte {
        ASTEROIDE,
        EPARS,
        CUBEWANO,
        AUTRE
    }

    public PlaneteNaine(String nom, double rayon, Sorte typeDeNaine) {
        super(nom, rayon);
        this.typeDeNaine = typeDeNaine;
    }

    public void setTypeDeNaine(Sorte typeDeNaine) {
        this.typeDeNaine = typeDeNaine;
    }
    
    @Override
    public String toString() {
        return "\nID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Type de Naine: " + typeDeNaine + "\n";
    }
}
