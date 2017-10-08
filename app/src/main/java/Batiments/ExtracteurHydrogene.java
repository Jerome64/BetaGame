package Batiments;

import android.database.sqlite.SQLiteDatabase;

import java.util.Iterator;

import Helper.TableHelperRessources;

/**
 * Created by jeromebriois on 10/09/2017.
 */

public class ExtracteurHydrogene extends TableHelperRessources {


    public ExtracteurHydrogene(String RECOLTEUR_RESSOURCES_TABLE_NAME) {
        super(RECOLTEUR_RESSOURCES_TABLE_NAME);
    }

    public ExtracteurHydrogene() {

        this.RECOLTEUR_RESSOURCES_TABLE_NAME = "EXTRACTEUR_HYDROGENE";
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

    public void createExtracteurHydrogene(SQLiteDatabase db){

        db.execSQL(this.createTable());
        this.insertData(db);
    }

    public void dropExtracteurHydrogene(SQLiteDatabase db){

        db.execSQL(this.dropTable());
    }


}
