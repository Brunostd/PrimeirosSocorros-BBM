package com.example.primeirossocorrosactivity.activity.ataqueCardiaco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.primeirossocorrosactivity.R;
import com.example.primeirossocorrosactivity.activity.MainActivity;
import com.example.primeirossocorrosactivity.activity.pressaoSanguinea.PressaoAltaActivity;
import com.example.primeirossocorrosactivity.activity.pressaoSanguinea.PressaoSanguineaActivity;
import com.example.primeirossocorrosactivity.adapter.PassosAdapter;
import com.example.primeirossocorrosactivity.model.PassosModel;

import java.util.ArrayList;
import java.util.List;

public class AtaqueCardiacoActivity extends AppCompatActivity {

    private RecyclerView recyclerAtaqueCardiaco;
    private List<PassosModel> passosDetalhe = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ataque_cardiaco);

        recyclerAtaqueCardiaco = findViewById(R.id.recyclerAtaqueCardiaco);

        //DEFINE LAYOUT
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerAtaqueCardiaco.setLayoutManager( linearLayoutManager );

        //DEFINE ADAPTER
        prepararPassos();
        PassosAdapter passosAdapter = new PassosAdapter(passosDetalhe, AtaqueCardiacoActivity.this);
        recyclerAtaqueCardiaco.setAdapter( passosAdapter );

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Ataque Cardiaco");
    }

    public void prepararPassos(){
        PassosModel p = new PassosModel("AMBULÂNCIA",R.drawable.ambulancia);
        this.passosDetalhe.add( p );

        p = new PassosModel("PRESSÃO SANGUINEA",R.drawable.pressaosanguinea);
        this.passosDetalhe.add( p );

        p = new PassosModel("AFOGAMENTO", R.drawable.afogamento);
        this.passosDetalhe.add( p );

        p = new PassosModel("CORTES",R.drawable.corte);
        this.passosDetalhe.add( p );

        p = new PassosModel("PROBLEMAS DIABETES", R.drawable.diabetes);
        this.passosDetalhe.add( p );

        p = new PassosModel("OSSOS FRATURADOS", R.drawable.osso);
        this.passosDetalhe.add( p );
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return true;
    }
}