package eni.fr.lokacarapp.Activities.ListCar;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import eni.fr.lokacarapp.Entities.Car;
import eni.fr.lokacarapp.R;

/**
 * Created by mleblanc2015 on 26/04/2017.
 */

public class CarAdapter extends ArrayAdapter<Car> {

    private LayoutInflater inflater;
    private int resId;

    public CarAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Car> objects) {
        super(context, resource, objects);

        inflater = LayoutInflater.from(context);
        resId = resource; // R.layout.item_restaurant
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;

        if(convertView == null)
        {
            convertView = inflater.inflate(resId, null);

            viewHolder = new ViewHolder();
            viewHolder.textViewItemPrice = (TextView) convertView.findViewById(R.id.textViewItemPrice);
            viewHolder.textViewMarqueModel = (TextView) convertView.findViewById(R.id.textViewItemTitle);
            viewHolder.textViewItemImmatriculation = (TextView) convertView.findViewById(R.id.textViewItemImmatriculation);

            convertView.setTag(viewHolder);

        }else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        Car item = getItem(position);
        try {
            String price = item.getfPrixJour() + "/ j";
            viewHolder.textViewItemPrice.setText(price);
        }catch(Exception e){}

        viewHolder.textViewMarqueModel.setText(item.getStrMarque()+" "+item.getModele());
        viewHolder.textViewItemImmatriculation.setText(item.getPlaque());

        return convertView;
    }

    class ViewHolder{
        TextView textViewMarqueModel, textViewItemImmatriculation, textViewItemPrice;

    }
}
