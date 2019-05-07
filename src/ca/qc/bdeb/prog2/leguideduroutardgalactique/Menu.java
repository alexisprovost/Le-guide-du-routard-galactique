
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique;

import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.CorpsCeleste;
import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.Etoile;
import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.Lune;
import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.PlaneteGazeuse;
import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.PlaneteNaine;
import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.PlaneteNaine.Sorte;
import ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste.PlaneteTellurique;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
public class Menu {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<CorpsCeleste> encyclopedie = new ArrayList();
    private Fichier fichier = null;

    public Menu(ArrayList<CorpsCeleste> encyclopedie,Fichier fichier) {
        this.encyclopedie = encyclopedie;
        this.fichier = fichier;
    }

    public void showMenu() {
        encyclopedie = fichier.ouvertureProgramme();
        while (true) {
            System.out.println("\nBienvenue dans le Guide du Routard Galactique\n"
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

    public int gestionErreurChiffre(int min, int max, String chiffre) {
        boolean boucle = true;
        String inputChiffre = chiffre;
        while (boucle) {
            try {
                if (Integer.parseInt(inputChiffre) < min || Integer.parseInt(inputChiffre) > max) {
                    System.out.print("\nErreur chiffre non valide, entrer un chiffre valide: ");
                    inputChiffre = sc.nextLine();
                } else if (Integer.parseInt(inputChiffre) >= min || Integer.parseInt(inputChiffre) <= max) {
                    boucle = false;
                } else {
                    System.out.println("Internal Error l.137");
                }
            } catch (NumberFormatException e) {
                System.out.print("\nErreur chiffre non valide, entrer un chiffre valide: ");
                inputChiffre = sc.nextLine();
            }
        }
        return Integer.parseInt(inputChiffre);
    }

    public double gestionErreurDouble(double min, double max, String chiffre) {
        boolean boucle = true;
        String inputChiffre = chiffre;
        while (boucle) {
            try {
                if (Double.parseDouble(inputChiffre) < min || Double.parseDouble(inputChiffre) > max) {
                    System.out.print("\nErreur chiffre non valide, entrer un chiffre valide: ");
                    inputChiffre = sc.nextLine();
                } else if (Double.parseDouble(inputChiffre) >= min || Double.parseDouble(inputChiffre) <= max) {
                    boucle = false;
                } else {
                    System.out.println("Internal Error l.137");
                }
            } catch (NumberFormatException e) {
                System.out.print("\nErreur chiffre non valide, entrer un chiffre valide: ");
                inputChiffre = sc.nextLine();
            }
        }
        return Double.parseDouble(inputChiffre);
    }

    /**
     * Gere les erreur d'entrée des booleans
     * @param toBool Le String que l'on veut convertir en boolean
     * @return Return le boolean converti
     */
    public boolean gestionErreurBoolean(String toBool) {
        boolean boucle = true;
        String inputBool = toBool;
        boolean returnValue = false;
        while (boucle) {
            switch (inputBool.toUpperCase()) {
                case "NON":
                    returnValue = false;
                    boucle = false;
                    break;
                case "OUI":
                    returnValue = true;
                    boucle = false;
                    break;
                default:
                    System.out.print("\nErreur choix non valide, entrer oui ou non: ");
                    inputBool = sc.nextLine();
                    break;
            }
        }
        return returnValue;
    }

    /**
     * Méthode qui calcul la compatibilité des corps celetes
     * @param rayonTellurique Rayon de la planette
     * @param gravite Force gravitationnel
     * @param presenceEau Contient elle de l'eau
     * @param atmosphereCompatible Si l'atmosphere est compatible
     * @param temperatureMin Temperature minimal
     * @param temperatureMax Temperature maximal
     * @param temperatureMoy Temperature moyenne
     * @return 
     */
    public double compatibilite(double rayonTellurique, double gravite, boolean presenceEau, boolean atmosphereCompatible, double temperatureMin, double temperatureMax, double temperatureMoy) {
        double pointageFinale = 100;

        // rayon
        double rayonTerre = 56.70;
        double rayonCompa = (rayonTellurique * 100) / rayonTerre;
        int differenceRayon = (int) rayonCompa % 10;
        pointageFinale -= 1 * differenceRayon;

        // gravite
        double graviteTerre = 1;
        double graviteCompa = (gravite * 100) / graviteTerre;
        int differenceGravite = (int) graviteCompa % 20;
        pointageFinale -= 1 * differenceGravite;

        // eau
        if (presenceEau = false) {
            pointageFinale -= 10;
        }

        // atmosphere
        if (atmosphereCompatible = false) {
            pointageFinale -= 10;
        }

        // temperature minimale
        double tempMinTerre = -93.20;
        double tempMinCompa = (temperatureMin * 100) / tempMinTerre;
        if (tempMinCompa < 0) {
            int sous = (int) tempMinCompa % 10;
            pointageFinale -= 1 * sous;
        }

        // temperature maximale
        double tempMaxTerre = 56.70;
        double tempMaxCompa = (temperatureMax * 100) / tempMaxTerre;
        if (tempMaxCompa > 0) {
            int audessus = (int) tempMaxCompa % 10;
            pointageFinale -= 1 * audessus;
        }

        // temperature moyenne
        double tempMoyTerre = 15;
        double tempMoyCompa = (temperatureMoy * 100) / tempMoyTerre;
        if (tempMoyCompa > 0) {
            int difference = (int) tempMoyCompa % 10;
            pointageFinale -= 1 * difference;
        }

        //
        return pointageFinale;
    }

     /**
      * Méthode qui affiche l'encyclopedie dans son ensemble
      * @param encyclopedie ArrayList encyclopedie
      */
    public void consulterEncyclopedie() {
        for (int i = 0; i < encyclopedie.size(); i++) {
            System.out.println(encyclopedie.get(i));
        }
    }

     /**
     * Méthode qui gère le menu de création des corps celeste en général
     */
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
                nouvelleEtoile();
                break;
            case "2":
                nouvelleLune();
                break;
            case "3":
                nouvellePlaneteGazeuse();
                break;
            case "4":
                nouvellePlanetNaine();
                break;
            case "5":
                nouvellePlaneteTellurique();
                break;
            default:
        }
    }

     /**
     * Méthode qui gère la création des Étoiles
     */
    public void nouvelleEtoile() {
        ArrayList<CorpsCeleste> planetesLiees = new ArrayList();

        System.out.println("\nQuel est son nom?");
        String nom = sc.nextLine();
        System.out.println("\nQuel est le rayon de l'astre?");
        Double rayon = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());
        System.out.println("\nA quel phase est-elle?");
        int phase = gestionErreurChiffre(0, (int) Double.POSITIVE_INFINITY, sc.nextLine());
        System.out.println("\nQuelle est sa masse?");
        double masse = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());
        System.out.println("\nQuel(s) planete(s) sont liee(s)? Separer par les avec des ';' ou s'il y en a pas ecrivez rien.");
        String planetesLieesString = sc.nextLine();
        if (!planetesLieesString.equals("")) {
            String[] array = planetesLieesString.split(";");
            for (int l = 0; l < array.length; l++) {
                for (int i = 0; i < encyclopedie.size(); i++) {
                    if (array[l] == encyclopedie.get(i).getNom()) {
                        planetesLiees.add(encyclopedie.get(i));
                    } else {
                        System.out.println("Aucune planete avec le nom de " + array[i] + " a ete trouver");
                    }
                }
            }
        }
        encyclopedie.add(new Etoile(nom, rayon, planetesLiees, phase, masse));
    }

     /**
     * Méthode qui gère la création des Lunes
     */
    public void nouvelleLune() {
        System.out.println("\nQuel est son nom?");
        String nom = sc.nextLine();
        System.out.println("\nQuel est le rayon de l'astre?");
        double rayon = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());
        encyclopedie.add(new Lune(nom, rayon));
    }

     /**
     * Méthode qui gère la création des Planetes Gazeuse
     */
    public void nouvellePlaneteGazeuse() {
        System.out.println("\nQuel est son nom?");
        String nom = sc.nextLine();
        System.out.println("\nQuel est le rayon de l'astre?");
        double rayon = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());
        System.out.println("\nL'atmosphere est-elle compatible? (Oui ou Non)");
        boolean atmosphere = gestionErreurBoolean(sc.nextLine());
        System.out.println("\nY a-t-il presence de vie? (Oui ou Non)");
        boolean presenceDeVie = gestionErreurBoolean(sc.nextLine());
        System.out.println("\nY a-t-il un ou des anneaux? (Oui ou Non)");
        boolean anneaux = gestionErreurBoolean(sc.nextLine());
        encyclopedie.add(new PlaneteGazeuse(nom, rayon, atmosphere, presenceDeVie, anneaux));
    }

     /**
     * Méthode qui gère la création des Planetes Naine
     */
    public void nouvellePlanetNaine() {
        System.out.println("\nQuel est son nom?");
        String nom = sc.nextLine();
        System.out.println("\nQuel est le rayon de l'astre?");
        double rayon = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());
        System.out.println("\nQuel est son type? (1) Asteroide (2) Epars (3) Cubewano (4) Autres");
        int type = gestionErreurChiffre(1, 4, sc.nextLine());
        switch (type) {
            case 1:
                encyclopedie.add(new PlaneteNaine(nom, rayon, Sorte.ASTEROIDE));
                break;
            case 2:
                encyclopedie.add(new PlaneteNaine(nom, rayon, Sorte.EPARS));
                break;
            case 3:
                encyclopedie.add(new PlaneteNaine(nom, rayon, Sorte.CUBEWANO));
                break;
            case 4:
                encyclopedie.add(new PlaneteNaine(nom, rayon, Sorte.AUTRE));
                break;
        }
    }

    /**
     * Méthode qui gère la création des Planetes Tellurique
     */
    public void nouvellePlaneteTellurique() {

        ArrayList<Lune> lunesLiees = new ArrayList();

        ArrayList<CorpsCeleste> planetesLiees = new ArrayList();

        System.out.println("\nQuel est son nom?");
        String nom = sc.nextLine();
        System.out.println("\nQuel est le rayon de l'astre?");
        double rayon = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());
        System.out.println("\nQuel(s) lune(s) sont liee(s)? Separer par les avec des ';' Fou s'il y en a pas ecrivez rien.");
        String lunesLieesString = sc.nextLine();
        if (!lunesLieesString.equals("")) {
            String[] array = lunesLieesString.split(";");
            for (int l = 0; l < array.length; l++) {
                for (int i = 0; i < encyclopedie.size(); i++) {
                    if (array[l] == encyclopedie.get(i).getNom()) {
                        planetesLiees.add(encyclopedie.get(i));
                    } else {
                        System.out.println("Aucune lune avec le nom de " + array[i] + " a ete trouver");
                    }
                }
            }
        }
        System.out.println("\nL'atmosphere est-elle compatible? (Oui ou Non)");
        boolean atmosphere = gestionErreurBoolean(sc.nextLine());
        System.out.println("\nY a-t-il presence de vie? (Oui ou Non)");
        boolean presenceDeVie = gestionErreurBoolean(sc.nextLine());
        System.out.println("\nQuel est la gravite sur cette planete?");
        double gravite = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());
        System.out.println("\nQuel est la temperature minimale?");
        double tempMin = gestionErreurDouble(-546.15, Double.POSITIVE_INFINITY, sc.nextLine());
        System.out.println("\nQuel est la temperature maximale?");
        double tempMax = gestionErreurDouble(tempMin, Double.POSITIVE_INFINITY, sc.nextLine());
        double tempMoy = (tempMax - tempMin) / 2;
        double compatibilite = compatibilite(rayon, gravite, presenceDeVie, atmosphere, tempMin, tempMax, tempMoy);
        encyclopedie.add(new PlaneteTellurique(nom, rayon, lunesLiees, atmosphere, presenceDeVie, presenceDeVie, gravite, tempMin, tempMax, compatibilite));
    }

    /**
     * Méthode qui gère la suppression des Corps celeste
     * @param id l'ID d'un corps celeste que l'on veut supprimer
     */
    public void supressionCorpsCeleste(int id) {
        int searchId;
        int pos = -1;
        for (int i = 0; i < encyclopedie.size(); i++) {
            searchId = encyclopedie.get(i).getId();
            if (searchId == id) {
                pos = i;
            }
        }

        encyclopedie.remove(pos);
    }

    /**
     * Méthode qui gère les modification des corps celeste en général
     * @param id l'ID d'un corps celeste que l'on veut modifier
     */
    public void modificationCorpsCeleste(int id) {
        int searchId;
        int pos = -1;
        for (int i = 0; i < encyclopedie.size(); i++) {
            searchId = encyclopedie.get(i).getId();
            if (searchId == id) {
                pos = i;
            }
        }

        afficherUnCorpsCeleste(pos);

        if (encyclopedie.get(pos) instanceof PlaneteTellurique) {
            modificationPlaneteTellurique(pos);
        }

        if (encyclopedie.get(pos) instanceof PlaneteGazeuse) {
            modificationPlaneteGazeuse(pos);
        }

        if (encyclopedie.get(pos) instanceof PlaneteNaine) {
            modificationPlaneteNaine(pos);
        }

        if (encyclopedie.get(pos) instanceof Etoile) {
            modificationEtoile(pos);
        }

        if (encyclopedie.get(pos) instanceof Lune) {
            modificationLune(pos);
        }

        /* Modification pour chaque type de corps celeste selon leur attributs */
    }

    /**
     * Méthode qui affiche n'importe quel corps celeste
     * @param id l'ID d'un corps que l'on veut afficher
     */
    public void afficherUnCorpsCeleste(int id) {
        System.out.println(encyclopedie.get(id));
    }

    /**
     * Méthode qui gère les modification des Planetes Tellurique
     * @param id l'ID d'une Planetes Tellurique que l'on veut modifier
     */
    public void modificationPlaneteTellurique(int id) {
        System.out.print("\nNom: ");
        String nom = sc.nextLine();

        System.out.print("\nRayon: ");
        double rayon = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());

        System.out.print("\nPrésence d'eau: ");
        boolean eau = gestionErreurBoolean(sc.nextLine());

        System.out.print("\nPrésence de vie: ");
        boolean vie = gestionErreurBoolean(sc.nextLine());

        System.out.print("\nGravité: ");
        double gravite = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());

        System.out.print("\nAtmosphere Compatible: ");
        boolean atmosphereComp = gestionErreurBoolean(sc.nextLine());

        System.out.print("\nTemperature minimale: ");
        double tempMin = gestionErreurDouble(-546.15, Double.POSITIVE_INFINITY, sc.nextLine());

        System.out.print("\nTemperature maximale: ");
        double tempMax = gestionErreurDouble(tempMin, Double.POSITIVE_INFINITY, sc.nextLine());

        encyclopedie.get(id).setNom(nom);
        encyclopedie.get(id).setRayon(rayon);
        ((PlaneteTellurique) encyclopedie.get(id)).setPresenceEau(eau);
        ((PlaneteTellurique) encyclopedie.get(id)).setPresenceVie(vie);
        ((PlaneteTellurique) encyclopedie.get(id)).setGravite(gravite);
        ((PlaneteTellurique) encyclopedie.get(id)).setAtmosphereCompatible(atmosphereComp);
        ((PlaneteTellurique) encyclopedie.get(id)).setTemperatureMax(tempMax);
        ((PlaneteTellurique) encyclopedie.get(id)).setTemperatureMin(tempMin);
        ((PlaneteTellurique) encyclopedie.get(id)).rafraichirTemperatureMoyenne();
    }

    /**
     * Méthode qui gère les modification des Planètes Gazeuse
     * @param id l'ID d'une Planetes Naines que l'on veut modifier
     */
    public void modificationPlaneteGazeuse(int id) {
        System.out.print("\nNom: ");
        String nom = sc.nextLine();

        System.out.print("\nRayon: ");
        double rayon = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());

        System.out.print("\nPrésence de vie: ");
        boolean vie = gestionErreurBoolean(sc.nextLine());

        System.out.print("\nAnneau: ");
        boolean anneau = gestionErreurBoolean(sc.nextLine());

        System.out.print("\nAtmosphere Compatible: ");
        boolean atmosphereComp = gestionErreurBoolean(sc.nextLine());

        encyclopedie.get(id).setNom(nom);
        encyclopedie.get(id).setRayon(rayon);
        ((PlaneteGazeuse) encyclopedie.get(id)).setPresenceVie(vie);
        ((PlaneteGazeuse) encyclopedie.get(id)).setAnneau(anneau);
        ((PlaneteGazeuse) encyclopedie.get(id)).setAtmosphereCompatible(atmosphereComp);
    }

    /**
     * Méthode qui gère les modification des Planetes Naines
     * @param id l'ID d'une Planetes Naines que l'on veut modifier
     */
    public void modificationPlaneteNaine(int id) {
        System.out.print("\nNom: ");
        String nom = sc.nextLine();

        System.out.print("\nRayon: ");
        double rayon = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());

        System.out.print("\nQuel est son type? (1) Asteroide (2) Epars (3) Cubewano (4) Autres: ");
        int type = gestionErreurChiffre(1, 4, sc.nextLine());
        switch (type) {
            case 1:
                ((PlaneteNaine) encyclopedie.get(id)).setTypeDeNaine(Sorte.ASTEROIDE);
                break;
            case 2:
                ((PlaneteNaine) encyclopedie.get(id)).setTypeDeNaine(Sorte.EPARS);
                break;
            case 3:
                ((PlaneteNaine) encyclopedie.get(id)).setTypeDeNaine(Sorte.CUBEWANO);
                break;
            case 4:
                ((PlaneteNaine) encyclopedie.get(id)).setTypeDeNaine(Sorte.AUTRE);
                break;
        }

        encyclopedie.get(id).setNom(nom);
        encyclopedie.get(id).setRayon(rayon);
    }

    /**
     * Méthode qui gère les modification des Étoiles
     * @param id l'ID d'une étoile que l'on veut modifier
     */
    public void modificationEtoile(int id) {
        ArrayList<CorpsCeleste> planetesLiees = new ArrayList();

        System.out.print("\nNom: ");
        String nom = sc.nextLine();

        System.out.print("\nRayon: ");
        double rayon = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());

        System.out.print("\nA quel phase est-elle?: ");
        int phase = gestionErreurChiffre(0, (int) Double.POSITIVE_INFINITY, sc.nextLine());

        System.out.println("\nQuelle est sa masse?");
        double masse = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());

        System.out.println("\nQuel(s) planete(s) sont liee(s)? Separer par les avec des ';' ou s'il y en a pas ecrivez rien.");
        String planetesLieesString = sc.nextLine();
        if (!planetesLieesString.equals("")) {
            String[] array = planetesLieesString.split(";");
            for (int l = 0; l < array.length; l++) {
                for (int i = 0; i < encyclopedie.size(); i++) {
                    if (array[l] == encyclopedie.get(i).getNom()) {
                        planetesLiees.add(encyclopedie.get(i));
                    } else {
                        System.out.println("Aucune planete avec le nom de " + array[i] + " a ete trouver");
                    }
                }
            }
        }

        encyclopedie.get(id).setNom(nom);
        encyclopedie.get(id).setRayon(rayon);
        ((Etoile) encyclopedie.get(id)).setPhase(phase);
        ((Etoile) encyclopedie.get(id)).setMasse(masse);
        ((Etoile) encyclopedie.get(id)).setPlanetesLier(planetesLiees);
    }
 
    /**
     * Méthode qui gère les modification des lunes
     * @param id l'ID d'une lune qu'on veut modifier
     */
    public void modificationLune(int id) {
        System.out.print("\nNom: ");
        String nom = sc.nextLine();

        System.out.print("\nRayon: ");
        double rayon = gestionErreurDouble(0, Double.POSITIVE_INFINITY, sc.nextLine());

        encyclopedie.get(id).setNom(nom);
        encyclopedie.get(id).setRayon(rayon);
    }
    
    /**
     * Méthode qui modifie les corps celestes
     */
    public void modifierCorpsCeleste() {
        boolean premiereBoucle = true;
        while (premiereBoucle) {
            System.out.println("\n(1)Supprimer ou (2)modifier: ");
            String reponse = sc.nextLine();

            switch (reponse) {
                case "1":
                    System.out.println("\nQuel type voulez vous afficher ?\n"
                            + "1 Planète tellurique\n"
                            + "2 Planète gazeuse\n"
                            + "3 Planète naine\n"
                            + "4 Étoile\n"
                            + "5 Lune : ");

                    String reponseType = sc.nextLine();

                    switch (reponseType) {
                        case "1":
                            for (int i = 0; i < encyclopedie.size(); i++) {
                                if (encyclopedie.get(i) instanceof PlaneteTellurique) {
                                    System.out.println(encyclopedie.get(i));
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case "2":
                            for (int i = 0; i < encyclopedie.size(); i++) {
                                if (encyclopedie.get(i) instanceof PlaneteGazeuse) {
                                    System.out.println(encyclopedie.get(i));
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case "3":
                            for (int i = 0; i < encyclopedie.size(); i++) {
                                if (encyclopedie.get(i) instanceof PlaneteNaine) {
                                    System.out.println(encyclopedie.get(i));
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case "4":
                            for (int i = 0; i < encyclopedie.size(); i++) {
                                if (encyclopedie.get(i) instanceof Etoile) {
                                    System.out.println(encyclopedie.get(i));
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case "5":
                            for (int i = 0; i < encyclopedie.size(); i++) {
                                if (encyclopedie.get(i) instanceof Lune) {
                                    System.out.println(encyclopedie.get(i));
                                    System.out.println("\n");
                                }
                            }
                            break;
                        default:
                            break;
                    }

                    System.out.print("Voulez-vous voir une autre liste? (O/N) ou 0 pour revenir au menu principal: ");
                    if (sc.nextLine().toLowerCase().equals("n")) {
                        String entreId = "";
                        int lastId = encyclopedie.get(encyclopedie.size() - 1).getId();
                        while (true) {
                            System.out.print("Quel ID voulez-vous Supprimer?: ");
                            entreId = sc.nextLine();
                            supressionCorpsCeleste(gestionErreurChiffre(0, lastId, entreId));
                            System.out.println("Supression effectué!");
                            premiereBoucle = false;
                            break;
                        }
                    } else {

                    }

                    break;
                case "2":
                    System.out.println("\nQuel type voulez vous afficher ?\n"
                            + "1 Planète tellurique\n"
                            + "2 Planète gazeuse\n"
                            + "3 Planète naine\n"
                            + "4 Étoile\n"
                            + "5 Lune : ");

                    String reponseType2 = sc.nextLine();

                    switch (reponseType2) {
                        case "1":
                            for (int i = 0; i < encyclopedie.size(); i++) {
                                if (encyclopedie.get(i) instanceof PlaneteTellurique) {
                                    System.out.println(encyclopedie.get(i));
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case "2":
                            for (int i = 0; i < encyclopedie.size(); i++) {
                                if (encyclopedie.get(i) instanceof PlaneteGazeuse) {
                                    System.out.println(encyclopedie.get(i));
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case "3":
                            for (int i = 0; i < encyclopedie.size(); i++) {
                                if (encyclopedie.get(i) instanceof PlaneteNaine) {
                                    System.out.println(encyclopedie.get(i));
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case "4":
                            for (int i = 0; i < encyclopedie.size(); i++) {
                                if (encyclopedie.get(i) instanceof Etoile) {
                                    System.out.println(encyclopedie.get(i));
                                    System.out.println("\n");
                                }
                            }
                            break;
                        case "5":
                            for (int i = 0; i < encyclopedie.size(); i++) {
                                if (encyclopedie.get(i) instanceof Lune) {
                                    System.out.println(encyclopedie.get(i));
                                    System.out.println("\n");
                                }
                            }
                            break;
                        default:
                            break;
                    }

                    System.out.print("Voulez-vous voir une autre liste? (O/N) ou 0 pour revenir au menu principal: ");
                    if (sc.nextLine().toLowerCase().equals("n")) {
                        String entreId = "";
                        int lastId = encyclopedie.get(encyclopedie.size() - 1).getId();
                        while (true) {
                            System.out.print("Quel ID voulez-vous modifier?: ");
                            entreId = sc.nextLine();
                            modificationCorpsCeleste(gestionErreurChiffre(0, lastId, entreId));
                            System.out.println("Modification Effectué!");
                            premiereBoucle = false;
                            break;
                        }
                    } else {

                    }

                    break;
                case "0":
                    premiereBoucle = false;
                    break;
                default:
                    break;
            }

        }

    }

    /**
     * Méthode qui affiche le menu statistiques
     */
    public void statistique() {
        System.out.println("\n(1) Nombre d'entrees saisies pour chaque type de corps celeste"
                + "\n(2) Afficher pour chaque etoile leur(s) planete(s) associee(s)"
                + "\n(3) Afficher pour chaque planete leur(s) lune(s) associee(s)");
        String reponse = sc.nextLine();
        switch (reponse) {
            case "1":
                int nbrEtoile = 0,
                 nbrLune = 0,
                 nbrPlaneteGazeuse = 0,
                 nbrePlaneteNaine = 0,
                 nbrPlaneteTellurique = 0;
                for (int i = 0; i < encyclopedie.size(); i++) {
                    if (encyclopedie.get(i) instanceof Etoile) {
                        nbrEtoile++;
                    } else if (encyclopedie.get(i) instanceof Lune) {
                        nbrLune++;
                    } else if (encyclopedie.get(i) instanceof PlaneteGazeuse) {
                        nbrPlaneteGazeuse++;
                    } else if (encyclopedie.get(i) instanceof PlaneteNaine) {
                        nbrePlaneteNaine++;
                    } else if (encyclopedie.get(i) instanceof PlaneteTellurique) {
                        nbrPlaneteTellurique++;
                    }
                }
                System.out.println("\nIl y a " + nbrEtoile + " etoile(s)"
                        + "\nIl y a " + nbrLune + " lune(s)"
                        + "\nIl y a " + nbrPlaneteGazeuse + " planete(s) gazeuse(s)"
                        + "\nIl y a " + nbrePlaneteNaine + " planete(s) naine(s)"
                        + "\nIl y a " + nbrPlaneteTellurique + " planete(s) tellurique(s)");
                break;
            case "2":
                for (int i = 0; i < encyclopedie.size(); i++) {
                    if (encyclopedie.get(i) instanceof Etoile) {
                        System.out.println(encyclopedie.get(i));
                    }
                }
                break;
            case "3":
                break;
            default:
        }
    }

    
    /**
     * Méthode qui quitte le programme
     */
    public void quitter() {
        System.out.println("\nVoulez-vous vraiment quitter cette environnement de plaisir? Oui ou Non");
        String reponse = sc.nextLine();
        switch (reponse.toLowerCase()) {
            case "oui":
                fichier.fermetureProgramme(encyclopedie);
                System.exit(0);
        }
    }
}