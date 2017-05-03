package eni.fr.lokacarapp.Entities;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Location implements Serializable{

    private Agence Agence;
    private Car Car;
    private Client Client;
    private Date dateDebutLocation, dateFinLocation;


    public Agence getAgence() {
        return Agence;
    }

    public void setAgence(Agence agence) {
        this.Agence = agence;
    }

    public Car getCar() {
        return Car;
    }

    public void setCar(Car car) {
        this.Car = car;
    }

    public Client getClient() {
        return Client;
    }

    public void setClient(Client client) {
        this.Client = client;
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
        this.Agence = agence;
        this.Car = car;
        this.Client = client;
        this.dateDebutLocation = dateDebutLocation;
        this.dateFinLocation = dateFinLocation;
    }
}
