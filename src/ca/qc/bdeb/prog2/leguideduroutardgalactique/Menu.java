/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique;

import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.CorpsCeleste;
import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.PlaneteTellurique;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
// jaaaiimme
// Jaime ta grand-mere
public class Menu {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<CorpsCeleste> encyclopedie = new ArrayList();

    public Menu(ArrayList<CorpsCeleste> encyclopedie) {
        this.encyclopedie = encyclopedie;
    }

    public void showMenu() {
        Fichier fichier = new Fichier(encyclopedie);
        fichier.ouvertureProgramme();
        while (true) {
            System.out.println("\nBienvenu dans le Guide du Routard Galactique\n"
                    + "\t1- Consulter l'encyclopedie\n"
                    + "\t2- Creer un nouveau corps celeste\n"
                    + "\t3- Modifier un corps celeste\n"
                    + "\t4- Statistiques\n"
                    + "\t5- Quiter");
            String reponse = sc.nextLine();
            switch (reponse) {
                case "1":
                    consulterEncyclopedie(encyclopedie);
                    break;
                case "2":
                    nouveauCorpsCeleste();
                    break;
                case "3":
                    modifierCorpsCeleste();
                    break;
                case "4":
                    statistique();
                    break;
                case "5":
                    quitter();
                    break;
                default:
                    System.out.println("L'entrer que vous avez faite ne correspond pas au choix propose");
            }
        }
    }

    public void consulterEncyclopedie(ArrayList<CorpsCeleste> encyclopedie) {
        for (int i = 1; i < encyclopedie.size(); i++) {
            CorpsCeleste valeur = encyclopedie.get(i);
            int position = i;
            while (position > 0 && encyclopedie.get(position - 1).getNom().compareTo(valeur.getNom()) > 0) {
                encyclopedie.set(position, encyclopedie.get(position - 1));
                position--;
            }
            encyclopedie.set(position, valeur);
        }
        for (int i = 0; i < encyclopedie.size(); i++) {
            encyclopedie.get(i).affichage();
            System.out.println("\n");
        }
        Stack<CorpsCeleste> stack = new Stack();
        for (int i = 0; i < encyclopedie.size(); i++) {
            stack.push(encyclopedie.get(i));
        }
        for (int i = 0; i < encyclopedie.size(); i++) {
            stack.pop().affichage();
            System.out.println("\n");
        }
        for (int i = 0; i < encyclopedie.size(); i++) {
            if (encyclopedie.get(i) instanceof PlaneteTellurique) {
                encyclopedie.get(i).affichage();
                System.out.println("\n");
            }
        }
    }

    public void nouveauCorpsCeleste() {
        System.out.println("\nBienvenue dans la partie d'ajout de Corps Celeste\n"
                + "Veillez indiquer quel type de corps celeste voulez-vous rajouter?\n"
                + "(1) Etoile\n"
                + "(2) Lune\n"
                + "(3) Planete Gazeuse\n"
                + "(4) Planete Naine\n"
                + "(5) Planete Tellurique");
        String reponse = sc.nextLine();
        switch (reponse) {
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
            default:
        }
    }

    public void nouvelleEtoile() {
        System.out.println("Quel est son nom?");
    }

    public void modifierCorpsCeleste() {
    }

    public void statistique() {
    }

    public void quitter() {
        System.out.println("\nVoulez-vous vraiment quitter cette environement de plaisir? Oui ou Non");
        String reponse = sc.nextLine();
        switch (reponse.toLowerCase()) {
            case "oui":
                System.exit(0);
        }
    }
}
