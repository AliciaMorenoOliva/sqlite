package edu.cftic.sql_app.vista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import edu.cftic.sql_app.AdapterCoches;
import edu.cftic.sql_app.R;
import edu.cftic.sql_app.dao.BaseDatosCochesPersona;
import edu.cftic.sql_app.dto.Coche;

public class MostrarListaCoches extends AppCompatActivity {

    private AdapterCoches adaptador;
    private ArrayList<Coche> datos;
    private BaseDatosCochesPersona baseDatosCochesPersona;

    private RecyclerView recView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_lista_coches);

        this.baseDatosCochesPersona = new BaseDatosCochesPersona(this, "MiDB", null, 1);


recView = (RecyclerView) findViewById(R.id.recview);

        datos = (ArrayList<Coche>) baseDatosCochesPersona.buscarCoches();
        adaptador = new AdapterCoches(datos);
        Log.d("MIAPP","" + datos);
        recView.setAdapter(adaptador);



        recView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL , false)) ; //estamos cargando los datos en cada linea
        recView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));//





    }


}
