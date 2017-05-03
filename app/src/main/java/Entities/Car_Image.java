package Entities;

import android.media.Image;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class Car_Image implements Parcelable{

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

    protected Car_Image(Parcel in) {
        car = in.readParcelable(Car.class.getClassLoader());
        strNom = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(car, flags);
        dest.writeString(strNom);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Car_Image> CREATOR = new Creator<Car_Image>() {
        @Override
        public Car_Image createFromParcel(Parcel in) {
            return new Car_Image(in);
        }

        @Override
        public Car_Image[] newArray(int size) {
            return new Car_Image[size];
        }
    };

    public void Car_Image(Car car, String strNom, Image image){
        this.car = car;
        this.strNom = strNom;
        this.image = image;

    }





}
