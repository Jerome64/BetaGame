package Tables;

/**
 * Created by jeromebriois on 13/09/2017.
 */

public class BatimentsActivite1 {

    private String _name;
    private long _id;
    private long _level;
    private String _logo;
    private String _type;

    public BatimentsActivite1(String name, long id, long level, String logo, String type) {
        this._name = name;
        this._id = id;
        this._level = level;
        this._logo = logo;
        this._type = type;
    }

    public BatimentsActivite1(String name) {
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

    public long get_level() {
        return this._level;
    }

    public void set_level(long level) {
        this._level = level;
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
                "Niveau_batiment: "+ get_level() + "\n" +
                "Logo: "+ get_logo() + "\n" +
                "Type:"+get_type();

    }
}

