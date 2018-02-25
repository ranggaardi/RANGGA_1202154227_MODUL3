package com.example.android.rangga_1202154227_modul3;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.Collections;

public class AirActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private ArrayList<String> Title;
    private ArrayList<String> Desc;
    private ArrayList<Integer> Gambar;

    private String[] title = {"Ades","Amidis","Aqua","Cleo","Club","Equil","Evian","Leminerale","Nestle","Pristine","Vit"};

    private String[] desc = {"Ini adalah minuman merek Ades","Ini adalah minuman merek Amidis","Ini adalah minuman merek Aqua",
            "Ini adalah minuman merek Cleo","Ini adalah minuman merek Club","Ini adalah minuman merek Equil","Ini adalah minuman merek Evian",
            "Ini adalah minuman merek Leminerale","Ini adalah minuman merek Nestle","Ini adalah minuman merek Pristine","Ini adalah minuman merek Vit"};

    private int[] gambar = {R.drawable.ades,R.drawable.amidis,R.drawable.aqua,R.drawable.cleo,R.drawable.club,R.drawable.equil,R.drawable.evian,
            R.drawable.leminerale,R.drawable.nestle,R.drawable.pristine,R.drawable.vit};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air);

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);


        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);


        recyclerView.setLayoutManager(new GridLayoutManager(this, gridColumnCount));

        Title = new ArrayList<>();
        Desc = new ArrayList<>();
        Gambar = new ArrayList<>();


        adapter = new AdapterAirActivity(Title, Desc, Gambar);
        recyclerView.setAdapter(adapter);

        for (int w=0; w<title.length; w++) {
            Gambar.add(gambar[w]);
            Title.add(title[w]);
            Desc.add(desc[w]);
        }


        int swipeDirs;
        if(gridColumnCount > 1){
            swipeDirs = 0;
        } else {
            swipeDirs = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
        }


        ItemTouchHelper helper = new ItemTouchHelper(new ItemTouchHelper.SimpleCallback
                (ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT | ItemTouchHelper.DOWN
                        | ItemTouchHelper.UP, swipeDirs) {


            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
                int from = viewHolder.getAdapterPosition();
                int to = target.getAdapterPosition();


                Collections.swap(Desc, from,to);
                Collections.swap(Title,from,to);
                Collections.swap(Gambar,from,to);
                adapter.notifyItemMoved(from, to);
                return true;
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
                Title.remove(viewHolder.getAdapterPosition());
                Desc.remove(viewHolder.getAdapterPosition());
                Gambar.remove(viewHolder.getAdapterPosition());

                adapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        });
        helper.attachToRecyclerView(recyclerView);



    }

}
