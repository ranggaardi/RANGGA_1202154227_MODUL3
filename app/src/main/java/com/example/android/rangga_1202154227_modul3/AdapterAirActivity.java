package com.example.android.rangga_1202154227_modul3;

/**
 * Created by ranggaardi on 2/25/2018.
 */
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;


public class AdapterAirActivity extends RecyclerView.Adapter<AdapterAirActivity.ViewHolder> {


    private ArrayList<String> arrayListnama, arrayListket;
    private ArrayList<Integer> arrayListgambar;


    AdapterAirActivity(ArrayList<String> arrayListnama, ArrayList<String> arrayListket, ArrayList<Integer> arrayListgambar){
        this.arrayListnama = arrayListnama;
        this.arrayListket = arrayListket;
        this.arrayListgambar = arrayListgambar;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView nama, ket;
        private ImageView gambar;
        private LinearLayout item;

        public ViewHolder(View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.nama);
            ket = itemView.findViewById(R.id.cat);
            gambar = itemView.findViewById(R.id.gambar);
            item = itemView.findViewById(R.id.item);
        }
    }

    @Override
    public AdapterAirActivity.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View tam = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list, parent,false);
        ViewHolder lan = new ViewHolder(tam);
        return lan;
    }

    @Override
    public void onBindViewHolder(AdapterAirActivity.ViewHolder holder, final int position) {

        final String title = arrayListnama.get(position);
        final String desc = arrayListket.get(position);
        final Integer gambar = arrayListgambar.get(position);

        holder.nama.setText(title);
        holder.ket.setText(desc);
        holder.gambar.setImageResource(gambar);

        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), DetailActivity.class);
                String descs = " In a vault deep inside Abbey Road Studios in London — protected by an unmarked, triple-locked, police-alarmed door — are something like 400 hours of unreleased Beatles recordings, starting from June 2, 1962 and ending with the very last tracks recorded for the <i>Let It Be album. The best of the best were released by Apple Records in the form of the 3-volume Anthology series.\n" +
                        " For more information, see the Beatles Time Capsule at www.rockument.com.\n" +
                        "Love Me Do — An early version of the song, played a bit slower and with more of a blues feeling, and a cool bossa-nova beat in middle. Paul had to sing while John played harmonica — a first for the group. Pete Best played drums on this version.\n" +
                        "\n" +
                        " She Loves You – Till There Was You – Twist and Shout — Live at the Princess Wales Theatre by Leicester Square in London, attended by the Queen. “Till There Was You” (by Meredith Wilson) is from the musical The Music Man and a hit for Peggy Lee in 1961. Before playing it, Paul said it was recorded by his favorite American group, “Sophie Tucker” (which got some laughs). At the end, John tells the people in the cheaper seats to clap their hands, and the rest to “rattle your jewelry” and then announces “Twist and Shout” (a song by Bert Russell and Phil Medley that was first recorded in 1962 by the Isley Brothers). A film of the performance shows the Queen smiling at John’s remark.\n";
                switch (position){
                    case 0:
                        intent.putExtra("nama", arrayListnama.get(position));
                        intent.putExtra("ket", arrayListket.get(position));
                        intent.putExtra("gambar", arrayListgambar.get(position));
                        intent.putExtra("art", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 1:
                        intent.putExtra("nama", arrayListnama.get(position));
                        intent.putExtra("ket", arrayListket.get(position));
                        intent.putExtra("gambar", arrayListgambar.get(position));
                        intent.putExtra("art", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 2:
                        intent.putExtra("nama", arrayListnama.get(position));
                        intent.putExtra("ket", arrayListket.get(position));
                        intent.putExtra("gambar", arrayListgambar.get(position));
                        intent.putExtra("art", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 3:
                        intent.putExtra("nama", arrayListnama.get(position));
                        intent.putExtra("ket", arrayListket.get(position));
                        intent.putExtra("gambar", arrayListgambar.get(position));
                        intent.putExtra("art", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 4:
                        intent.putExtra("nama", arrayListnama.get(position));
                        intent.putExtra("ket", arrayListket.get(position));
                        intent.putExtra("gambar", arrayListgambar.get(position));
                        intent.putExtra("art", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 5:
                        intent.putExtra("nama", arrayListnama.get(position));
                        intent.putExtra("ket", arrayListket.get(position));
                        intent.putExtra("gambar", arrayListgambar.get(position));
                        intent.putExtra("art", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 6:
                        intent.putExtra("nama", arrayListnama.get(position));
                        intent.putExtra("ket", arrayListket.get(position));
                        intent.putExtra("gambar", arrayListgambar.get(position));
                        intent.putExtra("art", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 7:
                        intent.putExtra("nama", arrayListnama.get(position));
                        intent.putExtra("ket", arrayListket.get(position));
                        intent.putExtra("gambar", arrayListgambar.get(position));
                        intent.putExtra("art", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 8:
                        intent.putExtra("nama", arrayListnama.get(position));
                        intent.putExtra("ket", arrayListket.get(position));
                        intent.putExtra("gambar", arrayListgambar.get(position));
                        intent.putExtra("art", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 9:
                        intent.putExtra("nama", arrayListnama.get(position));
                        intent.putExtra("ket", arrayListket.get(position));
                        intent.putExtra("gambar", arrayListgambar.get(position));
                        intent.putExtra("art", descs);
                        v.getContext().startActivity(intent);
                        break;
                    case 10:
                        intent.putExtra("nama", arrayListnama.get(position));
                        intent.putExtra("ket", arrayListket.get(position));
                        intent.putExtra("gambar", arrayListgambar.get(position));
                        intent.putExtra("art", descs);
                        v.getContext().startActivity(intent);
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListnama.size();
    }
}