package Dao;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Possessions.Batiments;
import Tables.BatimentsActivite1;

/**
 * Created by jeromebriois on 13/09/2017.
 */

public class BatimentsActivite1Dao extends BaseDao {

    private static final String BATIMENT_KEY = "ID";
    private static final String BATIMENT_LEVEL = "LEVEL";
    private static final String BATIMENT_LOGO = "LOGO";
    private static final String BATIMENT_TYPE= "TYPE";

    private String _BATIMENT_TABLE_NAME;

    private String[] _allColumns = {

            BATIMENT_KEY,
            BATIMENT_LEVEL,
            BATIMENT_LOGO,
            BATIMENT_TYPE

    };

    public BatimentsActivite1Dao(Context Context, String _BATIMENT_TABLE_NAME) {
        super(Context);
        this._BATIMENT_TABLE_NAME = _BATIMENT_TABLE_NAME;
    }

    public List<BatimentsActivite1> getBatiments() {

        Cursor cursor = this.dataBase.query(this._BATIMENT_TABLE_NAME, this._allColumns, null, null, null, null, null);
        if(cursor.getCount() == 0){

            cursor.close();
            return null;
        }
        List<BatimentsActivite1> batimentList = new ArrayList<>();
        while (cursor.moveToNext()){
            BatimentsActivite1 batimentsActivite1 = new BatimentsActivite1(this._BATIMENT_TABLE_NAME);
            batimentsActivite1.set_id(cursor.getLong(0));
            batimentsActivite1.set_level(cursor.getLong(1));
            batimentsActivite1.set_logo(cursor.getString(2));
            batimentsActivite1.set_type(cursor.getString(3));

            batimentList.add(batimentsActivite1);
        }
        cursor.close();
        return batimentList;
    }

    public void ajouter(BatimentsActivite1 batimentsActivite1) {

    }

    public void supprimer(long id) {

    }

    public void modifier(BatimentsActivite1 batimentsActivite1) {

    }

    /*public BatimentsRessources selectionner(long id) {

    }*/
}


