package com.flintcore.tarea_recipes;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.flintcore.tarea_recipes.managers.AppenderRecipesImageManager;
import com.flintcore.tarea_recipes.managers.AppenderRecipesManager;
import com.flintcore.tarea_recipes.templates.data.Food;
import com.flintcore.tarea_recipes.templates.onClick.SpinnerListener;
import com.flintcore.tarea_recipes.templates.views.RecipeGridItem;
import com.flintcore.tarea_recipes.util.adapter.SpinnerValues;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityResultCallback<ActivityResult> activityResultActivityResultCallback;

    private Spinner foodSpinner;

    private SpinnerValues values;

    private GridRecipesManager gridRecipesManager;

    private AppenderRecipesManager foodsManager;

    private AppenderRecipesImageManager imageManager;
    private SpinnerListener spinnerListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.gridRecipesManager = new GridRecipesManager();
        appendFragment(this.gridRecipesManager);

//        Initiate data managers
        AppenderRecipesManager.initClass(getResources());
        foodsManager = AppenderRecipesManager.getManager();

        this.values = new SpinnerValues(this, R.array.comida_lista);
        this.foodSpinner = findViewById(R.id.food_selector);

        this.foodSpinner.setAdapter(this.values.getAdapter());

        imageManager = AppenderRecipesImageManager.getManager();

        List<RecipeGridItem> gridItems = new ArrayList<>();

        addToList(gridItems,
                imageManager.getBreakFastList(),
                foodsManager.getBreakFastList());

        spinnerListener = new SpinnerListener(gridItems,
                this.gridRecipesManager);

        this.foodSpinner.setOnItemSelectedListener(spinnerListener);
    }

    private void addToList(List<RecipeGridItem> list, List<Integer> images, List<Food> foods) {
        list.add(getRecipeGridItem(images, foods));
    }

    @NonNull
    private RecipeGridItem getRecipeGridItem(List<Integer> images, List<Food> foods) {
        return new RecipeGridItem(this, images, foods);
    }

    private void appendFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.manager_grid_recipes,fragment)
                .commit();
    }

}