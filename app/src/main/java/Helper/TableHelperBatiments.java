package Helper;

import java.util.ArrayList;

/**
 * Created by jeromebriois on 13/09/2017.
 */

public  abstract class TableHelperBatiments {

    private static final String BATIMENT_KEY = "ID";
    private static final String BATIMENT_LEVEL = "LEVEL";
    private static final String BATIMENT_LOGO = "LOGO";
    private static final String BATIMENT_TYPE= "TYPE";

    protected String _BATIMENT_TABLE_NAME;
    protected ArrayList<String> _batimentsArray;


    protected TableHelperBatiments(String BATIMENT_TABLE_NAME) {
        this._BATIMENT_TABLE_NAME = BATIMENT_TABLE_NAME;

    }

    protected TableHelperBatiments(){

        this._batimentsArray = new ArrayList<String>();

    }

    protected String createTable(){

        String BATIMENT_TABLE_CREATE =
                "CREATE TABLE " + _BATIMENT_TABLE_NAME + " (" +
                        BATIMENT_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        BATIMENT_LEVEL + " INTEGER, " +
                        BATIMENT_LOGO + " TEXT NOT NULL, " +
                        BATIMENT_TYPE + " TEXT NOT NULL);";

        return(BATIMENT_TABLE_CREATE);

    }

    protected String insertTable(){

        String BATIMENT_INSERT_TABLE =
                "INSERT INTO "+ _BATIMENT_TABLE_NAME + " ("+
                        BATIMENT_LEVEL + ", "+
                        BATIMENT_LOGO + ", "+
                        BATIMENT_TYPE+ " )"
                        + " VALUES";

        return(BATIMENT_INSERT_TABLE);

    }

    protected String dropTable(){

        String BATIMENT_TABLE_DROP = "DROP TABLE IF EXISTS " +_BATIMENT_TABLE_NAME+ ";";
        return(BATIMENT_TABLE_DROP);
    }

}
