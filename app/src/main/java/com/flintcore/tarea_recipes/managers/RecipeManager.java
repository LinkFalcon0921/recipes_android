package com.flintcore.tarea_recipes.managers;

import com.flintcore.tarea_recipes.templates.views.RecipeGridItem;

import java.util.ArrayList;
import java.util.List;

public class RecipeManager {

    private List<Integer> imagesRecipes;

    private List<Integer> namesRecipes;

    private final List<RecipeGridItem> items;

    public RecipeManager() {
        items = new ArrayList<>(5);

        init();
    }

    private void init() {
//        Init the id list
    }
}
