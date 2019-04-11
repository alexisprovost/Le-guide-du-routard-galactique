/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique;

import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.CorpsCeleste;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
public class Menu {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<CorpsCeleste> guide = new ArrayList();

    public void showMenu() {
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
                    consulterEncyclopedie();
                    break;
                case "2":
                    nouveuaCorpsCeleste();
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

    public void consulterEncyclopedie() {

    }

    public void trieEnOrdreCroissant() {
        guide.add(1,new CorpsCeleste(1, "eabcd", 1));
        guide.add(2,new CorpsCeleste(1, "deabc", 1));
        guide.add(3,new CorpsCeleste(1, "cdeab", 1));
        guide.add(4,new CorpsCeleste(1, "bcdea", 1));
        guide.add(5,new CorpsCeleste(1, "abcde", 1));
        for (int i = 0; i < guide.size(); i++) {
            System.out.println(guide.get(i).getNom());
        }
        System.out.println("\n");
        
        
        for (int i = 1; i < guide.size(); i++) {
            CorpsCeleste valeur = guide.get(i);
            int position = i;
            while (position > 0 && guide.get(position - 1).getNom().compareTo(valeur.getNom()) > 0) {
                guide.set(position, guide.get(position - 1));
                position --;
            }
            guide.set(position, guide.get(i));
        }
        
        
        
        for (int i = 0; i < guide.size(); i++) {
            System.out.println(guide.get(i).getNom());
        }
    }

    public void nouveuaCorpsCeleste() {
    }

    public void modifierCorpsCeleste() {
    }

    public void statistique() {
    }

    public void quitter() {
    }
}
