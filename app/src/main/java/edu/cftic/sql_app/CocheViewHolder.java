package edu.cftic.sql_app;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import edu.cftic.sql_app.dto.Coche;

public class CocheViewHolder extends RecyclerView.ViewHolder {

    private TextView text_view_id;
    private TextView text_view_modelo;


    public CocheViewHolder(@NonNull View itemView) {

        super(itemView);
        text_view_id = (TextView)itemView.findViewById(R.id.lblid);
        text_view_modelo = (TextView)itemView.findViewById(R.id.lblmodelo);

    }


    public void cargarCocheEnHolder(Coche l) {
        text_view_id.setText("" + l.getId());
        text_view_modelo.setText(l.getModelo());

    }
}
