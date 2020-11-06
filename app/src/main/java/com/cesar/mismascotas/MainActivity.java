package com.cesar.mismascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerviewdogs;
    private DogsAdaptador dgadaptador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        recyclerviewdogs=(RecyclerView)findViewById(R.id.rvDogs);
        recyclerviewdogs.setLayoutManager(new LinearLayoutManager(this));

        dgadaptador = new DogsAdaptador(misperros());
        recyclerviewdogs.setAdapter(dgadaptador);
    }
    public List<Miperro> misperros(){
        List<Miperro> pet= new ArrayList<>();
        pet.add(new Miperro("Sabueso",0,R.drawable.dogbaby_119594));
        pet.add(new Miperro("Beto",0,R.drawable.beto));
        pet.add(new Miperro("Cooter",0,R.drawable.cooter));
        pet.add(new Miperro("Duncan",0,R.drawable.duncan));
        pet.add(new Miperro("Fido",0,R.drawable.fido));
        pet.add(new Miperro("lenon",0,R.drawable.lenon));
        pet.add(new Miperro("Tony",0,R.drawable.tony));

        return pet;
    }

    public void irMisfavoritos(View v) {
        Intent intent = new Intent(this, Misfavoritos.class);
        startActivity(intent);
    }

}