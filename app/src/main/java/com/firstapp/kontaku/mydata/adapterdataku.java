package com.firstapp.kontaku.mydata;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firstapp.kontaku.R;

import java.util.List;

public class adapterdataku extends RecyclerView.Adapter<adapterdataku.ViewHolder> {
    Context context;
    List<dataku> list;

    OnCallBack onCallBack;

    public void setOnCallBack(OnCallBack onCallBack) {
        this.onCallBack = onCallBack;
    }

    public adapterdataku(Context context, List<dataku> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listdata, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textViewData.setText(list.get(position).getIsi());

        holder.tblHapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCallBack.onTblHapus(list.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewData;
        ImageButton tblHapus;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewData = itemView.findViewById(R.id.textViewData);
            tblHapus = itemView.findViewById(R.id.tbl_hapus);

        }
    }

    public interface OnCallBack{
        void onTblHapus(dataku myData);
    }
}
