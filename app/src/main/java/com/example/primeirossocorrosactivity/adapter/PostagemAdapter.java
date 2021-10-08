package com.example.primeirossocorrosactivity.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


import androidx.recyclerview.widget.RecyclerView;

import com.example.primeirossocorrosactivity.R;
import com.example.primeirossocorrosactivity.activity.afogamento.AfogamentoActivity;
import com.example.primeirossocorrosactivity.activity.ataqueCardiaco.AtaqueCardiacoActivity;
import com.example.primeirossocorrosactivity.activity.cortes.CortesActivity;
import com.example.primeirossocorrosactivity.activity.diabetes.ProblemasDiabetesActivity;
import com.example.primeirossocorrosactivity.activity.ossos.OssosFraturadosActivity;
import com.example.primeirossocorrosactivity.activity.pressaoSanguinea.PressaoSanguineaActivity;
import com.example.primeirossocorrosactivity.model.PostagemModel;

import java.util.List;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<PostagemModel> postagemModels;
    private final Context context;

    public PostagemAdapter(List<PostagemModel> listaPostagem, final Context context){
        this.postagemModels = listaPostagem;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);
        return new MyViewHolder( itemLista );
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PostagemAdapter.MyViewHolder holder, int position) {
        PostagemModel postagemModel = postagemModels.get(position);

        holder.imagePostagem.setImageResource(postagemModel.getImagePostagem());
        holder.buttonPostagem.setText(postagemModel.getTextoButton());

        if(position == 0){
            holder.imagePostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), PressaoSanguineaActivity.class);
                    context.startActivity( intent );
                }
            });
            holder.buttonPostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), PressaoSanguineaActivity.class);
                    context.startActivity( intent );
                }
            });
        } else if(position == 1){
            holder.imagePostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), AfogamentoActivity.class);
                    context.startActivity( intent );
                }
            });
            holder.buttonPostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), AfogamentoActivity.class);
                    context.startActivity( intent );
                }
            });
        } else if(position == 2){
            holder.imagePostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), AtaqueCardiacoActivity.class);
                    context.startActivity( intent );
                }
            });
            holder.buttonPostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), AtaqueCardiacoActivity.class);
                    context.startActivity( intent );
                }
            });
        } else if(position == 3){
            holder.imagePostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), CortesActivity.class);
                    context.startActivity( intent );
                }
            });
            holder.buttonPostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), CortesActivity.class);
                    context.startActivity( intent );
                }
            });
        } else if(position == 4){
            holder.imagePostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), ProblemasDiabetesActivity.class);
                    context.startActivity( intent );
                }
            });
            holder.buttonPostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), ProblemasDiabetesActivity.class);
                    context.startActivity( intent );
                }
            });
        } else if(position == 5){
            holder.imagePostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), OssosFraturadosActivity.class);
                    context.startActivity( intent );
                }
            });
            holder.buttonPostagem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), OssosFraturadosActivity.class);
                    context.startActivity( intent );
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return postagemModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

     private ImageView imagePostagem;
     private Button buttonPostagem;

        public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
            buttonPostagem = itemView.findViewById(R.id.buttonPostagem);
        }
    }
}
