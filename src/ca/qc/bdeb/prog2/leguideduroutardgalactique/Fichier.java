/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique;

import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.CorpsCeleste;
import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.PlaneteTellurique;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
public class Fichier implements java.io.Serializable {

    ArrayList<CorpsCeleste> encyclopedie = new ArrayList<>();

    public Fichier(ArrayList encyclopedie) {
        this.encyclopedie = encyclopedie;
    }

    public void ouvertureTransfert() {
        //Regarde si le fichier guide.bin existe
        if (Files.exists(Paths.get("guide.bin"))) {
            //Existe
            try {
                FileInputStream fichier = new FileInputStream("guide.bin");
                ObjectInputStream ff = new ObjectInputStream(fichier);
                encyclopedie = (ArrayList<CorpsCeleste>) ff.readObject();
            } catch (IOException e) {
                System.out.println(e);
            } catch (Exception e) {
                //Erreur inconnue
                System.out.println(e);
            }
        } else {
            //N'existe pas
            //Doit lire le fichier csv et le convertir en tableau
            try {
                //Csv to arraylist
                int count = 0;
                String file = "420-202-RE - H19 - Annexe - Planètes et lunes.csv";
                try (BufferedReader bufferedreader = new BufferedReader(new FileReader(file))) {
                    String ligne = "";
//bufferedreader.readLine();
                    while ((ligne = bufferedreader.readLine()) != null) {
                        String[] array = ligne.split(";");
                        System.out.println(ligne);
                        //Saute les descriptions de valeurs
                        if (count != 0) {
                            for (String info : array) {
                                System.out.println(info);
                            }

                            System.out.println(array[0]);
                            System.out.println(array[1]);

                            //Replace commas with points
                            array[1] = array[1].replace(',', '.');
                            array[4] = array[4].replace(',', '.');
                            array[6] = array[6].replace(',', '.');
                            array[8] = array[8].replace(',', '.');
                            array[7] = array[7].replace(',', '.');
                            array[17] = array[17].replace(',', '.');
                            array[17] = array[17].replace('%', ' ');
                            //Replace Oui with true

                            if (array[5] == "oui") {
                                array[5] = "true";
                            } else if (array[5] == "non") {
                                array[5] = "false";
                            }
                            if (array[2] == "oui") {
                                array[2] = "true";
                            } else if (array[2] == "non") {
                                array[2] = "false";
                            }
                            if (array[3] == "oui") {
                                array[3] = "true";
                            } else if (array[3] == "non") {
                                array[3] = "false";
                            }
//                            try {
                            encyclopedie.add(new PlaneteTellurique(array[0],
                                    Double.parseDouble(array[1]),
                                    Boolean.parseBoolean(array[5]),
                                    Boolean.parseBoolean(array[2]),
                                    Boolean.parseBoolean(array[3]),
                                    Double.parseDouble(array[4]),
                                    Double.parseDouble(array[8]),
                                    Double.parseDouble(array[6]),
                                    Double.parseDouble(array[7]),
                                    Double.parseDouble(array[17])
                            ));
//                             catch (Exception e) {
//                                System.out.println(e.getStackTrace().toString());
//                            }
                        }
                        count++;
                    }
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
            } catch (IOException e) {
                System.out.println(e);
//            } catch (Exception e) {
//                //Erreur inconnue
//                System.out.println(e.getCause());
//                System.out.println(e);
            }
        }

    }
}
