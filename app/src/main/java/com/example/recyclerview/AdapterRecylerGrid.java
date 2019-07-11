package com.example.recyclerview;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterRecylerGrid extends RecyclerView.Adapter<AdapterRecylerGrid.ViewHolder> {

    Context context;
    String[] activityList = {"Activity Life-Cycle", "Sensors", "Implicit Intent",
            "Explicit Intent", "Fragments", "ListView",
            "AsyncTask", "Get Result From Activity", "abc"};

    static int[] colorList = {R.color.color1, R.color.color2, R.color.color3, R.color.color4, R.color.color5, R.color.color6, R.color.color7
            , R.color.color8, R.color.color9};


    public AdapterRecylerGrid(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_adapter_recyler_grid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //  holder.txtCarName.setText(activityList[position]);
        // holder.cv.setCardBackgroundColor(context.getColor(colorList[position]));
    }

    @Override
    public int getItemCount() {
        return activityList.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtCarName;
        CardView cv;

        public ViewHolder(View view) {
            super(view);
            txtCarName = view.findViewById(R.id.textView);
            cv = view.findViewById(R.id.card_view);

            final MediaPlayer mp = MediaPlayer.create(context, R.raw.sound);
            final MediaPlayer mp1 = MediaPlayer.create(context, R.raw.sound1);
            final MediaPlayer mp2 = MediaPlayer.create(context, R.raw.sound2);
            final MediaPlayer mp3 = MediaPlayer.create(context, R.raw.sound3);
            final MediaPlayer mp4 = MediaPlayer.create(context, R.raw.sound4);
            final MediaPlayer mp5 = MediaPlayer.create(context, R.raw.sound5);
            final MediaPlayer mp6 = MediaPlayer.create(context, R.raw.sound6);
            final MediaPlayer mp7 = MediaPlayer.create(context, R.raw.sound7);
            final MediaPlayer mp8 = MediaPlayer.create(context, R.raw.sound8);

            final int color1 = ContextCompat.getColor(context, R.color.color1);
            final int color2 = ContextCompat.getColor(context, R.color.color2);
            final int color3 = ContextCompat.getColor(context, R.color.color3);
            final int color4 = ContextCompat.getColor(context, R.color.color4);
            final int color5 = ContextCompat.getColor(context, R.color.color5);
            final int color6 = ContextCompat.getColor(context, R.color.color6);
            final int color7 = ContextCompat.getColor(context, R.color.color7);
            final int color8 = ContextCompat.getColor(context, R.color.color8);
            final int color9 = ContextCompat.getColor(context, R.color.color9);

cv.setOnTouchListener(new View.OnTouchListener() {
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (getAdapterPosition() == 0) {
                        cv.setBackgroundColor(color1);
                        mp.start();
                    }
                    if (getAdapterPosition() == 1) {
                        cv.setBackgroundColor(color2);
                        mp1.start();
                    }
                    if (getAdapterPosition() == 2) {
                        cv.setBackgroundColor(color3);
                        mp2.start();
                    }
                    if (getAdapterPosition() == 3) {
                        cv.setBackgroundColor(color4);
                        mp3.start();
                    }
                    if (getAdapterPosition() == 4) {
                        cv.setBackgroundColor(color5);
                        mp4.start();
                    }
                    if (getAdapterPosition() == 5) {
                        cv.setBackgroundColor(color6);
                        mp5.start();
                    }
                    if (getAdapterPosition() == 6) {
                        cv.setBackgroundColor(color7);
                        mp6.start();
                    }
                    if (getAdapterPosition() == 7) {
                        cv.setBackgroundColor(color8);
                        mp7.start();
                    }
                    if (getAdapterPosition() == 8) {
                        cv.setBackgroundColor(color9);
                        mp8.start();
                    }

        return true;
    }
});
//            cv.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    if (getAdapterPosition() == 0) {
//                        cv.setBackgroundColor(color1);
//                        mp.start();
//                    }
//                    if (getAdapterPosition() == 1) {
//                        cv.setBackgroundColor(color2);
//                        mp1.start();
//                    }
//                    if (getAdapterPosition() == 2) {
//                        cv.setBackgroundColor(color3);
//                        mp2.start();
//                    }
//                    if (getAdapterPosition() == 3) {
//                        cv.setBackgroundColor(color4);
//                        mp3.start();
//                    }
//                    if (getAdapterPosition() == 4) {
//                        cv.setBackgroundColor(color5);
//                        mp4.start();
//                    }
//                    if (getAdapterPosition() == 5) {
//                        cv.setBackgroundColor(color6);
//                        mp5.start();
//                    }
//                    if (getAdapterPosition() == 6) {
//                        cv.setBackgroundColor(color7);
//                        mp6.start();
//                    }
//                    if (getAdapterPosition() == 7) {
//                        cv.setBackgroundColor(color8);
//                        mp7.start();
//                    }
//                    if (getAdapterPosition() == 8) {
//                        cv.setBackgroundColor(color9);
//                        mp8.start();
//                    }
//                }
//            });
        }
    }
}
