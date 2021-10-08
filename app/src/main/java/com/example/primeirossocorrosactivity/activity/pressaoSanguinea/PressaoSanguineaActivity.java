package com.example.primeirossocorrosactivity.activity.pressaoSanguinea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.primeirossocorrosactivity.R;
import com.example.primeirossocorrosactivity.activity.MainActivity;

public class PressaoSanguineaActivity extends AppCompatActivity {

    private Button buttonPressaoAlta, buttonPressaoBaixa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste);

        buttonPressaoAlta  = findViewById(R.id.buttonPressaoAlta);
        buttonPressaoBaixa = findViewById(R.id.buttonPressaoBaixa);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pressão Sanguinea");

        buttonPressaoAlta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PressaoAltaActivity.class);
                startActivity( intent );
            }
        });

        buttonPressaoBaixa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PressaoBaixaActivity.class);
                startActivity( intent );
            }
        });

    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return true;
    }
}