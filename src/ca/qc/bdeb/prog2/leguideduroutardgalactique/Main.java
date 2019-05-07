/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique;

import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.CorpsCeleste;
import java.util.ArrayList;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<CorpsCeleste> encyclopedie = new ArrayList<>();
        Fichier fichier = new Fichier(encyclopedie);
        Menu menu = new Menu(encyclopedie,fichier);
        
        menu.showMenu();
    }
}

/*

To do:
    point ou virgule dans gestion double

    entré de planetes lier -> Quel(s) planete(s) sont liee(s)?

Voulez-vous voir une autre liste? (O/N) ou 0  -> crash
 */
