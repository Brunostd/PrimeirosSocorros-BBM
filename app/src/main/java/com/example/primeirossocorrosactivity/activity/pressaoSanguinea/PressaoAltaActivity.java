package com.example.primeirossocorrosactivity.activity.pressaoSanguinea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.example.primeirossocorrosactivity.R;
import com.example.primeirossocorrosactivity.adapter.PassosAdapter;
import com.example.primeirossocorrosactivity.model.PassosModel;
import com.example.primeirossocorrosactivity.model.PostagemModel;

import java.util.ArrayList;
import java.util.List;

public class PressaoAltaActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPressaoAlta;
    private List<PassosModel> passosDetalhe = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressao_alta);

        recyclerViewPressaoAlta = findViewById(R.id.recyclerPressaoAlta);

        //DEFINE LAYOUT
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerViewPressaoAlta.setLayoutManager( linearLayoutManager );

        //DEFINE ADAPTER
        prepararPassos();
        PassosAdapter passosAdapter = new PassosAdapter(passosDetalhe, PressaoAltaActivity.this);
        recyclerViewPressaoAlta.setAdapter( passosAdapter );

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pressão Alta");
    }

    public void prepararPassos(){
        PassosModel p = new PassosModel("AMBULÂNCIA",R.drawable.ambulancia);
        this.passosDetalhe.add( p );

        p = new PassosModel("AFOGAMENTO",R.drawable.afogamento);
        this.passosDetalhe.add( p );

        p = new PassosModel("ATAQUE CARDIACO", R.drawable.cardiaco);
        this.passosDetalhe.add( p );

        p = new PassosModel("CORTES",R.drawable.corte);
        this.passosDetalhe.add( p );

        p = new PassosModel("PROBLEMAS DIABETES", R.drawable.diabetes);
        this.passosDetalhe.add( p );

        p = new PassosModel("OSSOS FRATURADOS", R.drawable.osso);
        this.passosDetalhe.add( p );
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), PressaoSanguineaActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return true;
    }
}