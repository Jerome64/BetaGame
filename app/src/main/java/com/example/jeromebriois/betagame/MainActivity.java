package com.example.jeromebriois.betagame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Batiments.CentraleHydroElectrique;
import Batiments.ExtracteurHydrogene;
import Dao.BatimentsActivite1Dao;
import Dao.BatimentsRessourcesDao;
import Dao.PossessionsDao;
import Tables.BatimentsActivite1;
import Tables.BatimentsRessources;
import Tables.Possessions;
import adapters.AdapterActivity1;

public class MainActivity extends AppCompatActivity {

    private RecyclerView _recyclerView;
    private List<Possessions> _possessionsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this._possessionsList = new ArrayList<>();
        setContentView(R.layout.activity_main);
        /*addRessources();*/
        this._recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        this._recyclerView.setLayoutManager(new GridLayoutManager(this, 5));
        this._recyclerView.setAdapter(new AdapterActivity1(this._possessionsList));
    }

    /*public void afficherTable(String tableName) {
        BatimentsActivite1Dao batimentsActivite1Dao = new BatimentsActivite1Dao(this,tableName);
        batimentsActivite1Dao.open();
        this._batimentsActivite1List = batimentsActivite1Dao.getBatiments();
        batimentsActivite1Dao.close();
        String test = null;
        Log.i("debug", tableName);
        for(Iterator<BatimentsActivite1> i = this._batimentsActivite1List.iterator(); i.hasNext();){

            BatimentsActivite1 r = i.next();
            test = r.toString();
            Log.i("debug", test);
        }*/

    public void addRessources(String tableName) {

        PossessionsDao possessionsDao = new PossessionsDao(this,tableName);
        possessionsDao.open();
        this._possessionsList = possessionsDao.getPossessions();
        this._possessionsList.add(new Possessions(tableName));
    }
}

