package com.example.recylerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView clubRecylerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clubRecylerView =(RecyclerView) findViewById(R.id.club_recview);
        List<ClubModel>clubList =new ArrayList<ClubModel>();

        clubList.add(new ClubModel("Liverpool","https://th.bing.com/th/id/R.786d059e5a8614c0bcb60ad4bbe8912e?rik=WK03beYc41r3Hg&riu=http%3a%2f%2flogos-download.com%2fwp-content%2fuploads%2f2016%2f05%2fLiverpool_logo_crest_emblem.png&ehk=3CSiebxkYFrUAjPA2bQsiowxUyPg7pe2XJr%2b%2bo5Ef5E%3d&risl=&pid=ImgRaw&r=0"));
        clubList.add(new ClubModel("Manchester City", "https://dreamleague-soccer-kits.com/wp-content/uploads/2019/02/Logo-Of-Manchester-City.png"));
        clubList.add(new ClubModel("Arsenal", "https://seeklogo.com/images/A/arsenal-logo-B27C071FE1-seeklogo.com.png"));
        clubList.add(new ClubModel("Chelsea", "https://img2.pngdownload.id/20180920/ksj/kisspng-chelsea-f-c-desktop-wallpaper-football-chelsea-fc-club-schedule-7-5ba423d83a4672.0434572915374837362387.jpg"));
        clubList.add(new ClubModel("Blackburn Rovers", "https://seeklogo.com/images/B/blackburn-rovers-fc-logo-645030E03B-seeklogo.com.png"));

        ClubAdapter clubAdapter =new ClubAdapter(getApplicationContext(),clubList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        clubRecylerView.setLayoutManager(layoutManager);
        clubRecylerView.setAdapter(clubAdapter);


    }
}