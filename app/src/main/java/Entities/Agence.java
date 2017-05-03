package Entities;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Agence {

    private int nIdAgence;
    private String strNom, strLogin, strMdp;
    private float fChiffreAffaire;

    public void Agence (String strNom, String strLogin, String strMdp, float fChiffreAffaire){
        this.strNom = strNom;
        this.strLogin = strLogin;
        this.strMdp = strMdp;
        this.fChiffreAffaire = fChiffreAffaire;
    }


}
