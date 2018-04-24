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
 * Created by Mobile App Develop on 4/19/2018.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {
    private List<Movie> moviList;

    public MovieAdapter(List<Movie> moviList) {
        this.moviList = moviList;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.movie_row,parent,false);
        return new MovieViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.movieIV.setImageResource(moviList.get(position).getMovieImage());
        holder.movieNameTV.setText(moviList.get(position).getMovieName());
        holder.categoryTV.setText(moviList.get(position).getMovieCategory());
    }

    @Override
    public int getItemCount() {
        return moviList.size();
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

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    Toast.makeText(itemView.getContext(), moviList.get(position).getMovieName(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
