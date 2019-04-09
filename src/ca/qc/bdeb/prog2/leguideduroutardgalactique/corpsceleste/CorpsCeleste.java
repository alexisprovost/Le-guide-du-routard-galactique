/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste;

import java.util.ArrayList;

/**
 *
 * @author 1850986
 */
public abstract class CorpsCeleste {

    protected String nom;
    protected int id;
    protected double rayon;

    public CorpsCeleste(int id, String nom, double rayon) {
        this.id = id;
        this.nom = nom;
        this.rayon = rayon;
    }
}
