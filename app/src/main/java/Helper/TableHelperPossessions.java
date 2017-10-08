package Helper;

import java.util.ArrayList;

/**
 * Created by jeromebriois on 12/09/2017.
 */

public  abstract class TableHelperPossessions {

    private static final String POSSESSION_KEY = "ID";
    private static final String POSSESSION_QUANTITE = "QUANTITE";
    private static final String POSSESSION_LOGO = "LOGO";
    private static final String POSSESSION_TYPE= "TYPE";

    protected String _POSSESSION_TABLE_NAME;
    protected ArrayList<String> _possessionArray;


    protected TableHelperPossessions(String POSSESSION_TABLE_NAME) {
        this._POSSESSION_TABLE_NAME = POSSESSION_TABLE_NAME;

    }

    protected TableHelperPossessions(){

        this._possessionArray = new ArrayList<String>();

    }

    protected String createTable(){

        String POSSESSION_TABLE_CREATE =
                "CREATE TABLE " + _POSSESSION_TABLE_NAME + " (" +
                        POSSESSION_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        POSSESSION_QUANTITE + " INTEGER, " +
                        POSSESSION_LOGO + " TEXT NOT NULL, " +
                        POSSESSION_TYPE + " TEXT NOT NULL);";

        return(POSSESSION_TABLE_CREATE);

    }

    protected String insertTable(){

        String POSSESSION_INSERT_TABLE =
                "INSERT INTO "+ _POSSESSION_TABLE_NAME + " ("+
                        POSSESSION_QUANTITE + ", "+
                        POSSESSION_LOGO + ", "+
                        POSSESSION_TYPE+ " )"
                        + " VALUES";

        return(POSSESSION_INSERT_TABLE);

    }

    protected String dropTable(){

        String POSSESSION_TABLE_DROP = "DROP TABLE IF EXISTS " +_POSSESSION_TABLE_NAME+ ";";
        return(POSSESSION_TABLE_DROP);
    }

}
