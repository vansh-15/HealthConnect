package com.example.healthconnect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DoctorAdapter extends RecyclerView.Adapter<DoctorAdapter.DoctorViewHolder> {
    final Context context;
    final List<DoctorList> doctorList;

    public DoctorAdapter(Context context, List<DoctorList> doctorList) {
        this.context = context;
        this.doctorList = doctorList;
    }

    @Override
    public DoctorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_doctors, parent, false);
        return new DoctorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DoctorViewHolder holder, int position) {
        DoctorList doctor = doctorList.get(position);
        holder.name.setText(doctor.getName());
        holder.specialization.setText(doctor.getSpecialisation());
        holder.image.setImageResource(doctor.getImage());
    }

    @Override
    public int getItemCount() {
        return doctorList.size();
    }

    public static class DoctorViewHolder extends RecyclerView.ViewHolder {
        TextView name, specialization;
        ImageView image;

        public DoctorViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.doctor_name);
            specialization = itemView.findViewById(R.id.specialisation);
            image = itemView.findViewById(R.id.doctor_image);
        }
    }
}
