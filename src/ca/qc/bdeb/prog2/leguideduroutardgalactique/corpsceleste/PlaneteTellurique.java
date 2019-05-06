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

    public PlaneteTellurique(String nom, double rayon, ArrayList<Lune> lunes, boolean atmosphereCompatible, boolean presenceVie, boolean presenceEau, double gravite, double temperatureMin, double temperatureMax, double pointageCompatibilite) {
        super(nom, rayon);
        this.lunes = lunes;
        this.atmosphereCompatible = atmosphereCompatible;
        this.presenceVie = presenceVie;
        this.presenceEau = presenceEau;
        this.gravite = gravite;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        temperatureMoy = (temperatureMin + temperatureMax)/2;
        this.pointageCompatibilite = pointageCompatibilite;
    }

    public void setPresenceEau(boolean presenceEau) {
        this.presenceEau = presenceEau;
    }

    public void setPresenceVie(boolean presenceVie) {
        this.presenceVie = presenceVie;
    }

    public void setGravite(double gravite) {
        this.gravite = gravite;
    }

    public void setAtmosphereCompatible(boolean atmosphereCompatible) {
        this.atmosphereCompatible = atmosphereCompatible;
    }

    public void setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    public void setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }
    
    public void rafraichirTemperatureMoyenne(){
       temperatureMoy = (temperatureMin + temperatureMax)/2; 
    }
    
    @Override
    public void affichageObjetLier() {
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon + "\n"
                + "Presence d'eau: " + presenceEau + "\n"
                + "Presence de vie: " + presenceVie + "\n"
                + "Gravite: " + gravite + "\n"
                + "Atmosphere compatible: " + atmosphereCompatible + "\n"
                + "Temperature: " + temperatureMin + "°C a " + temperatureMax + "°C, " + temperatureMoy + "°C en moyenne\n"
                // en constrution         + "Lune(s) associees: " + +"\n"
                + "Pointage de compatibilite: " + pointageCompatibilite;
    }
}
