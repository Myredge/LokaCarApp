package Entities;

import android.os.Parcel;
import android.os.Parcelable;
import android.provider.ContactsContract;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Client implements Parcelable{

    private String strNom, strPrenom, strAdresse, strVille, strTel;
    private int nIdClient, nCodePostale;
    private ContactsContract.CommonDataKinds.Email email;


    protected Client(Parcel in) {
        strNom = in.readString();
        strPrenom = in.readString();
        strAdresse = in.readString();
        strVille = in.readString();
        strTel = in.readString();
        nIdClient = in.readInt();
        nCodePostale = in.readInt();
    }

    public static final Creator<Client> CREATOR = new Creator<Client>() {
        @Override
        public Client createFromParcel(Parcel in) {
            return new Client(in);
        }

        @Override
        public Client[] newArray(int size) {
            return new Client[size];
        }
    };

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(strNom);
        dest.writeString(strPrenom);
        dest.writeString(strAdresse);
        dest.writeString(strVille);
        dest.writeString(strTel);
        dest.writeInt(nIdClient);
        dest.writeInt(nCodePostale);
    }
}
