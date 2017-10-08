package Possessions;

import android.database.sqlite.SQLiteDatabase;

import java.util.Iterator;

import Helper.TableHelperBatiments;

/**
 * Created by jeromebriois on 13/09/2017.
 */

public class Batiments extends TableHelperBatiments {

    public Batiments(String BATIMENT_TABLE_NAME) {
        super(BATIMENT_TABLE_NAME);
    }

    public Batiments() {

        this._BATIMENT_TABLE_NAME = "BATIMENTS";
    }

    private void constructData() {

        this._batimentsArray.add(" ( 0, \"Usine_Alliages_Acier\", \"Usine_Alliages_Acier\");");
        this._batimentsArray.add(" ( 0, \"Mine_Aluminium\", \"Mine_Aluminium\");");
        this._batimentsArray.add(" ( 0, \"Extracteur_Hydrogene\", \"Extracteur_Hydrogene\");");
        this._batimentsArray.add(" ( 0, \"Centrale_Hydroelectrique\", \"Centrale_Hydroelectrique\");");
        this._batimentsArray.add(" ( 0, \"Depot_Acier\", \"Depot_Acier\");");
        this._batimentsArray.add(" ( 0, \"Depot_Aluminium\", \"Depot_Aluminium\");");
        this._batimentsArray.add(" ( 0, \"Stockeur_Hydrogene\", \"Stockeur_Hydrogene\");");

    }


    private void insertData(SQLiteDatabase db) {

        String dataCompleted = "";
        this.constructData();

        for (Iterator<String> i = this._batimentsArray.iterator(); i.hasNext(); ) {

            String data = i.next();
            dataCompleted = insertTable() + data;
            db.execSQL(dataCompleted);
        }
    }

    public void createBatiments(SQLiteDatabase db) {

        db.execSQL(this.createTable());
        this.insertData(db);
    }

    public void dropBatiments(SQLiteDatabase db) {

        db.execSQL(this.dropTable());
    }
}
