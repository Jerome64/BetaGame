package Batiments;

import android.database.sqlite.SQLiteDatabase;

import java.util.Iterator;

import Helper.TableHelperRessources;

/**
 * Created by jeromebriois on 10/09/2017.
 */

public class DepotAcier extends TableHelperRessources {


    public DepotAcier(String RECOLTEUR_RESSOURCES_TABLE_NAME) {
        super(RECOLTEUR_RESSOURCES_TABLE_NAME);
    }

    public DepotAcier() {

        this.RECOLTEUR_RESSOURCES_TABLE_NAME = "DEPOT_ACIER";
    }


    private void constructData() {

        this._tableHelpersArray.add(" ( 9, 18, 27, 36, 45, 54);");
    }

    private void insertData(SQLiteDatabase db) {

        String dataCompleted = "";
        this.constructData();

        for (Iterator<String> i = this._tableHelpersArray.iterator(); i.hasNext(); ) {

            String data = i.next();
            dataCompleted = insertTable() + data;
            db.execSQL(dataCompleted);
        }
    }

    public void createDepotAcier(SQLiteDatabase db) {

        db.execSQL(this.createTable());
        this.insertData(db);
    }

    public void dropDepotAcier(SQLiteDatabase db) {

        db.execSQL(this.dropTable());
    }
}

