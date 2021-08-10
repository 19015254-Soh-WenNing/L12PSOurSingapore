package sg.edu.rp.c346.id19015254.oursingapore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Island> islandList;

    public CustomAdapter(Context context, int resource, ArrayList<Island> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        islandList = objects;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvArea = rowView.findViewById(R.id.textViewArea);
        RatingBar rbStar = rowView.findViewById(R.id.ratingBar3);
        //TextView tvStar = rowView.findViewById(R.id.textViewStar);
        TextView tvDesc = rowView.findViewById(R.id.textViewDesc);
        //ImageView ivNew = rowView.findViewById(R.id.imageViewNew);

        Island currentIsland = islandList.get(position);

        tvName.setText(currentIsland.getName());
        tvArea.setText(String.valueOf(currentIsland.getArea()));
        rbStar.setRating(currentIsland.getStars());
        //tvStar.setText(currentSong.toString());
        tvDesc.setText(currentIsland.getDesc());

        /*if (currentIsland.Area() > 2018)
        {
            ivNew.setImageResource(R.drawable.newsong);
        }
        else
        {
            ivNew.setVisibility(View.INVISIBLE);
        }*/

        return rowView;
    }
}
