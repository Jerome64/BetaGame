package DataBaseHandler;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import Batiments.CentraleHydroElectrique;
import Batiments.DepotAcier;
import Batiments.DepotAluminium;
import Batiments.ExtracteurHydrogene;
import Batiments.MineAluminium;
import Batiments.StockeurHydrogene;
import Batiments.UsineAlliagesAcier;
import Possessions.Batiments;
import Possessions.Ressources;

/**
 * Created by jeromebriois on 04/09/2017.
 */

public class DataBaseHandler  extends  SQLiteOpenHelper{

        private CentraleHydroElectrique _centraleHydroElectrique;
        private ExtracteurHydrogene _extracteurHydrogene;
        private StockeurHydrogene _stockeurHydrogene;
        private MineAluminium _mineAluminium;
        private DepotAcier _depotAcier;
        private UsineAlliagesAcier _usineAlliagesAcier;
        private DepotAluminium _depotAluminium;
        private Ressources _ressources;
        private Batiments _batiments;

        public DataBaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
            this._centraleHydroElectrique = new CentraleHydroElectrique();
            this._extracteurHydrogene = new ExtracteurHydrogene();
            this._stockeurHydrogene = new StockeurHydrogene();
            this._mineAluminium = new MineAluminium();
            this._depotAcier = new DepotAcier();
            this._usineAlliagesAcier = new UsineAlliagesAcier();
            this._depotAluminium = new DepotAluminium();
            this._ressources = new Ressources();
            this._batiments = new Batiments();
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            this._centraleHydroElectrique.createCentraleHydroElectrique(db);
            this._extracteurHydrogene.createExtracteurHydrogene(db);
            this._stockeurHydrogene.createStockeurHydrogene(db);
            this._mineAluminium.createMineAluminium(db);
            this._depotAcier.createDepotAcier(db);
            this._usineAlliagesAcier.createUsineAlliagesAcier(db);
            this._depotAluminium.createDepotAluminium(db);
            this._ressources.createRessources(db);
            this._batiments.createBatiments(db);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            this._centraleHydroElectrique.dropCentraleHydroElectrique(db);
            this._extracteurHydrogene.dropExtracteurHydrogene(db);
            this._stockeurHydrogene.dropStockeurHydrogene(db);
            this._mineAluminium.dropMineAluminium(db);
            this._depotAcier.dropDepotAcier(db);
            this._usineAlliagesAcier.dropUsineAlliagesAcier(db);
            this._depotAluminium.dropDepotAluminium(db);
            this._ressources.dropRessources(db);
            this._batiments.dropBatiments(db);
            this.onCreate(db);
        }


    }

