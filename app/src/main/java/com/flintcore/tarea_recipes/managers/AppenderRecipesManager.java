package com.flintcore.tarea_recipes.managers;

import android.content.res.Resources;

import com.flintcore.tarea_recipes.R;
import com.flintcore.tarea_recipes.templates.data.Food;
import com.flintcore.tarea_recipes.templates.data.FoodType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

//TODO add left foods
public class AppenderRecipesManager {

    public static final char SPACE_CHAR = '\u0020';
    public static final char ENUM_SEPARATOR_CHAR = '_';
    private static AppenderRecipesManager manager;

    private final Resources resources;
    private List<Food> breakFasts;
    private List<Food> drinks;
    private List<Food> middleFoods;
    private List<Food> sweetFoods;
    private List<Food> fastFoods;

    private AppenderRecipesManager(Resources res) {
        this.resources = res;
    }

    public static AppenderRecipesManager getManager() {
        return manager;
    }

    public static void initClass(Resources res) {
        if (Objects.isNull(manager)) {
            manager = new AppenderRecipesManager(res);
        }
    }

    public List<Food> getBreakFastList() {
        if (Objects.isNull(breakFasts)) {

            String[] array = this.resources.getStringArray(R.array.desayuno_lista);

            this.breakFasts = Arrays.stream(array)
                    .map(Food::new)
                    .peek(f -> f.setType(FoodType.DESAYUNO))
                    .collect(Collectors.toList());

            for (Food f : breakFasts) {
                String name = f.getName().replace(SPACE_CHAR, ENUM_SEPARATOR_CHAR).toUpperCase(Locale.ROOT);
                Food.Names foodNameValue = Food.Names.valueOf(name);
                this.setDescription(f, foodNameValue);

            }
        }


        return breakFasts;
    }

    public List<Food> getDrinkList() {

        if (Objects.isNull(drinks)) {
            drinks = new ArrayList<>();

            String[] array = this.resources.getStringArray(R.array.bebidas_lista);

            this.drinks = Arrays.stream(array)
                    .map(Food::new)
                    .peek(f -> f.setType(FoodType.BEBIDA))
                    .collect(Collectors.toList());

            for (Food f : drinks) {
                String name = f.getName().replace(SPACE_CHAR, ENUM_SEPARATOR_CHAR);
                Food.Names foodNameValue = Food.Names.valueOf(name);
                this.setDescription(f, foodNameValue);
            }
        }

        return drinks;
    }

    public List<Food> getMiddleDayList() {
        if (Objects.isNull(middleFoods)) {
            middleFoods = new ArrayList<>();

            String[] array = this.resources.getStringArray(R.array.mediodia_lista);

            this.middleFoods = Arrays.stream(array)
                    .map(Food::new)
                    .peek(f -> f.setType(FoodType.PLATO_DE_MEDIODIA))
                    .collect(Collectors.toList());

            for (Food f : middleFoods) {
                String name = f.getName().replace(SPACE_CHAR, ENUM_SEPARATOR_CHAR);
                Food.Names foodNameValue = Food.Names.valueOf(name);
                this.setDescription(f, foodNameValue);
            }
        }

        return middleFoods;
    }

    public List<Food> getSweetsList() {
        if (Objects.isNull(sweetFoods)) {
            sweetFoods = new ArrayList<>();

            String[] array = this.resources.getStringArray(R.array.mediodia_lista);

            this.sweetFoods = Arrays.stream(array)
                    .map(Food::new)
                    .peek(f -> f.setType(FoodType.PLATO_DE_MEDIODIA))
                    .collect(Collectors.toList());

            for (Food f : sweetFoods) {
                String name = f.getName().replace(SPACE_CHAR, ENUM_SEPARATOR_CHAR);
                Food.Names foodNameValue = Food.Names.valueOf(name);
                this.setDescription(f, foodNameValue);
            }
        }

        return sweetFoods;
    }

    public List<Food> getFastFoodList() {
        if (Objects.isNull(fastFoods)) {
            fastFoods = new ArrayList<>();

            String[] array = this.resources.getStringArray(R.array.comida_rapida_lista);

            this.fastFoods = Arrays.stream(array)
                    .map(Food::new)
                    .peek(f -> f.setType(FoodType.COMIDA_RAPIDA))
                    .collect(Collectors.toList());

            for (Food f : fastFoods) {
                String name = f.getName().replace(SPACE_CHAR, ENUM_SEPARATOR_CHAR);
                Food.Names foodNameValue = Food.Names.valueOf(name);
                this.setDescription(f, foodNameValue);
            }
        }

        return fastFoods;
    }

    private void setDescription(Food f, Food.Names foodName) {
        String resource = this.resources.getString(foodName.getDescription());

        f.setDescripcion(resource);
    }
}
