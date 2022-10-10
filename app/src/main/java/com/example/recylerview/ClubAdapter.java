package com.example.recylerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;

import java.util.List;

class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ViewHolder> {

    private Context context;
    private List<ClubModel> clubList;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View theView = LayoutInflater.from(parent.getContext()).inflate(R.layout.club_layout, parent, false);
        return new ViewHolder(theView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ClubModel club = clubList.get(position);
        holder.tvClubName.setText(club.getName());
        Picasso.get().load(club.getLogo()).fit().centerCrop().into(holder.imgClubLogo);
    }

    @Override
    public int getItemCount() {
        return clubList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvClubName;
        public ImageView imgClubLogo;

        public ViewHolder(View itemView){
            super(itemView);
            tvClubName = itemView.findViewById(R.id.club_name);
            imgClubLogo = itemView.findViewById(R.id.club_logo);
        }
    }

    public ClubAdapter(Context context, List<ClubModel> clubList){
        this.context = context;
        this.clubList = clubList;
    }

}
