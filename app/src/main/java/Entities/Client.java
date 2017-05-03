package Entities;

import android.provider.ContactsContract;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Client {

    private String strNom, strPrenom, strAdresse, strVille, strTel;
    private int nIdClient, nCodePostale;
    private ContactsContract.CommonDataKinds.Email email;


    public void Client(String strNom, String strPrenom, String strAdresse, String strVille, String strTel, int nCodePostale, ContactsContract.CommonDataKinds.Email email)
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
