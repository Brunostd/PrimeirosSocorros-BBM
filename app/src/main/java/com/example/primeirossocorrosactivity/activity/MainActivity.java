package com.example.primeirossocorrosactivity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.primeirossocorrosactivity.R;
import com.example.primeirossocorrosactivity.adapter.PostagemAdapter;
import com.example.primeirossocorrosactivity.model.PostagemModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<PostagemModel> postagem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        recyclerView = findViewById(R.id.recyclerView);

        //Define Layout
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager( layoutManager );


        //Define Adapter
        prepararPostagem();
        PostagemAdapter postagemAdapter = new PostagemAdapter(postagem, MainActivity.this);
        recyclerView.setAdapter( postagemAdapter );

    }

    public void prepararPostagem(){
        PostagemModel p = new PostagemModel(R.drawable.pressaosanguinea, "Pressão Sanguinea");
        this.postagem.add(p);

        p = new PostagemModel(R.drawable.afogamento, "Afogamento");
        this.postagem.add(p);

        p = new PostagemModel(R.drawable.cardiaco,"Ataque Cardiaco");
        this.postagem.add(p);

        p = new PostagemModel(R.drawable.corte, "Cortes");
        this.postagem.add(p);

        p = new PostagemModel(R.drawable.diabetes, "Problemas Diabete");
        this.postagem.add(p);

        p = new PostagemModel(R.drawable.osso, "Osso Fraturado");
        this.postagem.add(p);
    }
}