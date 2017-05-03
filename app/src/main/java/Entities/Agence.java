package Entities;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Agence implements Serializable{

    public int IdAgence;
    public String strNom, strLogin, strMdp;
    public float fChiffreAffaire;


    public int getnIdAgence() {
        return IdAgence;
    }

    public void setnIdAgence(int nIdAgence) {
        this.IdAgence = nIdAgence;
    }

    public String getStrNom() {
        return strNom;
    }

    public void setStrNom(String strNom) {
        this.strNom = strNom;
    }

    public String getStrLogin() {
        return strLogin;
    }

    public void setStrLogin(String strLogin) {
        this.strLogin = strLogin;
    }

    public String getStrMdp() {
        return strMdp;
    }

    public void setStrMdp(String strMdp) {
        this.strMdp = strMdp;
    }

    public float getfChiffreAffaire() {
        return fChiffreAffaire;
    }

    public void setfChiffreAffaire(float fChiffreAffaire) {
        this.fChiffreAffaire = fChiffreAffaire;
    }

    public Agence (String strNom, String strLogin, String strMdp, float fChiffreAffaire){
        this.strNom = strNom;
        this.strLogin = strLogin;
        this.strMdp = strMdp;
        this.fChiffreAffaire = fChiffreAffaire;
    }
}
