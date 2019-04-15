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

    protected double distanceDeLaTerre, gravite, temperatureMax, temperatureMoy, temperatureMin, pointageCompatibilite;
    protected boolean presenceEau, presenceVie, atmosphereCompatible;
    protected ArrayList<CorpsCeleste> lune = null;

    public PlaneteTellurique(int id, String typeDObject, String nom, double rayon, boolean atmosphereCompatible, boolean presenceVie, boolean presenceEau, double gravite, double temperatureMin, double temperatureMax, double temperatureMoy, double distanceDeLaTerre, double pointageCompatibilite) {
        super(id, typeDObject, nom, rayon);
        this.atmosphereCompatible = atmosphereCompatible;
        this.presenceVie = presenceVie;
        this.presenceEau = presenceEau;
        this.gravite = gravite;
        this.temperatureMin = temperatureMin;
        this.temperatureMax = temperatureMax;
        this.temperatureMoy = temperatureMoy;
        this.distanceDeLaTerre = distanceDeLaTerre;
        this.pointageCompatibilite = pointageCompatibilite;
    }

    public double getGravite() {
        return gravite;
    }

}
