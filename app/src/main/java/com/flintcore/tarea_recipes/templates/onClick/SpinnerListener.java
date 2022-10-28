package com.flintcore.tarea_recipes.templates.onClick;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

import com.flintcore.tarea_recipes.GridRecipesManager;
import com.flintcore.tarea_recipes.templates.views.RecipeGridItem;

import java.util.List;

public class SpinnerListener implements OnItemSelectedListener {

    private List<RecipeGridItem> gridItems;
    private final GridRecipesManager gridManager;

    public SpinnerListener(List<RecipeGridItem> gridItems, GridRecipesManager gridManager) {
        this.gridItems = gridItems;
        this.gridManager = gridManager;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        this.gridManager.replaceAdapter(this.gridItems.get(i));
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
