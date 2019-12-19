package com.juara.belajarrecycleview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterListSimple extends RecyclerView.Adapter<AdapterListSimple.ViewHolder> {

    List<ModelBiodata> data;
    Context context;


    public AdapterListSimple(Context context, List<ModelBiodata> data){


        this.data = data;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        ViewHolder myViewHolder = new ViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView txtNama = holder.txtNama;
        TextView txtAlamat = holder.txtAlamat;

        txtNama.setText(data.get(position).getNama());
        txtAlamat.setText(data.get(position).getAlamat());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    // Static inner class to initialize the views of rows
    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView txtNama,txtAlamat;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            txtNama = (TextView) itemView.findViewById(R.id.txtName);
            txtAlamat = (TextView) itemView.findViewById(R.id.txtAlamat);

        }
        @Override
        public void onClick(View view) {
            Log.d("onclick", "onClick " + getLayoutPosition() + " " + txtNama.getText());
        }
    }


}
