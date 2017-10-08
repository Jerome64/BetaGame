package Dao;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Tables.Possessions;

/**
 * Created by jeromebriois on 12/09/2017.
 */

public class PossessionsDao extends BaseDao {

    private static final String POSSESSION_KEY = "ID";
    private static final String POSSESSION_QUANTITE = "QUANTITE";
    private static final String POSSESSION_LOGO = "LOGO";
    private static final String POSSESSION_TYPE= "TYPE";

    private String _POSSESSION_TABLE_NAME;

    private String[] _allColumns = {

            POSSESSION_KEY,
            POSSESSION_QUANTITE,
            POSSESSION_LOGO,
            POSSESSION_TYPE

    };

    public PossessionsDao(Context Context, String _POSSESSION_TABLE_NAME) {
        super(Context);
        this._POSSESSION_TABLE_NAME = _POSSESSION_TABLE_NAME;
    }

    public List<Possessions> getPossessions() {

        Cursor cursor = this.dataBase.query(this._POSSESSION_TABLE_NAME, this._allColumns, null, null, null, null, null);
        if(cursor.getCount() == 0){

            cursor.close();
            return null;
        }
        List<Possessions> possessionsList = new ArrayList<>();
        while (cursor.moveToNext()){
            Possessions possessions = new Possessions(this._POSSESSION_TABLE_NAME);
            possessions.set_id(cursor.getLong(0));
            possessions.set_quantite(cursor.getLong(1));
            possessions.set_logo(cursor.getString(2));
            possessions.set_type(cursor.getString(3));

            possessionsList.add(possessions);
        }
        cursor.close();
        return possessionsList;
    }

    public void ajouter(Possessions possessions) {

    }

    public void supprimer(long id) {

    }

    public void modifier(Possessions possessions) {

    }

    /*public BatimentsRessources selectionner(long id) {

    }*/
}

