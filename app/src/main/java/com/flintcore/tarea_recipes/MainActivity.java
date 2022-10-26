package com.flintcore.tarea_recipes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import com.flintcore.tarea_recipes.templates.data.FoodType;
import com.flintcore.tarea_recipes.util.adapter.SpinnerValues;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private Spinner foodSpinner;

    private SpinnerValues values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<CharSequence> foods = getFoodList();

        this.values = new SpinnerValues(this);
        this.foodSpinner = findViewById(R.id.food_selector);

        this.foodSpinner.setAdapter(this.values.getAdapter());

    }

    @NonNull
    private List<CharSequence> getFoodList() {
        return Arrays.stream(FoodType.values())
                .map(f -> f.name().replace('_', ' '))
                .collect(Collectors.toList());
    }
}