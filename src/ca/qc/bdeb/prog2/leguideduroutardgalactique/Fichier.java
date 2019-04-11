/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.ObjectInputStream;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
public class Fichier {

    public void ouvertureTransfert() {
        try {
            FileInputStream fichier = new FileInputStream("guide.bin");
            ObjectInputStream ff = new ObjectInputStream(fichier);
            

        } catch (java.io.IOException e) {
            System.out.println(e);
            try {
                FileReader fichier = new FileReader("420-202-RE - H19 - Annexe - Planètes et lunes.csv");
                BufferedReader ff = new BufferedReader(fichier);
                
                
            } catch (FileNotFoundException ee) {
                System.out.println(ee);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
