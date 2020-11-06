package com.cesar.mismascotas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Misfavoritos extends AppCompatActivity {

    ArrayList<Miperro> Listadogs;
    private RecyclerView rvMisfavoritos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mis_perros_favoritos);

        Toolbar miActionBarFavoritos = (Toolbar) findViewById(R.id.miActionBarFavoritos);

        setSupportActionBar(miActionBarFavoritos);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        rvMisfavoritos = (RecyclerView) findViewById(R.id.rvMisfavoritos);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        rvMisfavoritos.setLayoutManager(llm);
        inicializarlistaperros();
        inicializarAdaptador();

    }
    public void inicializarAdaptador(){
        DogsAdaptador adaptador = new DogsAdaptador(Listadogs);
        rvMisfavoritos.setAdapter(adaptador);
    }

    public void inicializarlistaperros(){
        Listadogs = new ArrayList<Miperro>();
        Listadogs.add(new Miperro("Tony",5,R.drawable.tony));
        Listadogs.add(new Miperro("Lenon",5,R.drawable.lenon));
        Listadogs.add(new Miperro("Duncan",5,R.drawable.duncan));
        Listadogs.add(new Miperro("Sabueso",5,R.drawable.dogbaby_119594));
        Listadogs.add(new Miperro("Beto",5,R.drawable.beto));

    }

}
