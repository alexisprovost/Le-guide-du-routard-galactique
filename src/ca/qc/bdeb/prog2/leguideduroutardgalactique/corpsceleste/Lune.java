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
public class Lune extends CorpsCeleste {

    public Lune(String nom, double rayon) {
        super(nom, rayon);
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public void affichage() {
        System.out.println("\nID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon);
    }
}
