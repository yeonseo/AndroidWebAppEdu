package com.example.a17myplayerproject;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

class MainAdapter extends RecyclerView.Adapter<MainAdapter.CustomHolder> {
    private ArrayList<MyDB> arrayList;
    private int layout;
    Context context;

    public MainAdapter(ArrayList<MyDB> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MainAdapter.CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        CustomHolder customHolder = new CustomHolder(view);
        context = parent.getContext();
        return customHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final MainAdapter.CustomHolder holder, final int position) {
        // 아이템 내 각 위젯에 데이터 반영
        Bitmap albumArt = getArtworkQuick(context, (int) arrayList.get(position).getTxtAlbumID(), 100, 100);
        GlobalActivity.albumArt = getArtworkQuick(context, (int) arrayList.get(position).getTxtAlbumID(), 200, 200);
        if (albumArt != null) {
            holder.imgProfile.setImageBitmap(albumArt);
        } else {
            holder.imgProfile.setImageResource(R.drawable.music);
        }
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


    /* Album ID로 부터 Bitmap 이미지를 생성해 리턴해 주는 메소드 */
    private static final BitmapFactory.Options sBitmapOptionsCache = new BitmapFactory.Options();
    private static final Uri sArtworkUri = Uri.parse("content://media/external/audio/albumart");

    // Get album art for specified album. This method will not try to
    // fall back to getting artwork directly from the file, nor will it attempt to repair the database.
    private static Bitmap getArtworkQuick(Context context, int album_id, int w, int h) {
        w -= 2;
        h -= 2;
        ContentResolver res = context.getContentResolver();
        Uri uri = ContentUris.withAppendedId(sArtworkUri, album_id);
        if (uri != null) {
            ParcelFileDescriptor fd = null;
            try {
                fd = res.openFileDescriptor(uri, "r");
                int sampleSize = 1;

                sBitmapOptionsCache.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(
                        fd.getFileDescriptor(), null, sBitmapOptionsCache);
                int nextWidth = sBitmapOptionsCache.outWidth >> 1;
                int nextHeight = sBitmapOptionsCache.outHeight >> 1;
                while (nextWidth > w && nextHeight > h) {
                    sampleSize <<= 1;
                    nextWidth >>= 1;
                    nextHeight >>= 1;
                }

                sBitmapOptionsCache.inSampleSize = sampleSize;
                sBitmapOptionsCache.inJustDecodeBounds = false;
                Bitmap b = BitmapFactory.decodeFileDescriptor(
                        fd.getFileDescriptor(), null, sBitmapOptionsCache);

                if (b != null) {
                    // finally rescale to exactly the size we need
                    if (sBitmapOptionsCache.outWidth != w || sBitmapOptionsCache.outHeight != h) {
                        Bitmap tmp = Bitmap.createScaledBitmap(b, w, h, true);
                        b.recycle();
                        b = tmp;
                    }
                }

                return b;
            } catch (FileNotFoundException e) {
            } finally {
                try {
                    if (fd != null)
                        fd.close();
                } catch (IOException e) {
                }
            }
        }
        return null;
    }
}
