package com.blackbirds.shakil.shakhawatrokomaryassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.blackbirds.shakil.shakhawatrokomaryassignment.Adapter.BookListAdapter;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Adapter.NewArrivalBookListAdapter;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.BookDetails;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.BookModels;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerNewArrival, recyclerExplore;
    LinearLayoutManager layoutManager;
    BookListAdapter adapter;
    NewArrivalBookListAdapter newArrivalBookListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerExplore = findViewById(R.id.recyclerExplore);
        recyclerExplore.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerExplore.setLayoutManager(layoutManager);
        generateItem();

        recyclerNewArrival = findViewById(R.id.recyclerNewArrival);
        recyclerNewArrival.setHasFixedSize(true);
        recyclerNewArrival.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        newArrivalItem();
    }

    private void generateItem() {
        List<BookDetails> itemModels = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            itemModels.add(new BookDetails(1, "আমার বই 1", "Amar Boi 1", "sdssddss", "হুমায়ুন আহমেদ 1", "পাললিক প্রকাশনী 1", 123.00, true, false, false, "BN", "custom image", 0));
        }
        adapter = new BookListAdapter(this, itemModels);
        recyclerExplore.setAdapter(adapter);
    }

    private void newArrivalItem() {
        List<BookDetails> itemModels = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            itemModels.add(new BookDetails(1, "আমার বই 1", "Amar Boi 1", "sdssddss", "হুমায়ুন আহমেদ 1", "পাললিক প্রকাশনী 1", 123.00, true, false, false, "BN", "custom image", 0));
        }
        newArrivalBookListAdapter = new NewArrivalBookListAdapter(this, itemModels);
        recyclerNewArrival.setAdapter(newArrivalBookListAdapter);
    }
}