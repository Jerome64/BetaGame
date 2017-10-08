package Batiments;

import android.database.sqlite.SQLiteDatabase;

import java.util.Iterator;

import Helper.TableHelperRessources;

/**
 * Created by jeromebriois on 10/09/2017.
 */

public class MineAluminium extends TableHelperRessources {


    public MineAluminium(String RECOLTEUR_RESSOURCES_TABLE_NAME) {
        super(RECOLTEUR_RESSOURCES_TABLE_NAME);
    }

    public MineAluminium() {

        this.RECOLTEUR_RESSOURCES_TABLE_NAME = "MINE_ALUMINIUM";
    }



    private void constructData(){

        this._tableHelpersArray.add(" ( 1, 2, 3, 4, 5, 6);");
        this._tableHelpersArray.add(" ( 1, 2, 3, 4, 5, 6);");
        this._tableHelpersArray.add(" ( 1, 2, 3, 4, 5, 6);");
        this._tableHelpersArray.add(" ( 1, 2, 3, 4, 5, 6);");
    }

    private void insertData(SQLiteDatabase db){

        String dataCompleted = "";
        this.constructData();

        for(Iterator<String> i = this._tableHelpersArray.iterator(); i.hasNext();){

            String data = i.next();
            dataCompleted = insertTable() + data;
            db.execSQL(dataCompleted);
        }
    }

    public void createMineAluminium(SQLiteDatabase db){

        db.execSQL(this.createTable());
        this.insertData(db);
    }

    public void dropMineAluminium(SQLiteDatabase db){

        db.execSQL(this.dropTable());
    }


}

