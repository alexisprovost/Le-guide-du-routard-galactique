/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
public class PlaneteTellurique extends CorpsCeleste {

    protected double gravite, temperatureMax, temperatureMoy, temperatureMin, pointageCompatibilite;
    protected boolean presenceEau, presenceVie, atmosphereCompatible;
    protected ArrayList<Lune> lunes = null;

    public PlaneteTellurique(String nom, double rayon, ArrayList<Lune> lunes, boolean atmosphereCompatible, boolean presenceVie, boolean presenceEau, double gravite, double temperatureMin, double temperatureMax, double temperatureMoy, double pointageCompatibilite) {
        super(nom, rayon);
        this.lunes = lunes;
        this.atmosphereCompatible = atmosphereCompatible;
        this.presenceVie = presenceVie;
        this.presenceEau = presenceEau;
        this.gravite = gravite;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        this.temperatureMoy = temperatureMoy;
        this.pointageCompatibilite = pointageCompatibilite;
    }

    public double getPointageCompatibilite() {
        return pointageCompatibilite;
    }

    @Override
    public void affichageObjetLier() {
    }

    @Override
    public void affichage() {
        System.out.println("\nID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Presence d'eau: " + presenceEau + "\n"
                + "Presence de vie: " + presenceVie + "\n"
                + "Gravite: " + gravite + "\n"
                + "Atmosphere compatible: " + atmosphereCompatible + "\n"
                + "Temperature: " + temperatureMin + "°C a " + temperatureMax + "°C, " + temperatureMoy + "°C en moyenne\n");
        System.out.println("Lune(s) associee(s): ");
        for (int i = 0; i < lunes.size(); i++) {
            lunes.get(i).getNom();
            if (lunes.size() > 1) {
                System.out.println("");
            }
        }
        System.out.println("Pointage de compatibilite: " + pointageCompatibilite);
    }
}
