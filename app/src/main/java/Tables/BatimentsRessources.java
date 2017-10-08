package Tables;


/**
 * Created by jeromebriois on 04/09/2017.
 */

public class BatimentsRessources {

    private String _name;
    private long _id;
    private long _quantite;
    private long _acier;
    private long _aluminium;
    private long _hydrogene;
    private long _energie;
    private long _temps;

    public BatimentsRessources(String name, int id, int quantite, int acier, int aluminium, int hydrogene, int energie, int temps) {

        this._name = name;
        this._id = id;
        this._quantite = quantite;
        this._acier = acier;
        this._aluminium = aluminium;
        this._hydrogene = hydrogene;
        this._energie = energie;
        this._temps = temps;
    }

    public BatimentsRessources(String name){

        this._name = name;
    }

    public long get_id() {
        return this._id;
    }

    public void set_id(long id) {
        this._id = id;
    }

    public long get_quantite() {
        return  this._quantite;
    }

    public void set_quantite(long quantite) {
        this._quantite = quantite;
    }

    public long get_acier() {
        return this._acier;
    }

    public void set_acier(long acier) {
        this._acier = acier;
    }

    public long get_aluminium() {
        return this._aluminium;
    }

    public void set_aluminium(long aluminium) {
        this._aluminium = aluminium;
    }

    public long get_hydrogene() {
        return this._hydrogene;
    }

    public void set_hydrogene(long hydrogene) {
        this._hydrogene = hydrogene;
    }

    public long get_energie() {
        return this._energie;
    }

    public void set_energie(long energie) {
        this._energie = energie;
    }

    public long get_temps() {
        return this._temps;
    }

    public void set_temps(long temps) {
        this._temps = temps;
    }

    public String toString(){

        return "Id: "+get_id() + "\n" +
                "Quantite_heure: "+get_quantite() + "\n" +
                "Acier "+get_acier() + "\n" +
                "Aluminium: "+get_aluminium() + "\n" +
                "Hydrogene "+get_hydrogene() + "\n" +
                "Energie "+get_energie() + "\n" +
                "Temps: "+get_temps();

    }
}
