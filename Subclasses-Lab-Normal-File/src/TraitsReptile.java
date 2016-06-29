/**
 * Created by andeski on 6/28/16.
 */
import java.util.Scanner;
public class TraitsReptile extends Reptile{
    private boolean mangermanprob;
    private boolean mslippery;
    private boolean mwithshell;

    public TraitsReptile(boolean angermanprob, boolean slippery, boolean withshell){
        super();
        mangermanprob = angermanprob;
        mslippery = slippery;
        mwithshell = withshell;
    }

    public TraitsReptile() {
        mangermanprob = false;
        mslippery = false;
        mwithshell = false;
    }

    public void setMangermanprob(boolean name) {
        mangermanprob = name;
    }

    public void setMslippery(boolean a_name) {
        mslippery = a_name;
    }

    public void setMwithshell(boolean b_name) {
        mwithshell = b_name;
    }

    public boolean getSelfControl() {
        return mangermanprob;
    }

    public boolean getShell() {
        return mwithshell;
    }

    public boolean getslippery() {
        return mslippery;
    }

    public String getRtraits() {

        if (mangermanprob == true) {
            return "You have wings";
        }
        else if (mslippery == true) {
            return "You have hair";
        }
        else if (mwithshell == true){
            return ("You have a shell");
        }
       return null;
    }

}
