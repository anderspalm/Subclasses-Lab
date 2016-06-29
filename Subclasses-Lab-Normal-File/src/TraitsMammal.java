/**
 * Created by andeski on 6/28/16.
 */
public class TraitsMammal extends Mammal{
    private boolean mWings;
    private boolean mHairy;
    private int mFeet;

    public TraitsMammal(boolean Wings, boolean Hair, int Feet){
        super();
        mWings = Wings;
        mHairy = Hair;
        mFeet = Feet;
    }

    public  TraitsMammal() {
        mWings = true;
        mHairy = true;
        mFeet = 2;
    }

    public void setmWings(boolean name) {
        mWings = name;
    }

    public void setfeet(int num) {
        mFeet = num;
    }

    public void setmHairy(boolean name) {
        mHairy = name;
    }

    public boolean getHairy() {
        return mHairy;
    }

    public boolean getmWings() {
        return mWings;
    }

    public int getFeet() {
        return mFeet;
    }



//    public String getMtraits() {
//       int num = mFeet;
//        if (mWings == true) {
//            return "You have wings";
//        }
//        else if (mHairy == true) {
//            return "You have hair";
//        }
//        else if ((num>1) || (num == 0)){
//            return ("You have " + num + " feet.");
//        }
//        else if (num == 1) {
//            return  ("You have a foot.");
//        }
//        else {
//
//        }
//        return null;
//    }

}
