package Possessions;

import android.database.sqlite.SQLiteDatabase;

import java.util.Iterator;

import Helper.TableHelperPossessions;

/**
 * Created by jeromebriois on 12/09/2017.
 */

public class Ressources extends TableHelperPossessions {


    public Ressources(String POSSESSION_TABLE_NAME) {

        super(POSSESSION_TABLE_NAME);
    }

    public Ressources() {

        this._POSSESSION_TABLE_NAME = "RESSOURCES";
    }


    private void constructData() {

        this._possessionArray.add(" ( 0, \"Acier\", \"Acier\");");
        this._possessionArray.add(" ( 0, \"Aluminium\", \"Aluminium\");");
        this._possessionArray.add(" ( 0, \"hydrogene\", \"Hydrogene\");");
        this._possessionArray.add(" ( 0, \"Energie\", \"Energie\");");
        this._possessionArray.add(" ( 0, \"Diamant\", \"Diamant\");");
    }


    private void insertData(SQLiteDatabase db) {

        String dataCompleted = "";
        this.constructData();

        for (Iterator<String> i = this._possessionArray.iterator(); i.hasNext(); ) {

            String data = i.next();
            dataCompleted = insertTable() + data;
            db.execSQL(dataCompleted);
        }
    }

    public void createRessources(SQLiteDatabase db) {

        db.execSQL(this.createTable());
        this.insertData(db);
    }

    public void dropRessources(SQLiteDatabase db) {

        db.execSQL(this.dropTable());
    }
}

