package Tables;

/**
 * Created by jeromebriois on 12/09/2017.
 */

public class Possessions {

    private String _name;
    private long _id;
    private long _quantite;
    private String _logo;
    private String _type;

    public Possessions(String _name, long _id, long _quantite, String _logo, String _type) {
        this._name = _name;
        this._id = _id;
        this._quantite = _quantite;
        this._logo = _logo;
        this._type = _type;
    }

    public Possessions(String name) {
        this._name = name;
    }

    public String get_name() {
        return this._name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public long get_id() {
        return this._id;
    }

    public void set_id(long id) {
        this._id = id;
    }

    public long get_quantite() {
        return this._quantite;
    }

    public void set_quantite(long quantite) {
        this._quantite = quantite;
    }

    public String get_logo() {
        return this._logo;
    }

    public void set_logo(String logo) {
        this._logo = logo;
    }

    public String get_type() {
        return this._type;
    }

    public void set_type(String type) {
        this._type = type;
    }

    public String toString(){

        return "Id: "+get_id() + "\n" +
                "Quantite_actuelle: "+ get_quantite() + "\n" +
                "Logo: "+ get_logo() + "\n" +
                "Type:"+get_type();

    }
}
