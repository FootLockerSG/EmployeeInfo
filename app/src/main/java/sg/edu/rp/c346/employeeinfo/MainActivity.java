package sg.edu.rp.c346.employeeinfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;

    ArrayList<MovieItem> alMovieList;

    CustomAdapter caMovie;

    Calendar date1;

    Calendar date2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvMovie = findViewById(R.id.listViewMovie);

        alMovieList = new ArrayList<>();

        MovieItem movie1 = new MovieItem("John","Software Technical Leader",3400.0);
        alMovieList.add(movie1);
        MovieItem movie2 = new MovieItem("May","Programmer",2200.0);
        alMovieList.add(movie2);

        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);

        lvMovie.setAdapter(caMovie);


    }



}
