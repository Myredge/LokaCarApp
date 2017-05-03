package Entities;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;

import java.io.Serializable;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Client implements Serializable{

    private String strNom, strPrenom, strAdresse, strVille, strTel;
    private int nIdClient, nCodePostale;
    private ContactsContract.CommonDataKinds.Email email;


    public String getStrNom() {
        return strNom;
    }

    public void setStrNom(String strNom) {
        this.strNom = strNom;
    }

    public String getStrPrenom() {
        return strPrenom;
    }

    public void setStrPrenom(String strPrenom) {
        this.strPrenom = strPrenom;
    }

    public String getStrAdresse() {
        return strAdresse;
    }

    public void setStrAdresse(String strAdresse) {
        this.strAdresse = strAdresse;
    }

    public String getStrVille() {
        return strVille;
    }

    public void setStrVille(String strVille) {
        this.strVille = strVille;
    }

    public String getStrTel() {
        return strTel;
    }

    public void setStrTel(String strTel) {
        this.strTel = strTel;
    }

    public int getnIdClient() {
        return nIdClient;
    }

    public void setnIdClient(int nIdClient) {
        this.nIdClient = nIdClient;
    }

    public int getnCodePostale() {
        return nCodePostale;
    }

    public void setnCodePostale(int nCodePostale) {
        this.nCodePostale = nCodePostale;
    }

    public ContactsContract.CommonDataKinds.Email getEmail() {
        return email;
    }

    public void setEmail(ContactsContract.CommonDataKinds.Email email) {
        this.email = email;
    }

    public Client(String strNom, String strPrenom, String strAdresse, String strVille, String strTel, int nCodePostale, ContactsContract.CommonDataKinds.Email email)
    {
        this.strNom = strNom;
        this.strPrenom = strPrenom;
        this.strAdresse = strAdresse;
        this.strVille = strVille;
        this.nCodePostale = nCodePostale;
        this.strTel = strTel;
        this.email = email;
    }

}
