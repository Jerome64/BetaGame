package Helper;

import java.util.ArrayList;

/**
 * Created by jeromebriois on 04/09/2017.
 */

public  abstract class TableHelperRessources {

        private static final String RECOLTEUR_RESSOURCES_KEY = "ID";
        private static final String RECOLTEUR_RESSOURCES_QUANTITE = "QUANTITE";
        private static final String RECOLTEUR_RESSOURCES_QUANTITE_ACIER = "ACIER";
        private static final String RECOLTEUR_RESSOURCES_QUANTITE_ALUMINIUM = "ALUMINIUM";
        private static final String RECOLTEUR_RESSOURCES_QUANTITE_HYDROGENE = "HYDROGENE";
        private static final String RECOLTEUR_RESSOURCES_QUANTITE_ENERGIE = "ENERGIE";
        private static final String RECOLTEUR_RESSOURCES_TEMPS_CONSTRUCTION = "TEMPS";

        protected String RECOLTEUR_RESSOURCES_TABLE_NAME;
        protected ArrayList<String> _tableHelpersArray;


        protected TableHelperRessources(String RECOLTEUR_RESSOURCES_TABLE_NAME) {
            this.RECOLTEUR_RESSOURCES_TABLE_NAME = RECOLTEUR_RESSOURCES_TABLE_NAME;

        }

        protected TableHelperRessources(){

            this._tableHelpersArray = new ArrayList<String>();

        }

        protected String createTable(){

            String RECOLTEUR_RESSOURCES_TABLE_CREATE =
                    "CREATE TABLE " + RECOLTEUR_RESSOURCES_TABLE_NAME + " (" +
                            RECOLTEUR_RESSOURCES_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                            RECOLTEUR_RESSOURCES_QUANTITE + " INTEGER, " +
                            RECOLTEUR_RESSOURCES_QUANTITE_ACIER + " INTEGER, " +
                            RECOLTEUR_RESSOURCES_QUANTITE_ALUMINIUM + " INTEGER, " +
                            RECOLTEUR_RESSOURCES_QUANTITE_HYDROGENE + " INTEGER, " +
                            RECOLTEUR_RESSOURCES_QUANTITE_ENERGIE + " INTEGER, " +
                            RECOLTEUR_RESSOURCES_TEMPS_CONSTRUCTION + " INTEGER );";

            return(RECOLTEUR_RESSOURCES_TABLE_CREATE);

        }

        protected String insertTable(){

            String RECOLTEUR_RESSOURCES_INSERT_TABLE =
                    "INSERT INTO "+ RECOLTEUR_RESSOURCES_TABLE_NAME + " ("+
                            RECOLTEUR_RESSOURCES_QUANTITE+ ", "+
                            RECOLTEUR_RESSOURCES_QUANTITE_ACIER + ", "+
                            RECOLTEUR_RESSOURCES_QUANTITE_ALUMINIUM + ", "+
                            RECOLTEUR_RESSOURCES_QUANTITE_HYDROGENE + ", "+
                            RECOLTEUR_RESSOURCES_QUANTITE_ENERGIE+ ", "+
                            RECOLTEUR_RESSOURCES_TEMPS_CONSTRUCTION + " )"
                            + " VALUES";

            return(RECOLTEUR_RESSOURCES_INSERT_TABLE);

        }

        protected String dropTable(){

            String RECOLTEUR_RESSOURCES_TABLE_DROP = "DROP TABLE IF EXISTS " +RECOLTEUR_RESSOURCES_TABLE_NAME+ ";";
            return(RECOLTEUR_RESSOURCES_TABLE_DROP);
        }

    }
