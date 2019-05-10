package ca.qc.bdeb.prog2.leguideduroutardgalactique;

import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.CorpsCeleste;
import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.Lune;
import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.PlaneteTellurique;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 */
public class Fichier implements Serializable {

    private String nomFichier = "guide.bin";

    /**
     * Constructeur vide Fichier
     */
    public Fichier() {

    }

    /**
     * Méthode qui lis les donnée du fichier csv ou bin
     *
     * @return Les données du fichier csv ou bin
     */
    public ArrayList<CorpsCeleste> ouvertureProgramme() {
        //Regarde si le fichier guide.bin existe
        ArrayList<CorpsCeleste> encyclopedie = new ArrayList<CorpsCeleste>();

        if (Files.exists(Paths.get(nomFichier))) {
            //Existe
            try {
                FileInputStream readBin = new FileInputStream(nomFichier);
                ObjectInputStream fff = new ObjectInputStream(readBin);
                encyclopedie = (ArrayList<CorpsCeleste>) fff.readObject();
                return encyclopedie;
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
                    String lunesLieesString;
                    Random rd = new Random();
                    while ((ligne = bufferedreader.readLine()) != null) {
                        String[] array = ligne.split(";");
                        //Saute les descriptions de valeurs
                        if (count != 0) {
                            //Replace commas with points
                            array[1] = array[1].replace(',', '.');
                            array[4] = array[4].replace(',', '.');
                            array[6] = array[6].replace(',', '.');
                            array[8] = array[8].replace(',', '.');
                            array[7] = array[7].replace(',', '.');
                            //Replace Oui with true

                            if (array[5].equals("oui")) {
                                array[5] = "true";
                            } 
                            
                            if (array[5].equals("non")) {
                                array[5] = "false";
                            }
                            
                            if (array[2].equals("oui")) {
                                array[2] = "true";
                            } 
                            
                            if (array[2].equals("non")) {
                                array[2] = "false";
                            }
                            
                            if (array[3].equals("oui")) {
                                array[3] = "true";
                            } 
                            
                            if (array[3].equals("non")) {
                                array[3] = "false";
                            }
                            // Ajoute le(s) lune(s)
                            lunesLieesString = array[9];
                            ArrayList<Lune> lunesLiees = new ArrayList();
                            if (!lunesLieesString.equals("")) {
                                try {
                                    String[] arrayLunes = lunesLieesString.split(",");
                                    for (int i = 0; i < arrayLunes.length; i++) {
                                        double rayon = rd.nextDouble() * 10000.0;
                                        lunesLiees.add(new Lune(arrayLunes[i], rayon));
                                        encyclopedie.add(lunesLiees.get(i));
                                    }
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    System.out.println(e);
                                }
                            }
                            try {
                                encyclopedie.add(new PlaneteTellurique(array[0],
                                        Double.parseDouble(array[1]),
                                        lunesLiees,
                                        Boolean.parseBoolean(array[5]),
                                        Boolean.parseBoolean(array[2]),
                                        Boolean.parseBoolean(array[3]),
                                        Double.parseDouble(array[4]),
                                        Double.parseDouble(array[8]),
                                        Double.parseDouble(array[6])));
                            } catch (NumberFormatException e) {
                                System.out.println(e);
                            }
                        }
                        count++;
                    }
                } catch (FileNotFoundException e) {
                    System.out.println(e);
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        return encyclopedie;
    }

    /**
     * Méthode qui Enregistre les données de l'encyclopedie
     *
     * @param encyclopedie les données de l'encyclopedie
     */
    public void fermetureProgramme(ArrayList<CorpsCeleste> encyclopedie) {
        try {
            FileOutputStream fos = new FileOutputStream(nomFichier);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(encyclopedie);
            oos.flush();
            oos.close();
        } catch (java.io.IOException e) {
            System.out.println("Erreur d'entrées-sorties");
        }
    }
}
