package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class RecyclerListHorizontal extends AppCompatActivity {

    RecyclerView rv;
    static ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_list_horizontal);


        rv=findViewById(R.id.recycler_view);
        iv=findViewById(R.id.image_view);
        rv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));


        AdapterRecylerList adapter = new AdapterRecylerList(this);
        //To add animation ( not mandatory)
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(adapter);
    }

    public static void imageDisplay(int position){
        if(position==0){ //Lamborghini
            Picasso.get().load("https://cdn.motor1.com/images/mgl/wAnA6/s3/lamborghini-batmobile.jpg")
                    .into(iv);
        }
        else if (position==1){ //Jaguar
            Picasso.get().load("https://motorbash.com/wp-content/uploads/2012/06/jaguar-xf.jpg")
                    .into(iv);
        }
        else if (position==2){ //Bently
            Picasso.get().load("https://thumbor.forbes.com/thumbor/" +
                    "960x0/https%3A%2F%2Fblogs-images.forbes.com%2Fnargessbanks%2Ffiles%2F2017%2F09%2FNew-Continental-GT-36-1200x934.jpg")
                    .into(iv);
        }
        else if (position==3){ //ferrari
            Picasso.get().load("http://images.summitmedia-digital.com/topgear/images/2019/03/26/ferrari-p80-c-main-1553573695.jpg")
                    .into(iv);
        }
        else if (position==4){ //Mercedez
            Picasso.get().load("http://1.bp.blogspot.com/-hXlLPenAaOM/VqTM8ue5VoI/AAAAAAAAAMI/" +
                    "xufzYj0Uie0/s1600/Future%2BCars%2BMercedez%2BBenz%2BBIOME%2BConcept%2BLatest%2BModels.jpg")
                    .into(iv);
        } else if (position==5){ //Audi
            Picasso.get().load("https://imgct2.aeplcdn.com/img/800x600/car-data/big/bmw-i8-default-image.png-version201904181820.png?v=31")
                    .into(iv);
        }
        else if (position==6){ //BMW
            Picasso.get().load("https://www.autocar.co.uk/sites/autocar.co.uk/" +
                    "files/styles/gallery_slide/public/images/car-reviews/first-drives/legacy/group_night_1-_0789_0.jpg?itok=VVy-KVdu")
                    .into(iv);
        }else if (position==7){ //Honda
            Picasso.get().load("https://blogmedia.dealerfire.com/wp-content/uploads/sites/618/2017/03/2017-Civic-Type-R-FEATURE_o.jpg")
                    .into(iv);
        } else if (position==8){ //Toyota
            Picasso.get().load("https://res.cloudinary.com/carsguide/image/upload/f_auto,fl_lossy,q_auto,t_cg_hero_large/" +
                    "v1/editorial/2019-Toyota-Supra-News-Coupe-Silver-Press-Image-1001x565p-1.jpg")
                    .into(iv);
        }
    }
}
