package edu.cftic.sql_app.vista;



import android.util.Log;
import android.view.View;

import java.util.Collections;
import java.util.Comparator;

import edu.cftic.sql_app.dto.Coche;

public class ComparadorCoches implements Comparator<Coche> {


    @Override
    public int compare(Coche coche, Coche t1) {
        return coche.getId()-t1.getId();
    }
}

