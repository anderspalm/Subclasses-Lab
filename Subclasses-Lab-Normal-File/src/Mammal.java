/**
 * Created by andeski on 6/28/16.
 */
public class Mammal extends Animal{

    private boolean mMwater;
    private boolean mMland;
    private String mname;
    private boolean mMsky;

    public Mammal(boolean Mwater, boolean Mland, boolean Msky, String name){
        super();
        mMwater = Mwater;
        mMland = Mland;
        mMsky = Msky;
        mname = name;
    }

    public Mammal(){
        super();
        mMwater = false;
        mMland = false;
        mMsky = false;
        mname = "Rien";
    }

    public void setName(String name) {
        mname = name;
    }

    public String getname() {
        return mname;
    }

    public void setwater(boolean Mwater) {
        mMwater = Mwater;
    }

    public boolean getwater() {
        return mMwater;
    }

    public void setsky(boolean Msky) {
        mMsky = Msky;
    }

    public boolean getsky() {
        return mMsky;
    }

    public void setland (boolean Mland) {
        if (Mland == true) {
            System.out.println("Your animal is land based");
        }
        else {
            System.out.println("Your animal is water based");
        }
    }

    public boolean getland() {
        return mMland;
    }
}
