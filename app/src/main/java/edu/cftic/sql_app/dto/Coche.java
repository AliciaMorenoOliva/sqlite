package edu.cftic.sql_app.dto;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by vale on 1/06/16.
 */
public class Coche implements Comparable {

    private int id;
    private String modelo;
    private Persona persona;

    /**
     *
     * @param o es un coche
     * @return número negativo si o es mayor que this
     *         número positivo si this es mayor que o
     *         0 si son iguales
     */
    @Override
    public int compareTo(Object o) {
        int resultado = 0;

        Coche c = (Coche)o;
        //resultado = this.modelo.compareTo(c.modelo) * (-1);
        resultado = c.modelo.compareTo(this.modelo);

        return resultado;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public static void main (String [] args)
    {
        List<Coche> cocheList = new ArrayList<Coche>();
        Coche coche1 = new Coche(1, "Ferrari");
        Coche coche2 = new Coche(2, "Renault");
        Coche coche3 = new Coche(3, "Fiat");
        cocheList.add(coche1);
        cocheList.add(coche2);
        cocheList.add(coche3);

        Collections.sort(cocheList);//ORDENO
        for (Coche coche : cocheList)
        {
            System.out.println(coche);
        }
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Coche(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
    }

    public Coche(String modelo) {
        this.modelo = modelo;
    }

    public Persona getPersona() {
        return persona;
    }

    public Coche() {
    }

    public Coche(String modelo, Persona persona) {
        this.modelo = modelo;
        this.persona = persona;
    }
}

