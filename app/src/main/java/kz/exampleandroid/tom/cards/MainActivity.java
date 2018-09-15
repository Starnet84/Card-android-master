package kz.exampleandroid.tom.cards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<News> newsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialNews();

        RecyclerView recyclerView = findViewById(R.id.mc_content_rv);
       /* RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);*/


        CardRecyclerAdapter adapter = new CardRecyclerAdapter(newsList);
        recyclerView.setAdapter(adapter);
    }

    private void initialNews() {
        newsList = new ArrayList<>();
        newsList.add(new News("Природа", getString(R.string.text2), R.mipmap.flawer));
        newsList.add(new News("Музыка", getString(R.string.text3), R.mipmap.images));
        newsList.add(new News("Кино", getString(R.string.text1), R.mipmap.panda));
        newsList.add(new News("Детское", getString(R.string.text2), R.mipmap.minon));
        newsList.add(new News("Спорт", getString(R.string.text1), R.mipmap.mu));
        newsList.add(new News("Детское", getString(R.string.text3), R.mipmap.minon));
    }
}
