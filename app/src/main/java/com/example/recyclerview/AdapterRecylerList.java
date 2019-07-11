package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AdapterRecylerList extends RecyclerView.Adapter<AdapterRecylerList.ViewHolder> {

    Context context;
    String [] carList = {"Lamborghini","Jaguar","Bently","Ferrari","Mercedez","Audi","BMW","Honda","Toyota"};
    int[] colorList = {R.color.color1,R.color.color2,R.color.color3,R.color.color4,R.color.color5,R.color.color6,R.color.color7
            ,R.color.color8,R.color.color9};

    public AdapterRecylerList(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_adapter_new,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.txtCarName.setText(carList[position]);
    holder.cv.setCardBackgroundColor(context.getColor(colorList[position]));
    }

    @Override
    public int getItemCount() {
        return carList.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtCarName;
        CardView cv;
          public  ViewHolder(View view){
              super(view);
              txtCarName=view.findViewById(R.id.textView);
              cv=view.findViewById(R.id.card_view);
              cv.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                      RecyclerListHorizontal.imageDisplay(getAdapterPosition());
                  }
              });
          }
    }
}

