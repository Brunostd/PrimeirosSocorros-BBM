package com.example.primeirossocorrosactivity.activity.cortes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.primeirossocorrosactivity.R;
import com.example.primeirossocorrosactivity.activity.MainActivity;
import com.example.primeirossocorrosactivity.activity.afogamento.AfogamentoActivity;
import com.example.primeirossocorrosactivity.adapter.PassosAdapter;
import com.example.primeirossocorrosactivity.model.PassosModel;

import java.util.ArrayList;
import java.util.List;

public class CortesSuperficiaisActivity extends AppCompatActivity {

    private RecyclerView recyclerCortesSuperficiais;
    private List<PassosModel> passosModels = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cortes_superficiais);

        recyclerCortesSuperficiais = findViewById(R.id.recyclerCortesSuperficiais);

        //DEFINE LAYOUT
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerCortesSuperficiais.setLayoutManager(linearLayoutManager);

        //DEFINE ADAPTER
        prepararPassos();
        PassosAdapter passosAdapter = new PassosAdapter(passosModels, CortesSuperficiaisActivity.this);
        recyclerCortesSuperficiais.setAdapter( passosAdapter );

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Cortes Superficiais");
    }

    public void prepararPassos(){
        PassosModel p = new PassosModel("AMBULÂNCIA",R.drawable.ambulancia);
        this.passosModels.add( p );

        p = new PassosModel("PRESSÃO SANGUINEA",R.drawable.pressaosanguinea);
        this.passosModels.add( p );

        p = new PassosModel("ATAQUE CARDIACO", R.drawable.cardiaco);
        this.passosModels.add( p );

        p = new PassosModel("AFOGAMENTO",R.drawable.afogamento);
        this.passosModels.add( p );

        p = new PassosModel("PROBLEMAS DIABETES", R.drawable.diabetes);
        this.passosModels.add( p );

        p = new PassosModel("OSSOS FRATURADOS", R.drawable.osso);
        this.passosModels.add( p );
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), CortesActivity.class);
        startActivityForResult(myIntent, 0);
        finish();
        return true;
    }
}