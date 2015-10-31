package com.example.sikikan.recycleviewtest;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private EdityoAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View layout = inflater.inflate(R.layout.activity_main, container, false);
        recyclerView = (RecyclerView) layout.findViewById(R.id.drawerList);
        adapter = new EdityoAdapter(startActionMode(getData()));
        return layout;
    }

    public static List<Information> getData(){
        List<Information> data = new ArrayList<>();
        int[] icons = {R.drawable.chuck_norris, R.drawable.haji_lulung};
        String[] titles = {"Chucky", "Lulungs"};
        for (int i=0; i<titles.length && i<icons.length; i++)
        {
            Information current= new Information();
            current.iconId=icons[i];
            current.title= titles[i];
            data.add(current);
        }
        return data;
    }
}
