/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste;

import java.util.ArrayList;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
public /*abstract*/ class CorpsCeleste {

    protected String typeDObject, nom;
    protected int id;
    protected double rayon;

    public CorpsCeleste(int id, String typeDObject, String nom, double rayon) {
        this.id = id;
        this.typeDObject = typeDObject;
        this.nom = nom;
        this.rayon = rayon;
    }

    public String getNom() {
        return nom;
    }

    public String getTypeDObject() {
        return typeDObject;
    }
    

    public void affichage(ArrayList<CorpsCeleste> guide) {
        for (int i = 0; i < guide.size(); i++) {
            if (guide.get(i).getTypeDObject() == "Tellurique") {
                affichageTellurique();
                double = guide.get(i).
            } else if (guide.get(i).getTypeDObject() == "Naine") {
                affichageNaine();
            } else if (guide.get(i).getTypeDObject() == "Gazeuse") {
                affichageGazeuse();
            } else if (guide.get(i).getTypeDObject() == "Etoile") {
                affichageEtoile();
            } else if (guide.get(i).getTypeDObject() == "Lune") {
                affichageLune();
            }else{}
        }
    }

    public void affichageTellurique(int id, String typeDObject, String nom, double rayon, boolean atmosphereCompatible, boolean presenceVie, boolean presenceEau, double gravite, double temperatureMin, double temperatureMax, double temperatureMoy, double distanceDeLaTerre, double pointageCompatibilite) {
        for (int i = 0; i < 10; i++) {
            System.out.println("ID: " + id + "\n"
                    + "Nom: " + nom + "\n"
                    + "Rayon: " + rayon + "\n"
                    + "Distance de la Terre: " + distanceDeLaTerre + "\n"
                    + "Presence d'eau: " + presenceEau + "\n"
                    + "Presence de vie: " + presenceVie + "\n"
                    + "Gravite: " + gravite + "\n"
                    + "Atmosphere compatible: " + atmosphereCompatible + "\n"
                    + "Temperature: " + temperatureMin + "°C a" + temperatureMax + "°C, " + temperatureMoy + "°C en moyenne\n"
                    // en constrution         + "Lune(s) associees: " + +"\n"
                    + "Pointage de compatibilite: " + pointageCompatibilite);
        }
    }

    public void affichageNaine(int id, String typeDObject, String nom, double rayon, String type) {
        System.out.println("ID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Type: " + type + "\n");
    }

    public void affichageGazeuse(int id, String typeDObject, String nom, double rayon, boolean atmosphereCompatible, boolean presenceVie, boolean anneau) {
        System.out.println("ID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Presence de vie: " + presenceVie + "\n"
                + "Atmosphere compatible: " + atmosphereCompatible + "\n"
                + "Presence d'anneau(x):" + anneau + "\n");
    }

    public void affichageEtoile(int id, String typeDObject, String nom, double rayon, String planetesLier, int phase, double masse) {
        System.out.println("ID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Phase: " + phase + "\n"
                + "Masse: " + masse + "\n");
    }

    public void affichageLune(int id, String typeDObject, String nom, double rayon, String planeteLier) {
        System.out.println("ID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Planete lier: " + planeteLier);
    }
}
