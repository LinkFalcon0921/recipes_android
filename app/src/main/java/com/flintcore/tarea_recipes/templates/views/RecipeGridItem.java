package com.flintcore.tarea_recipes.templates.views;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.flintcore.tarea_recipes.R;
import com.flintcore.tarea_recipes.templates.data.Food;

public class RecipeGridItem extends Fragment {
    private final Context context;

    private TextView recipe_name;

    private ImageView recipe_image;

    private final Food food;

    public RecipeGridItem(Context context, Food food) {
        this.context = context;
        this.food = food;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.item_preview, container, false);

        this.recipe_image = inflatedView.findViewById(R.id.image_recipe);
        this.recipe_image.setImageResource(this.food.getImageRef());

        this.recipe_name = inflatedView.findViewById(R.id.name_recipe);
        this.recipe_name.setText(this.food.getName());

        return inflatedView;
    }
}
