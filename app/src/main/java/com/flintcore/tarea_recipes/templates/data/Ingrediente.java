package com.flintcore.tarea_recipes.templates.data;

import java.util.Locale;

public class Ingrediente {

    private int cantidad;

    private Medida tipo;

    private String ingrediente;

    public Ingrediente(int cantidad, Medida tipo, String ingrediente) {
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.ingrediente = ingrediente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getTipo() {
        return tipo.toString().toLowerCase(Locale.ROOT);
    }

    public String getIngrediente() {
        return ingrediente;
    }
}
