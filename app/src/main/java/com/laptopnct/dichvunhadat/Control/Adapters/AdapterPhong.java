package com.laptopnct.dichvunhadat.Control.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.laptopnct.dichvunhadat.Model.DatPhong;
import com.laptopnct.dichvunhadat.Model.PhongModel;
import com.laptopnct.dichvunhadat.R;

import java.util.ArrayList;
import java.util.List;



public class AdapterPhong extends RecyclerView.Adapter<AdapterPhong.HolderPhong> {

    Context context;
    List<PhongModel> phongModelList;
    public static List<DatPhong> datMonList = new ArrayList<>();

    public AdapterPhong(Context context, List<PhongModel> phongModelList){
        this.context = context;
        this.phongModelList = phongModelList;

    }

    @Override
    public HolderPhong onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_layout_phong,parent,false);
        return new HolderPhong(view);
    }

    @Override
    public void onBindViewHolder(final HolderPhong holder, int position) {
        final PhongModel phongModel = phongModelList.get(position);
        holder.txtTenPhong.setText(phongModel.getTenphong());
        holder.txtSoLuong.setTag(0);


//
//        holder.imgGiamSoLuong.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int dem = Integer.parseInt(holder.txtSoLuong.getTag().toString());
//                if(dem != 0){
//                    dem--;
//                    if(dem == 0){
//                        DatPhong datPhong= (DatPhong) v.getTag();
//                        AdapterPhong.datMonList.remove(datPhong);
//                    }
//                }
//
//
//                holder.txtSoLuong.setTag(dem);
//
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return phongModelList.size();
    }

    public class HolderPhong extends RecyclerView.ViewHolder {
        TextView txtTenPhong,txtSoLuong;


        public HolderPhong(View itemView) {
            super(itemView);
            txtTenPhong = (TextView) itemView.findViewById(R.id.txtTenPhong);
            txtSoLuong = (TextView) itemView.findViewById(R.id.txtGiaTien);
        }
    }
}
