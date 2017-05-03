package eni.fr.lokacarapp.Entities;

import android.media.Image;

import java.io.Serializable;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Car_Image implements Serializable{

    private Car car;
    private String strRemarque;
    private Image image;


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getStrRemarque() {
        return strRemarque;
    }

    public void setStrRemarque(String strRemarque) {
        this.strRemarque = strRemarque;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Car_Image(Car car, String strRemarque, Image image){
        this.car = car;
        this.strRemarque = strRemarque;
        this.image = image;

    }





}
