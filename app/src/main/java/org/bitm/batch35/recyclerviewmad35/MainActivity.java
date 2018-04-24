package org.bitm.batch35.recyclerviewmad35;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MovieAdapter adapter;
    private Movie movie;
    private List<Movie>movies = new ArrayList<>();
    private List<Object>listObject = new ArrayList<>();
    private ItemAdapter itemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        generateObjectList();
        movie = new Movie();
        adapter = new MovieAdapter(movie.generateMovieList());
        itemAdapter = new ItemAdapter(listObject);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        GridLayoutManager glm = new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(llm);

        recyclerView.setAdapter(itemAdapter);
    }

    private void generateObjectList() {
        listObject.add(new Movie(R.drawable.car,"Titanic","Action/History"));
        listObject.add(new Movie(R.drawable.car,"Brave Heart","Action"));
        listObject.add(new Advertise(R.drawable.advertise1));
        listObject.add(new Movie(R.drawable.car,"Iron Man","Action"));
        listObject.add(new Advertise(R.drawable.advertise2));

        listObject.add(new Movie(R.drawable.car,"Avengers","Action/Sci-fi"));
        listObject.add(new Movie(R.drawable.car,"Conjouring","Horror"));
        listObject.add(new Advertise(R.drawable.advertise3));
    }
}
