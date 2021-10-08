package com.example.primeirossocorrosactivity.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.primeirossocorrosactivity.R;
import com.example.primeirossocorrosactivity.activity.afogamento.AfogamentoActivity;
import com.example.primeirossocorrosactivity.activity.ataqueCardiaco.AtaqueCardiacoActivity;
import com.example.primeirossocorrosactivity.activity.cortes.CortesActivity;
import com.example.primeirossocorrosactivity.activity.diabetes.ProblemasDiabetesActivity;
import com.example.primeirossocorrosactivity.activity.ossos.OssosFraturadosActivity;
import com.example.primeirossocorrosactivity.activity.pressaoSanguinea.PressaoAltaActivity;
import com.example.primeirossocorrosactivity.activity.pressaoSanguinea.PressaoSanguineaActivity;
import com.example.primeirossocorrosactivity.model.PassosModel;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PassosAdapter extends RecyclerView.Adapter<PassosAdapter.MyViewHolder> {

    private List<PassosModel> passosModels;
    private final Context context;

    public PassosAdapter(List<PassosModel> passosDetalhe, final Context context) {
        this.passosModels = passosDetalhe;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.passo_a_passo_detalhe, parent, false);
        return new MyViewHolder( itemLista );
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PassosAdapter.MyViewHolder holder, int position) {
        PassosModel passosModel = passosModels.get( position );

        holder.textViewPassos.setText(passosModel.getTextoPassos());
        holder.imageView.setImageResource(passosModel.getImagemPassos());

        if (position == 0) {
            holder.buttonPassos.setText("Ligar");
            holder.buttonPassos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:192"));
                    context.startActivity( intent );
                }
            });
        } else if (position == 1) {
            holder.buttonPassos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(passosModel.getTextoPassos().equals("AFOGAMENTO")) {
                        Intent intent = new Intent(context.getApplicationContext(), AfogamentoActivity.class);
                        context.startActivity(intent);
                    } else if(passosModel.getTextoPassos().equals("PRESSÃO SANGUINEA")){
                        Intent intent = new Intent(context.getApplicationContext(), PressaoSanguineaActivity.class);
                        context.startActivity(intent);
                    }
                }
            });
        } else if (position == 2) {
            holder.buttonPassos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(passosModel.getTextoPassos().equals("ATAQUE CARDIACO")) {
                        Intent intent = new Intent(context.getApplicationContext(), AtaqueCardiacoActivity.class);
                        context.startActivity(intent);
                    } else if(passosModel.getTextoPassos().equals("AFOGAMENTO")){
                        Intent intent = new Intent(context.getApplicationContext(), AfogamentoActivity.class);
                        context.startActivity(intent);
                    }
                }
            });
        } else if(position == 3){
            holder.buttonPassos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(passosModel.getTextoPassos().equals("AFOGAMENTO")){
                        Intent intent = new Intent(context.getApplicationContext(), AfogamentoActivity.class);
                        context.startActivity(intent);
                    } else if(passosModel.getTextoPassos().equals("CORTES")){
                        Intent intent = new Intent(context.getApplicationContext(), CortesActivity.class);
                        context.startActivity(intent);
                    }
                }
            });
        } else if(position == 4){
            holder.buttonPassos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(passosModel.getTextoPassos().equals("PROBLEMAS DIABETES")){
                        Intent intent = new Intent(context.getApplicationContext(), ProblemasDiabetesActivity.class);
                        context.startActivity(intent);
                    } else if(passosModel.getTextoPassos().equals("CORTES")){
                        Intent intent = new Intent(context.getApplicationContext(), CortesActivity.class);
                        context.startActivity(intent);
                    }
                }
            });
        } else if(position == 5){
            holder.buttonPassos.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(passosModel.getTextoPassos().equals("OSSOS FRATURADOS")){
                        Intent intent = new Intent(context.getApplicationContext(), OssosFraturadosActivity.class);
                        context.startActivity(intent);
                    } else if(passosModel.getTextoPassos().equals("PROBLEMAS DIABETES")){
                        Intent intent = new Intent(context.getApplicationContext(), ProblemasDiabetesActivity.class);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return passosModels.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewPassos;
        private ImageView imageView;
        private Button buttonPassos;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            textViewPassos = itemView.findViewById(R.id.textViewPassos);
            imageView      = itemView.findViewById(R.id.imageViewPassos);
            buttonPassos   = itemView.findViewById(R.id.buttonPassos);
        }
    }
}
