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
public class PlaneteTellurique extends CorpsCeleste implements Serializable {

    protected double gravite, temperatureMax, temperatureMoy, temperatureMin, pointageCompatibilite;
    protected boolean presenceEau, presenceVie, atmosphereCompatible;
    protected ArrayList<CorpsCeleste> lune = null;

    public PlaneteTellurique(int id, String nom, double rayon, boolean atmosphereCompatible, boolean presenceVie, boolean presenceEau, double gravite, double temperatureMin, double temperatureMax, double temperatureMoy, double pointageCompatibilite) {
        super(id, nom, rayon);
        this.atmosphereCompatible = atmosphereCompatible;
        this.presenceVie = presenceVie;
        this.presenceEau = presenceEau;
        this.gravite = gravite;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        this.temperatureMoy = temperatureMoy;
        this.pointageCompatibilite = pointageCompatibilite;
    }

    public void affichage() {
        System.out.println("ID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Presence d'eau: " + presenceEau + "\n"
                + "Presence de vie: " + presenceVie + "\n"
                + "Gravite: " + gravite + "\n"
                + "Atmosphere compatible: " + atmosphereCompatible + "\n"
                + "Temperature: " + temperatureMin + "°C a" + temperatureMax + "°C, " + temperatureMoy + "°C en moyenne\n"
                // en constrution         + "Lune(s) associees: " + +"\n"
                + "Pointage de compatibilite: " + pointageCompatibilite);
    }
}
