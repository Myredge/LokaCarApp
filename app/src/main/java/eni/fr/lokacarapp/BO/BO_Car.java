package eni.fr.lokacarapp.BO;

import eni.fr.lokacarapp.Entities.Car;

/**
 * Created by gpensec2015 on 03/05/2017.
 */

public class BO_Car {

    public void AddCar(){

    }

public void AddCar(Car car) {

   /* JSONObject jsonObject = new JSONObject();
    try {
        jsonObject.put("strPlaque", car.getPlaque());
        jsonObject.put("strMarque", car.getStrMarque());
        jsonObject.put("strModele", car.getModele());
        jsonObject.put("nbPlaces", car.getNbPlaces());
        jsonObject.put("fPrixJour", car.getfPrixJour());
        jsonObject.put("agence", car.getAgence());

        //retrofit ou volley

        HttpResponse response = Unirest.post("https://lokacar-c23b.restdb.io/rest/car")
                .header("content-type", "application/json")
                .header("x-apikey", "97d51d8956a3cb48a19f4edb1f1d1659a963d")
                .header("cache-control", "no-cache")
                .body(jsonObject.toString())
                .asString();

    } catch (JSONException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();

    }
    */
}


}
