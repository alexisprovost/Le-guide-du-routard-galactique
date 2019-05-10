package ca.qc.bdeb.prog2.leguideduroutardgalactique.corpsceleste;

import java.io.Serializable;

/**
 * @author Lyssandre Chrzaszcz DA: 1844687
 * @author Alexis Provost DA: 1850986
 *
 */
public abstract class CorpsCeleste implements Serializable {

    private static int idSequentiel = 1;

    protected String nom;
    protected int id;
    protected double rayon;

    /**
     * Constructeur Corps Celeste
     * @param nom Nom du corps celeste
     * @param rayon rayon du corps celeste
     */
    public CorpsCeleste(String nom, double rayon) {
        this.id = idSequentiel++;
        this.nom = nom;
        this.rayon = rayon;
    }

    /**
     * Getter nom
     * @return nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * getter ID
     * @return ID
     */
    public int getId() {
        return id;
    }

    /**
     * Setter ID
     * @param id ID
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Setter rayon
     * @param rayon Rayon 
     */
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Setter nom
     * @param nom Nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * To String utilisé par lune
     * @return Valeurs a afficher
     */
    @Override
    public String toString() {
        return "\nID: " + id + "\n"
                + "Nom: " + nom + "\n"
                + "Rayon: " + rayon;
    }
}
