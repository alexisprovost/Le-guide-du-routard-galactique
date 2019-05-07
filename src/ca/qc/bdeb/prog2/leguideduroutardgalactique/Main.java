package ca.qc.bdeb.prog2.leguideduroutardgalactique;

import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.CorpsCeleste;
import java.util.ArrayList;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 */
public class Main {

    /**
     * TP2 - Le guide du routard galactique
     * @param args Java Args
     */
    public static void main(String[] args) {
        ArrayList<CorpsCeleste> encyclopedie = new ArrayList<>();
        Fichier fichier = new Fichier();
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
