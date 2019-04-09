/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste;

import java.util.ArrayList;

/**
 * @author 1850986
 */
public class Planete extends CorpsCeleste {
    protected double distanceDeLaTerre, gravite, temperatureMax, temperatureMoy, temperatureMin, pointageCompatibilite;
    protected boolean presenceEau, presenceVie, atmosphereCompatible;
    protected ArrayList<CorpsCeleste> lune = null;
    
    public Planete(int id, String nom, double rayon, double distanceDeLaTerre, boolean presenceEau, boolean presenceVie, double gravite, boolean atmosphereCompatible, double temperatureMax, double temperatureMoy, double temperatureMin, double pointageCompatibilite) {
        super(id, nom, rayon);
        this.distanceDeLaTerre = distanceDeLaTerre;
        this.presenceEau = presenceEau;
        this.presenceVie = presenceVie;
        this.gravite = gravite;
        this.atmosphereCompatible = atmosphereCompatible;
        this.temperatureMax = temperatureMax;
        this.temperatureMoy = temperatureMoy;
        this.temperatureMin = temperatureMin;
        this.pointageCompatibilite = pointageCompatibilite;
    }
}
