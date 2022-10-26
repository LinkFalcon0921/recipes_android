package com.flintcore.tarea_recipes.templates.data;

import java.util.List;

public class Food {

    private String name;

    private FoodType type;

    private List<Ingrediente> ingredientes;

    private String descripcion;

    private int imageRef;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getImageRef() {
        return imageRef;
    }

    public void setImageRef(int imageRef) {
        this.imageRef = imageRef;
    }
}
