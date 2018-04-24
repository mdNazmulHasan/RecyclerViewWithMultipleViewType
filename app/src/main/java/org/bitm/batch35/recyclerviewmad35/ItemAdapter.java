package org.bitm.batch35.recyclerviewmad35;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by Mobile App Develop on 4/22/2018.
 */

public class ItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<Object>listItems;
    private static final int MOVIE = 1;
    private static final int ADVERTISE = 2;

    public ItemAdapter(List<Object> listItems) {
        this.listItems = listItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RecyclerView.ViewHolder viewHolder = null;
        switch (viewType){
            case MOVIE:
                View v = inflater.inflate(R.layout.movie_row,parent,false);
                viewHolder = new MovieViewHolder(v);
                break;
            case ADVERTISE:
                View v1 = inflater.inflate(R.layout.ad_row,parent,false);
                viewHolder = new AdvertiseHolder(v1);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()){
            case MOVIE:
                Movie movie = (Movie) listItems.get(position);
                MovieViewHolder mvh = (MovieViewHolder) holder;
                mvh.movieNameTV.setText(movie.getMovieName());
                mvh.categoryTV.setText(movie.getMovieCategory());
                mvh.movieIV.setImageResource(movie.getMovieImage());
                break;
            case ADVERTISE:
                Advertise advertise = (Advertise) listItems.get(position);
                AdvertiseHolder adh = (AdvertiseHolder) holder;
                adh.adImageView.setImageResource(advertise.getAdvertiseImage());
                break;
        }
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    @Override
    public int getItemViewType(int position) {
        //POSITION --> ITEM POSITION IN COLLECTION
        if(listItems.get(position) instanceof Movie){
            return MOVIE;
        }else if(listItems.get(position) instanceof Advertise){
            return ADVERTISE;
        }
        return -1;
    }

    public class AdvertiseHolder extends RecyclerView.ViewHolder{
        ImageView adImageView;
        public AdvertiseHolder(View itemView) {
            super(itemView);
            adImageView = itemView.findViewById(R.id.adIV);
        }
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        ImageView movieIV;
        TextView movieNameTV;
        TextView categoryTV;
        public MovieViewHolder(final View itemView) {
            super(itemView);
            movieIV = itemView.findViewById(R.id.movieIV);
            movieNameTV = itemView.findViewById(R.id.movieNameInput);
            categoryTV = itemView.findViewById(R.id.movieCategoryInput);
        }
    }
}
