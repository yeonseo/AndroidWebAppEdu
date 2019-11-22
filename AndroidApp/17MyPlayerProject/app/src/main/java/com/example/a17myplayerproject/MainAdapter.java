package com.example.a17myplayerproject;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

class MainAdapter extends RecyclerView.Adapter<MainAdapter.CustomHolder> {
    private ArrayList<MyDB> arrayList;
    private int layout;

    public MainAdapter(ArrayList<MyDB> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MainAdapter.CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        CustomHolder customHolder = new CustomHolder(view);
        return customHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MainAdapter.CustomHolder holder, final int position) {
        holder.imgProfile.setImageResource((int) arrayList.get(position).getImgProfile());
        holder.txtTitle.setText(arrayList.get(position).getTxtTitle());
        holder.txtArtist.setText(arrayList.get(position).getTxtArtist());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");

        String duration = simpleDateFormat.format(arrayList.get(position).getDuration());

        holder.txtTime.setText(duration);

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalActivity.position = position;
                String strTest = holder.txtArtist.getText().toString();
                Toast.makeText(v.getContext(), strTest + GlobalActivity.position, Toast.LENGTH_LONG).show();
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                remove(position);
                Log.i("테스트", "setOnLongClickListener2");
                return false;
            }
        });

    }

    public void remove(int adapterPosition) {
        try {
//            Log.i("테스트", "remove");
//            MainActivity.myHelper.queryAction("delete",arrayList.get(adapterPosition).getTxtName(),arrayList.get(adapterPosition).getTxtNum());
//            arrayList.remove(adapterPosition);
//            notifyItemRemoved(adapterPosition);
        } catch (Exception e) {
            e.printStackTrace();
            Log.i("테스트", "remove " + e);
        }
    }

    @Override
    public int getItemCount() {
        return (arrayList != null) ? (arrayList.size()) : (null);
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        protected ImageView imgProfile;
        protected TextView txtTitle, txtArtist, txtTime;
        protected ImageButton btnOption;

        //itemView에는 뷰홀더가 객체가 된 레이아웃 주소 전달된다.
        public CustomHolder(@NonNull View itemView) {
            super(itemView);
            this.imgProfile = itemView.findViewById(R.id.imgProfile);
            this.txtTitle = itemView.findViewById(R.id.txtTitle);
            this.txtArtist = itemView.findViewById(R.id.txtArtist);
            this.txtTime = itemView.findViewById(R.id.txtTime);
            this.btnOption = itemView.findViewById(R.id.btnOption);
        }
    }
}
