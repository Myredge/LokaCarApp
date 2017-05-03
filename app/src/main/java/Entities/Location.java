package Entities;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Location implements Serializable{

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


    public Location(Agence agence, Car car, Client client, Date dateDebutLocation, Date dateFinLocation) {
        this.agence = agence;
        this.car = car;
        this.client = client;
        this.dateDebutLocation = dateDebutLocation;
        this.dateFinLocation = dateFinLocation;
    }
}
