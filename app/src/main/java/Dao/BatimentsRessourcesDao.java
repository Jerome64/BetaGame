package Dao;

import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import Tables.BatimentsRessources;

/**
 * Created by jeromebriois on 12/09/2017.
 */

public class BatimentsRessourcesDao extends BaseDao {

    private static final String RECOLTEUR_RESSOURCES_KEY = "ID";
    private static final String RECOLTEUR_RESSOURCES_QUANTITE = "QUANTITE";
    private static final String RECOLTEUR_RESSOURCES_QUANTITE_ACIER = "ACIER";
    private static final String RECOLTEUR_RESSOURCES_QUANTITE_ALUMINIUM = "ALUMINIUM";
    private static final String RECOLTEUR_RESSOURCES_QUANTITE_HYDROGENE = "HYDROGENE";
    private static final String RECOLTEUR_RESSOURCES_QUANTITE_ENERGIE = "ENERGIE";
    private static final String RECOLTEUR_RESSOURCES_TEMPS_CONSTRUCTION = "TEMPS";

    private String _RECOLTEUR_RESSOURCES_TABLE_NAME;

    private String[] _allColumns = {

            RECOLTEUR_RESSOURCES_KEY,
            RECOLTEUR_RESSOURCES_QUANTITE,
            RECOLTEUR_RESSOURCES_QUANTITE_ACIER,
            RECOLTEUR_RESSOURCES_QUANTITE_ALUMINIUM,
            RECOLTEUR_RESSOURCES_QUANTITE_ENERGIE,
            RECOLTEUR_RESSOURCES_QUANTITE_HYDROGENE,
            RECOLTEUR_RESSOURCES_TEMPS_CONSTRUCTION

    };

    public BatimentsRessourcesDao(Context contextObjet, String tableName) {

        super(contextObjet);
        this._RECOLTEUR_RESSOURCES_TABLE_NAME = tableName;



    }

    public List<BatimentsRessources> getBatimentsRessources() {

        Cursor cursor = this.dataBase.query(this._RECOLTEUR_RESSOURCES_TABLE_NAME, this._allColumns, null, null, null, null, null);
        if(cursor.getCount() == 0){

            cursor.close();
            return null;
        }
        List<BatimentsRessources> batimentsRessourcesList = new ArrayList<>();
        while (cursor.moveToNext()){
            BatimentsRessources batimentsRessources = new BatimentsRessources(this._RECOLTEUR_RESSOURCES_TABLE_NAME);
            batimentsRessources.set_id(cursor.getLong(0));
            batimentsRessources.set_quantite(cursor.getLong(1));
            batimentsRessources.set_acier(cursor.getLong(2));
            batimentsRessources.set_aluminium(cursor.getLong(3));
            batimentsRessources.set_hydrogene(cursor.getLong(4));
            batimentsRessources.set_energie(cursor.getLong(5));
            batimentsRessources.set_temps(cursor.getLong(6));

            batimentsRessourcesList.add(batimentsRessources);
        }
        cursor.close();
        return batimentsRessourcesList;
    }

    public void ajouter(BatimentsRessources batimentsRessources) {

    }

    public void supprimer(long id) {

    }

    public void modifier(BatimentsRessources batimentsRessources) {

    }

    /*public BatimentsRessources selectionner(long id) {

    }*/
}

