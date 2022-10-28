package com.flintcore.tarea_recipes.managers;

import android.content.res.Resources;

import com.flintcore.tarea_recipes.MainActivity;
import com.flintcore.tarea_recipes.R;
import com.flintcore.tarea_recipes.templates.data.Food;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//TODO Add left images
public class AppenderRecipesImageManager {

    private static AppenderRecipesImageManager manager;

    private List<Integer> breakFasts;
    private List<Integer> drinks;
    private List<Integer> middleFoods;
    private List<Integer> sweetFoods;
    private List<Integer> fastFoods;

    public static AppenderRecipesImageManager getManager() {
        if(Objects.isNull(manager)){
            manager = new AppenderRecipesImageManager();
        }

        return manager;
    }

    public List<Integer> getBreakFastList() {
        if (Objects.isNull(breakFasts)) {
            breakFasts = new ArrayList<>();

            breakFasts.add(R.drawable.mangu_img);
            breakFasts.add(R.drawable.panqueques_img);
            breakFasts.add(R.drawable.conflake_img);
            breakFasts.add(R.drawable.revoltillo_huevo);

        }

        return breakFasts;
    }

    public List<Integer> getDrinkList() {

        if (Objects.isNull(drinks)) {
            drinks = new ArrayList<>();

        }

        return drinks;
    }

    public List<Integer> getMiddleDayList() {
        if (Objects.isNull(middleFoods)) {
            middleFoods = new ArrayList<>();

        }

        return middleFoods;
    }

    public List<Integer> getSweetsList() {
        if (Objects.isNull(sweetFoods)) {
            sweetFoods = new ArrayList<>();

        }

        return sweetFoods;
    }

    public List<Integer> getFastFoodList() {
        if (Objects.isNull(fastFoods)) {
            fastFoods = new ArrayList<>();

            fastFoods.add(R.drawable.hamburger_img);
            fastFoods.add(R.drawable.papa_fritas);
            fastFoods.add(R.drawable.hot_dog_img);
        }

        return fastFoods;
    }

}
