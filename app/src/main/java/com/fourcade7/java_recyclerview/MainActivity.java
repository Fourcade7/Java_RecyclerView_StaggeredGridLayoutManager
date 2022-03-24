package com.fourcade7.java_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    DotaAdapter dotaAdapter;


    ArrayList<Dota> dotaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerview1);


        dotaArrayList=new ArrayList<>();


        dotaArrayList.add(new Dota(R.drawable.axe,"Axe"));
        dotaArrayList.add(new Dota(R.drawable.prr,"Invoker"));
        dotaArrayList.add(new Dota(R.drawable.pubg,"Pudge"));
        dotaArrayList.add(new Dota(R.drawable.terror,"Terror"));
        dotaArrayList.add(new Dota(R.drawable.torm,"Storm"));
        dotaArrayList.add(new Dota(R.drawable.axe,"Axe"));
        dotaArrayList.add(new Dota(R.drawable.prr,"Invoker"));
        dotaArrayList.add(new Dota(R.drawable.pubg,"Pudge"));
        dotaArrayList.add(new Dota(R.drawable.terror,"Terror"));
        dotaArrayList.add(new Dota(R.drawable.torm,"Storm"));

        dotaAdapter=new DotaAdapter(MainActivity.this,dotaArrayList);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(dotaAdapter);





    }
}