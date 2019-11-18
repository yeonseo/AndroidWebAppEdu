package com.example.a14recyclerviewtest;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.CustomViewHolder> {

    private ArrayList<MainData> arrayList;
    private int layout;

    public MainAdapter(ArrayList<MainData> arrayList) {
        this.layout = layout;
        this.arrayList = arrayList;
    }

    //분업1 인플레이터
    //뷰홀더에 화면을 객체화 해서 해당된 뷰홀더를 리턴한다.
    @NonNull
    @Override
    public MainAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //해당된 뷰홀더 아이디를 찾는다.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_itme, parent, false);
//        View view = LayoutInflater.from(parent.getContext()).inflate(layout, parent, false);
        CustomViewHolder holder = new CustomViewHolder(view);
        return holder;
    }

    //분업2 바인딩 시키는 것.
    @Override
    public void onBindViewHolder(@NonNull final CustomViewHolder holder, int position) {
        holder.imgProfile.setImageResource(arrayList.get(position).getImgProfile());
        holder.txtName.setText(arrayList.get(position).getTxtName());
        holder.txtContent.setText(arrayList.get(position).getTxtContent());

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentName = holder.txtName.getText().toString();
                Toast.makeText(v.getContext(), currentName, Toast.LENGTH_LONG).show();
            }
        });

        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                remove(holder.getAdapterPosition());
                return false;
            }
        });
    }

    private void remove(int adapterPosition) {
        try{
            arrayList.remove(adapterPosition);
            notifyItemRemoved(adapterPosition);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @Override
    public int getItemCount() {
        return (arrayList != null) ? (arrayList.size()) : (null);
    }


    //분업3 홀더가 객체가 되면, 홀더의 아이디를 여기서 찾아준다. find id!
    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected ImageView imgProfile;
        protected TextView txtName, txtContent;

        //itemView에는 뷰홀더가 객체가 된 레이아웃 주소 전달된다.
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            this.imgProfile = itemView.findViewById(R.id.imgProfile);
            this.txtName = itemView.findViewById(R.id.txtName);
            this.txtContent = itemView.findViewById(R.id.txtContent);
        }
    }
}
