package Dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import DataBaseHandler.DataBaseHandler;

/**
 * Created by jeromebriois on 04/09/2017.
 */

public class BaseDao {

    protected final static int VERSION = 26;
    protected final static String NOM = "database.db";

    protected SQLiteDatabase dataBase = null;
    protected DataBaseHandler mHandler = null;

    public BaseDao(Context Context) {
        this.mHandler = new DataBaseHandler(Context, NOM, null, VERSION);
    }

    public BaseDao(){

    }


    public SQLiteDatabase open() {
        this.dataBase = mHandler.getWritableDatabase();
        return(this.dataBase);
    }


    public void close() {
        this.dataBase.close();
    }

    public SQLiteDatabase getDb() {
        return this.dataBase;
    }
}
