package Entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Car implements Parcelable{
    private int nIdCar, nbPlaces;
    private String strPlaque, strMarque, strModele;
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

    public String getStrPlaque() {
        return strPlaque;
    }

    public void setStrPlaque(String strPlaque) {
        this.strPlaque = strPlaque;
    }

    public String getStrMarque() {
        return strMarque;
    }

    public void setStrMarque(String strMarque) {
        this.strMarque = strMarque;
    }

    public String getStrModele() {
        return strModele;
    }

    public void setStrModele(String strModele) {
        this.strModele = strModele;
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



    protected Car(Parcel in) {
        nIdCar = in.readInt();
        nbPlaces = in.readInt();
        strPlaque = in.readString();
        strMarque = in.readString();
        strModele = in.readString();
        fPrixJour = in.readFloat();
        boolVille = in.readByte() != 0;
        boolFamiliale = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(nIdCar);
        dest.writeInt(nbPlaces);
        dest.writeString(strPlaque);
        dest.writeString(strMarque);
        dest.writeString(strModele);
        dest.writeFloat(fPrixJour);
        dest.writeByte((byte) (boolVille ? 1 : 0));
        dest.writeByte((byte) (boolFamiliale ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Car> CREATOR = new Creator<Car>() {
        @Override
        public Car createFromParcel(Parcel in) {
            return new Car(in);
        }

        @Override
        public Car[] newArray(int size) {
            return new Car[size];
        }
    };

    public void Car(String strPlaque, String strMarque, String strModele, Float fPrixJour, boolean boolVille, boolean boolFamiliale, Agence agence)
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
