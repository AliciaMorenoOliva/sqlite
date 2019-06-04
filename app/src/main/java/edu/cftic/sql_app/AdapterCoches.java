package edu.cftic.sql_app;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import edu.cftic.sql_app.dto.Coche;


//esta clase provee los datos al recicle
public class AdapterCoches extends RecyclerView.Adapter<CocheViewHolder> {

//para guardar la lista
    private ArrayList<Coche> datos;


    //Creo la vista, con el Holder dentro

    //aqui estoy creando cada elemento de la vista

    @Override
    public CocheViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CocheViewHolder cocheViewHolder = null;

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View itemView = inflater.inflate(R.layout.layout_coche_item, parent, false);

     cocheViewHolder  = new CocheViewHolder(itemView);

        return cocheViewHolder;
    }

    //Al holder, le meto la info de coche que toca
    @Override
    public void onBindViewHolder(@NonNull CocheViewHolder holder, int position) {

        Coche coche = datos.get(position);
        holder.cargarCocheEnHolder(coche);

    }
//pide el numero de coches para crear el numero de lines de la lista
    @Override
    public int getItemCount() {
        return datos.size();
    }

    public AdapterCoches(ArrayList<Coche> coches)
    {
        this.datos = coches;
    }
}
