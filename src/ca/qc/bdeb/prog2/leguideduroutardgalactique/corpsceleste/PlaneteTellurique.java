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
public class PlaneteTellurique extends CorpsCeleste {

    protected double gravite, temperatureMax, temperatureMoy, temperatureMin, pointageCompatibilite;
    protected boolean presenceEau, presenceVie, atmosphereCompatible;
    protected ArrayList<Lune> lunes = null;

    /**
     * Constructeur Planete Tellurique
     *
     * @param nom Nom planete tellurique
     * @param rayon Rayon planete tellurique
     * @param lunes Lunes lier planete tellurique
     * @param atmosphereCompatible Atmosphere compatible planete tellurique
     * @param presenceVie Présence Vie planete tellurique
     * @param presenceEau Présence eau planete tellurique
     * @param gravite Gravité planete tellurique
     * @param temperatureMin Temperature min planete tellurique
     * @param temperatureMax Temperature max planete tellurique
     * @param pointageCompatibilite pointage compatiblité planete tellurique
     */
    public PlaneteTellurique(String nom, double rayon, ArrayList<Lune> lunes, boolean atmosphereCompatible, boolean presenceVie, boolean presenceEau, double gravite, double temperatureMin, double temperatureMax) {
        super(nom, rayon);
        this.lunes = lunes;
        this.atmosphereCompatible = atmosphereCompatible;
        this.presenceVie = presenceVie;
        this.presenceEau = presenceEau;
        this.gravite = gravite;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        temperatureMoy = (temperatureMin + temperatureMax) / 2;
        calculCompat();
    }

    
    /**
     * Methode qui calcul la compatibilité
     */
    private void calculCompat() {

        double pointageFinale = 100;

        // rayon
        double rayonTerre = 6378.14;
        double rayonCompa = -Math.abs((rayon - rayonTerre) / rayonTerre) / 10;
        pointageFinale = pointageFinale - rayonCompa;

        // gravite
        double graviteTerre = 1;
        double graviteCompa = -Math.abs((gravite - graviteTerre) / graviteTerre) / 5;
        pointageFinale = pointageFinale - graviteCompa;

        // eau
        if (presenceEau == true) {
            pointageFinale = pointageFinale - 10;
        }

        // atmosphere
        if (atmosphereCompatible == true) {
            pointageFinale = pointageFinale - 10;
        }

        // temperature minimale
        double tempMinTerre = -93.20;
        if (temperatureMin < tempMinTerre) {
            pointageFinale = pointageFinale - ((tempMinTerre - temperatureMin) / 10);
        }

        // temperature maximale
        double tempMaxTerre = 56.70;
        if (temperatureMax > tempMaxTerre) {
            pointageFinale = pointageFinale - ((temperatureMax - tempMaxTerre) / 10);
        }

        // temperature moyenne
        double tempMoyTerre = -18.25;
        pointageFinale = pointageFinale - Math.abs((temperatureMoy - tempMoyTerre) / 10);

        pointageCompatibilite = pointageFinale;
    }

    /**
     * Getter comptatibilité
     *
     * @return comptatibilité %
     */
    public double getPointageCompatibilite() {
        return pointageCompatibilite;
    }

    /**
     * Setter PresenceEau
     *
     * @param presenceEau Presence Eau Eau oui / non
     */
    public void setPresenceEau(boolean presenceEau) {
        this.presenceEau = presenceEau;
    }

    /**
     * Setter PresenceVie
     *
     * @param presenceVie PresenceVie oui / non
     */
    public void setPresenceVie(boolean presenceVie) {
        this.presenceVie = presenceVie;
    }

    /**
     * Setter Gratité
     *
     * @param gravite Doubytle gravité
     */
    public void setGravite(double gravite) {
        this.gravite = gravite;
    }

    /**
     * Setter AtmosphereCompatible
     * @param atmosphereCompatible AtmosphereCompatible
     */
    public void setAtmosphereCompatible(boolean atmosphereCompatible) {
        this.atmosphereCompatible = atmosphereCompatible;
    }

    /**
     * Setter temperatureMax 
     * @param temperatureMax temperatureMax 
     */
    public void setTemperatureMax(double temperatureMax) {
        this.temperatureMax = temperatureMax;
    }

    /**
     * Setter temperatureMin 
     * @param temperatureMin temperatureMin 
     */
    public void setTemperatureMin(double temperatureMin) {
        this.temperatureMin = temperatureMin;
    }

    /**
     * Rafraichit la température moyenne
     */
    public void rafraichirTemperatureMoyenne() {
        temperatureMoy = (temperatureMin + temperatureMax) / 2;
    }

    /**
     * Calcul du nombre de plante lier
     * @return int nb planete lier
     */
    public int nombreDePlaneteLier() {
        int nbreDePlanete = 0;
        for (int i = 0; i < lunes.size(); i++) {
            nbreDePlanete++;
        }
        return nbreDePlanete;
    }

    /**
     * TO string affichage
     * @return affichage Planete Tellurique
     */
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
                + "Pointage de compatibilite: " + pointageCompatibilite + "\n"
                + "Lune(s) lier(s): " + lunes;
    }
}
