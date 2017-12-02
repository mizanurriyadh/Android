package com.riyadh.mizanur.dialogbox;

import android.app.Activity;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1();
    }

    public void b1() {
        AlertDialog.Builder myBuilder = new AlertDialog.Builder(MainActivity.this);

        myBuilder.setTitle("Dialog Box");
        myBuilder.setMessage("This is a Dialog Body");
        myBuilder.setIcon(R.drawable.icon);
        myBuilder.setCancelable(true);

        myBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Yes button pressed", Toast.LENGTH_SHORT).show();
            }
        });

        myBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "No button pressed", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog mydialog = myBuilder.create();
        mydialog.show();

    }

}
