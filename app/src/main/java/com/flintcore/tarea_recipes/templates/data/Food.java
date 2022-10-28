package com.flintcore.tarea_recipes.templates.data;

import com.flintcore.tarea_recipes.R;

import java.util.List;
import java.util.Locale;

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

    public FoodType getType() {
        return type;
    }

    public void setType(FoodType type) {
        this.type = type;
    }

    public enum Names{
        MANGU(R.string.mangu_description),
        PANQUEQUES(R.string.panqueques_description),
        CONFLAKE(R.string.conflake_description),
        REVOLTILLO_DE_HUEVOS(R.string.revoltillo_huevo_description),
        HAMBURGUESA(R.string.hamburguesa_description),
        PAPAS_FRITAS(R.string.papas_fritas_description),
        HOT_DOGS(R.string.hot_dogs_description),
        JUGOS_DE_NARANJA(R.string.jugo_description),
        JUGO_DE_GUAYABA(R.string.jugo_description),
        BATIDA_DE_FRESAS(R.string.batida_description),
        BATIDA_DE_MANGO(R.string.batida_description),
        PASTELES_EN_HOJA(R.string.pasteles_hoja_description),
        QUIPE(R.string.quipe_description),
        ARROZ(R.string.arroz_description),
        PASTEL_DE_CHOCOLATE(R.string.pastel_chocolate_description),
        HELADO(R.string.helado_description),
        ARROZ_CON_LECHE(R.string.arroz_leche_description),
        AREPA(R.string.arepa_description);

        private int description;

        Names(int idDescription){
            this.description = idDescription;
        }

        public int getDescription(){
            return this.description;
        }

        public String getName(){
            return this.name().replace('_', ' ')
                    .toLowerCase(Locale.ROOT);
        }

    }
}
