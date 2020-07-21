package com.example.appround_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    ViewFlipper viewFlipper;

    int[] image = {
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        List<ModelClass> modelClassList=new ArrayList<>();
        modelClassList.add(new ModelClass(R.drawable.pic3,"1","The NCPA National Jazz-\n"+"The Latination","Nov\n"+"10","Tata Theatre","Rs 300"));
        modelClassList.add(new ModelClass(R.drawable.pic4,"1","The NCPA National Jazz-\n"+"Festival-Saz-e-Bahar","Nov\n" + "11","Jamshed Baba Theatre","Rs 400"));
        modelClassList.add(new ModelClass(R.drawable.pic6,"1","The NCPA National Jazz-\n"+" Festival-Jazz Goes Retro!","Nov\n" + "12","Experimental Theatre","Rs 500"));
        modelClassList.add(new ModelClass(R.drawable.pic7,"1","The NCPA National Jazz-\n"+"Festival-The Socho Project","Nov\n" + "13","Tata Theatre","Rs 600"));
        modelClassList.add(new ModelClass(R.drawable.pic8,"1","The NCPA National Jazz-\n"+"The Latination 2","Nov\n" + "14","Jamshed Baba Theatre","Rs 700"));

        Adapter adapter=new Adapter(modelClassList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        viewFlipper=findViewById(R.id.flipper_layout);


        for (int i = 0; i < image.length; i++) {
            flip_image(image[i]);
        }

    }
    public void flip_image(int i) {
        ImageView View = new ImageView(this);
        View.setBackgroundResource(i);
        viewFlipper.addView(View);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this, android.R.anim.slide_out_right);

    }



}