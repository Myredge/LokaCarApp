package eni.fr.lokacarapp.Entities;

import java.io.Serializable;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Car implements Serializable {
    private int nIdCar, nbPlaces;
    private String strPlaque, strMarque, modele;
    private float fPrixJour;
    private boolean boolVille, boolFamiliale;
    private Agence agence;

    public int getnIdCar() {
        return nIdCar;
    }

    public void setnIdCar(int nIdCar) {
        this.nIdCar = nIdCar;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public String getPlaque() {
        return strPlaque;
    }

    public void setPlaque(String plaque) {
        this.strPlaque = plaque;
    }

    public String getStrMarque() {
        return strMarque;
    }

    public void setStrMarque(String strMarque) {
        this.strMarque = strMarque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public float getfPrixJour() {
        return fPrixJour;
    }

    public void setfPrixJour(float fPrixJour) {
        this.fPrixJour = fPrixJour;
    }

    public boolean isBoolVille() {
        return boolVille;
    }

    public void setBoolVille(boolean boolVille) {
        this.boolVille = boolVille;
    }

    public boolean isBoolFamiliale() {
        return boolFamiliale;
    }

    public void setBoolFamiliale(boolean boolFamiliale) {
        this.boolFamiliale = boolFamiliale;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }


    public Car(String plaque, String strMarque, String strModele, Float fPrixJour, boolean boolVille, boolean boolFamiliale, Agence agence)
    {
        this.strPlaque = plaque;
        this.strMarque = strMarque;
        this.modele = strModele;
        this.fPrixJour = fPrixJour;
        this.boolVille = boolVille;
        this.boolFamiliale = boolFamiliale;
        this.agence = agence;
    }



}
