package com.flintcore.tarea_recipes.util.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.ArrayRes;
import androidx.annotation.LayoutRes;

import com.flintcore.tarea_recipes.R;

import java.util.List;

public class SpinnerValues {

    private final ArrayAdapter<CharSequence> adapter;

//    TODO CHECK
    public SpinnerValues(Context context, @LayoutRes int resources, List<CharSequence> list) {
        this.adapter = new ArrayAdapter<>(context, resources);
    }
    public SpinnerValues(Context context, @ArrayRes int listId) {
        this.adapter = ArrayAdapter.createFromResource(context, listId, android.R.layout.simple_spinner_item);
        this.adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    }

    public ArrayAdapter<CharSequence> getAdapter() {
        return adapter;
    }

}
