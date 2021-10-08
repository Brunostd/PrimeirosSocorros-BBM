package com.example.primeirossocorrosactivity.activity.diabetes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.primeirossocorrosactivity.R;
import com.example.primeirossocorrosactivity.activity.MainActivity;

public class ProblemasDiabetesActivity extends AppCompatActivity {

    private Button buttonHiperglicemia, buttonHipoglicemia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problemas_diabetes);

        buttonHiperglicemia = findViewById(R.id.buttonHiperglicemia);
        buttonHipoglicemia  = findViewById(R.id.buttonHipoglicemia);

        buttonHiperglicemia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HiperglicemiaActivity.class);
                startActivity( intent );
            }
        });

        buttonHipoglicemia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), HipoglicemiaActivity.class);
                startActivity( intent );
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Diabetes");
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return true;
    }
}