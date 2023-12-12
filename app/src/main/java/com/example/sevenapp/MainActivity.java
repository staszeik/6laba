package com.example.sevenapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPizzaButtonClick(View view) {
        String[] mIngredients = { "Токсик", "Подпивас", "Работяга с завода", "Школьник"};
        final boolean[] mSelectedIngredients = {false, false, false, false, false, false };

        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Выбрать кем стать")
                .setIcon(R.drawable.wojak)
                .setCancelable(false)
                .setMultiChoiceItems(mIngredients, null, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                        mSelectedIngredients[which] = isChecked;
                    }
                })
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        })
                ;
        AlertDialog alert = builder.create();
        alert.show();
    }}