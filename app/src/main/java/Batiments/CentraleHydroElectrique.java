package Batiments;

import android.database.sqlite.SQLiteDatabase;

import java.util.Iterator;

import Helper.TableHelperRessources;

/**
 * Created by jeromebriois on 04/09/2017.
 */

public class CentraleHydroElectrique extends TableHelperRessources {


        public CentraleHydroElectrique(String RECOLTEUR_RESSOURCES_TABLE_NAME) {
            super(RECOLTEUR_RESSOURCES_TABLE_NAME);
        }

        public CentraleHydroElectrique() {

            this.RECOLTEUR_RESSOURCES_TABLE_NAME = "CENTRALE_HYDROELECTRIQUE";
        }



        private void constructData(){

            this._tableHelpersArray.add(" ( 10, 20, 30, 40, 50, 60);");
            this._tableHelpersArray.add(" ( 10, 20, 30, 40, 50, 60);");
            this._tableHelpersArray.add(" ( 10, 20, 30, 40, 50, 60);");
            this._tableHelpersArray.add(" ( 10, 20, 30, 40, 50, 60);");
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

        public void createCentraleHydroElectrique(SQLiteDatabase db){

            db.execSQL(this.createTable());
            this.insertData(db);
        }

        public void dropCentraleHydroElectrique(SQLiteDatabase db){

            db.execSQL(this.dropTable());
        }


    }

