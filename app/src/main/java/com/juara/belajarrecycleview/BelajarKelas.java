package com.juara.belajarrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BelajarKelas extends AppCompatActivity {
RecyclerView lstBelajar;
List<ModelBelajar> lstModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_kelas);

        lstBelajar = findViewById(R.id.lstBelajar);

        lstModel = new ArrayList<ModelBelajar>();

        ModelBelajar mb = new ModelBelajar();
        mb.setNamaKelas("Kelas 1");
        mb.setTglKelas("12-12-2020");
        mb.setJamKelas("19:00");
        lstModel.add(mb);

        mb = new ModelBelajar();
        mb.setNamaKelas("Kelas 2");
        mb.setTglKelas("13-12-2020");
        mb.setJamKelas("19:00");
        lstModel.add(mb);
        mb = new ModelBelajar();
        mb.setNamaKelas("Kelas 2");
        mb.setTglKelas("13-12-2020");
        mb.setJamKelas("19:00");
        lstModel.add(mb);
        mb = new ModelBelajar();
        mb.setNamaKelas("Kelas 2");
        mb.setTglKelas("13-12-2020");
        mb.setJamKelas("19:00");
        lstModel.add(mb);


        AdapterBelajarList adapter = new AdapterBelajarList(BelajarKelas.this,lstModel);

        lstBelajar.setLayoutManager(new LinearLayoutManager(this));
        lstBelajar.setItemAnimator(new DefaultItemAnimator());
        lstBelajar.setAdapter(adapter);
    }
}
