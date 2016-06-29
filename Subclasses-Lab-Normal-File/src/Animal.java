import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by andeski on 6/28/16.
 */
public class Animal {
    private String mWarmBlood;

    public Animal(String WarmBlood) {
        mWarmBlood = WarmBlood;
    }

    public Animal() {
        mWarmBlood = "not sure";
    }

    public void setBloodTemp(String WarmBlood){
        mWarmBlood = WarmBlood;
    }

    public String getmBloodTemp() {
        return mWarmBlood;
    }
}
