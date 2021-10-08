package com.example.primeirossocorrosactivity.activity.pressaoSanguinea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.primeirossocorrosactivity.R;
import com.example.primeirossocorrosactivity.adapter.PassosAdapter;
import com.example.primeirossocorrosactivity.model.PassosModel;

import java.util.ArrayList;
import java.util.List;

public class PressaoBaixaActivity extends AppCompatActivity {

    private RecyclerView recyclerPressaoBaixa;
    private List<PassosModel> passosModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressao_baixa);

        recyclerPressaoBaixa = findViewById(R.id.recyclerPressaoBaixa);

        //DEFINE LAYOUT
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerPressaoBaixa.setLayoutManager( linearLayoutManager );

        //DEFINE ADAPTER
        prepararPassos();
        PassosAdapter passosAdapter = new PassosAdapter(passosModels, PressaoBaixaActivity.this);
        recyclerPressaoBaixa.setAdapter( passosAdapter );

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pressão Baixa");
    }

    public void prepararPassos(){
        PassosModel p = new PassosModel("AMBULÂNCIA",R.drawable.ambulancia);
        this.passosModels.add( p );

        p = new PassosModel("AFOGAMENTO",R.drawable.afogamento);
        this.passosModels.add( p );

        p = new PassosModel("ATAQUE CARDIACO", R.drawable.cardiaco);
        this.passosModels.add( p );

        p = new PassosModel("CORTES",R.drawable.corte);
        this.passosModels.add( p );

        p = new PassosModel("PROBLEMAS DIABETES", R.drawable.diabetes);
        this.passosModels.add( p );

        p = new PassosModel("OSSOS FRATURADOS", R.drawable.osso);
        this.passosModels.add( p );
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), PressaoSanguineaActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return true;
    }
}