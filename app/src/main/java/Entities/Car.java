package Entities;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Car {
    private int nIdCar, nbPlaces;
    private String strPlaque, strMarque, strModele;
    private float fPrixJour;
    private boolean boolVille, boolFamiliale;
    private Agence agence;

    public void Car( String strPlaque, String strMarque, String strModele, Float fPrixJour, boolean boolVille, boolean boolFamiliale, Agence agence)
    {
        this.strPlaque = strPlaque;
        this.strMarque = strMarque;
        this.strModele = strModele;
        this.fPrixJour = fPrixJour;
        this.boolVille = boolVille;
        this.boolFamiliale = boolFamiliale;
        this.agence = agence;
    }



}
