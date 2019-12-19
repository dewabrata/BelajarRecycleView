package com.juara.belajarrecycleview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterBelajarList extends RecyclerView.Adapter<AdapterBelajarList.ViewHolder> {

    List<ModelBelajar> data;
    Context context;


    public AdapterBelajarList(Context context, List<ModelBelajar> data){


        this.data = data;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_belajar, parent, false);
        ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView txtKelas = holder.txtKelas;
        TextView txtTanggal = holder.txtTanggal;
        TextView txtJam = holder.txtJam;

        txtKelas.setText(data.get(position).getNamaKelas());
        txtTanggal.setText(data.get(position).getTglKelas());
        txtJam.setText(data.get(position).getJamKelas());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    // Static inner class to initialize the views of rows
    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtKelas,txtJam,txtTanggal;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            txtKelas = (TextView) itemView.findViewById(R.id.txtKelas);
            txtTanggal = (TextView) itemView.findViewById(R.id.txtTanggal);
            txtJam = (TextView) itemView.findViewById(R.id.txtJam);

        }
        @Override
        public void onClick(View view) {
           // Log.d("onclick", "onClick " + getLayoutPosition() + " " + txt.getText());
        }
    }


}
