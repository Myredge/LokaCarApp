package Entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Agence implements Parcelable{

    private int nIdAgence;
    private String strNom, strLogin, strMdp;
    private float fChiffreAffaire;


    public int getnIdAgence() {
        return nIdAgence;
    }

    public void setnIdAgence(int nIdAgence) {
        this.nIdAgence = nIdAgence;
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

    protected Agence(Parcel in) {
        nIdAgence = in.readInt();
        strNom = in.readString();
        strLogin = in.readString();
        strMdp = in.readString();
        fChiffreAffaire = in.readFloat();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(nIdAgence);
        dest.writeString(strNom);
        dest.writeString(strLogin);
        dest.writeString(strMdp);
        dest.writeFloat(fChiffreAffaire);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Agence> CREATOR = new Creator<Agence>() {
        @Override
        public Agence createFromParcel(Parcel in) {
            return new Agence(in);
        }

        @Override
        public Agence[] newArray(int size) {
            return new Agence[size];
        }
    };

    public void Agence (String strNom, String strLogin, String strMdp, float fChiffreAffaire){
        this.strNom = strNom;
        this.strLogin = strLogin;
        this.strMdp = strMdp;
        this.fChiffreAffaire = fChiffreAffaire;
    }


}
