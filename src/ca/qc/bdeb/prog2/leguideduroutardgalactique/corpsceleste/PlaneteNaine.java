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
public class PlaneteNaine extends CorpsCeleste {

    private String type;

    public PlaneteNaine(int id, String nom, double rayon, String type) {
        super(id, nom, rayon);
        this.type = type;
    }
}
