package Entities;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Location implements Parcelable{

    private Agence agence;
    private Car car;
    private Client client;
    private Date dateDebutLocation, dateFinLocation;


    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateDebutLocation() {
        return dateDebutLocation;
    }

    public void setDateDebutLocation(Date dateDebutLocation) {
        this.dateDebutLocation = dateDebutLocation;
    }

    public Date getDateFinLocation() {
        return dateFinLocation;
    }

    public void setDateFinLocation(Date dateFinLocation) {
        this.dateFinLocation = dateFinLocation;
    }

    protected Location(Parcel in) {
        car = in.readParcelable(Car.class.getClassLoader());
        client = in.readParcelable(Client.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(car, flags);
        dest.writeParcelable(client, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Location> CREATOR = new Creator<Location>() {
        @Override
        public Location createFromParcel(Parcel in) {
            return new Location(in);
        }

        @Override
        public Location[] newArray(int size) {
            return new Location[size];
        }
    };
}
