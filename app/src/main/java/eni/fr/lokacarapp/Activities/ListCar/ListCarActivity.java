package eni.fr.lokacarapp.Activities.ListCar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import eni.fr.lokacarapp.Entities.Agence;
import eni.fr.lokacarapp.Entities.Car;
import eni.fr.lokacarapp.R;

public class ListCarActivity extends AppCompatActivity {

    private List<Car> carsList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_car);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        GridView gridViewData = (GridView) findViewById(R.id.gridViewCars);

        Agence ag =  new Agence("Agence Momo", "test", "test", 148521);
        carsList.add(new Car("75CFD92", "peugeot", "508", (float) 50, true, true, ag));
        carsList.add(new Car("75CFD92", "peugeot", "508", (float) 50, true, true, ag));
        carsList.add(new Car("75CFD92", "peugeot", "508", (float) 50, true, true, ag));
        carsList.add(new Car("75CFD92", "peugeot", "508", (float) 50, true, true, ag));

        //gridViewData.setAdapter(new ArrayAdapter<Restaurant>(ListingActivity.this, R.layout.item_restaurant, restaurantList));
        gridViewData.setAdapter(new CarAdapter(ListCarActivity.this, R.layout.item_car, carsList));

        /*gridViewData.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ListingActivity.this, DetailsActivity.class);

                Bundle bundle = new Bundle();
                bundle.putSerializable(Constant.INTENT_OBJECT, restaurantList.get(position));
                intent.putExtras(bundle);

                startActivity(intent);*/





    }

}
