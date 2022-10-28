package com.flintcore.tarea_recipes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class GridRecipesManager extends Fragment {

    private ListView listGridView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.recipe_image_template,
                container, false);

        this.listGridView = inflatedView.findViewById(R.id.grid_recipes);

        return inflatedView;
    }

    public void replaceAdapter(BaseAdapter adapter) {
        this.listGridView.setAdapter(adapter);
        this.listGridView.deferNotifyDataSetChanged();
    }

}
