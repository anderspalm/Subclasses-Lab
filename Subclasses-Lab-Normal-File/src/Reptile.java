/**
 * Created by andeski on 6/28/16.
 */
public class Reptile extends Animal{
    private boolean mrwater;
    private boolean mrland;

    public Reptile(boolean rwater, boolean rland, String WarmBlood){
        super(WarmBlood);
        mrwater = rwater;
        mrland = rland;
    }

    public Reptile(){
        super();
        mrland = false;
        mrwater = false;
//        mname = "Rien";
    }
//
//    private void setName(String name) {
//        mname = name;
//    }
//
//    private String getname() {
//        return mname;
//    }

    public void setwater(boolean rwater) {
        mrwater = rwater;
    }

    public boolean getwater() {
        return mrwater;
    }

    public void setland (boolean rland) {
        mrland = rland;
    }

    public boolean getland() {
        return mrland;
    }
}
