package Entities;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Car_Image implements Serializable{

    private Car car;
    private String strNom;
    private Image image;


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getStrNom() {
        return strNom;
    }

    public void setStrNom(String strNom) {
        this.strNom = strNom;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Car_Image(Car car, String strNom, Image image){
        this.car = car;
        this.strNom = strNom;
        this.image = image;

    }





}
