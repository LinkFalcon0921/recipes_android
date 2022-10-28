package com.flintcore.tarea_recipes.templates.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.flintcore.tarea_recipes.R;
import com.flintcore.tarea_recipes.templates.data.Food;

import java.util.List;
import java.util.Objects;

//Adapter
public class RecipeGridItem extends BaseAdapter {
    private final Context context;

    private final List<Integer> images;

    private final List<Food> foods;

    private static LayoutInflater INFLATER;

    public RecipeGridItem(Context context, List<Integer> images, List<Food> foods) {
        this.context = context;
        if (Objects.isNull(INFLATER)) {
            this.INFLATER = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        this.foods = foods;
        this.images = images;
    }

    @Override
    public int getCount() {
        return this.images.size();
    }

    @Override
    public Object getItem(int i) {
        return this.images.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int index, View view, ViewGroup viewGroup) {
//        if (Objects.nonNull(view)) {
//            view = INFLATER.inflate(R.layout.item_preview, null);
//        }

        final View vt = INFLATER.inflate(R.layout.item_preview, null);

        ImageView imagePreview = vt.findViewById(R.id.image_recipe);
        TextView textRecipe = vt.findViewById(R.id.name_recipe);

        imagePreview.setImageResource(this.images.get(index));
        textRecipe.setText(this.foods.get(index).getName());

        return vt;
    }
}
