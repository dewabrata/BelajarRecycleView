package com.juara.belajarrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView lstNama;
    List<ModelBiodata> lstData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstNama = findViewById(R.id.lstNama);

        lstData = new ArrayList<ModelBiodata>();

        ModelBiodata mb = new ModelBiodata();
        mb.setNama("Dewa");
        mb.setAlamat("Jl Pakuan Indah I Bogor");

        lstData.add(mb);

        mb = new ModelBiodata();
        mb.setNama("Dewi");
        mb.setAlamat("Jl Pakuan Indah III Bogor");

        lstData.add(mb);

        mb = new ModelBiodata();
        mb.setNama("Dewo");
        mb.setAlamat("Cielungsi Bogor");

        lstData.add(mb);

        AdapterListSimple adapter = new AdapterListSimple(MainActivity.this,lstData);

        lstNama.setLayoutManager(new LinearLayoutManager(this));
        lstNama.setItemAnimator(new DefaultItemAnimator());
        lstNama.setAdapter(adapter);



    }
}
