/**
 * Created by andeski on 6/28/16.
 */
public class Main {

    public static String animal_1 = "lizard";
//    public static String animal_2 = "bat";


    public static void main(String[] args) {
        Reptile reptile_one = new TraitsReptile();
        Mammal mammal_one = new TraitsMammal();
        Animal animal_one = new Animal();

        animal_one.setBloodTemp("cold");
        System.out.println("Your blood temperature is " + animal_one.getmBloodTemp());

        // Setting Reptile Variables
        reptile_one.setland(true);
        reptile_one.setwater(false);

        // Setting Reptile Trait Variables
        ((TraitsReptile)reptile_one).setMangermanprob(true);
        ((TraitsReptile)reptile_one).setMslippery(true);
        ((TraitsReptile)reptile_one).getRtraits();

        // setting mammal variables
        mammal_one.setland(true);
        mammal_one.setwater(false);
        mammal_one.setsky(true);

        // Setting Mammal Trait Variables
        ((TraitsMammal)mammal_one).setmHairy(true);
        ((TraitsMammal)mammal_one).setfeet(2);
        ((TraitsMammal)mammal_one).setmWings(false);

        // printing out results
//        System.out.println(mammal_one.getland());
//        System.out.println(((TraitsMammal)mammal_one).getHairy());

        if ((reptile_one.getland()) && (((TraitsReptile)reptile_one).getslippery()) && (animal_one.getmBloodTemp() == "cold")) {
            System.out.println("You are a " + animal_1 + " who lives on land." );
        }
        System.out.println("\n");
        if ((mammal_one.getland()) && ((TraitsMammal)mammal_one).getHairy() || ((TraitsMammal)mammal_one).getFeet() == 2) {
            System.out.println("It is " + ((TraitsMammal)mammal_one).getHairy() + " that you have hair.");
            System.out.println("You have " + ((TraitsMammal)mammal_one).getFeet() + " legs");
            System.out.println("It is " + ((TraitsMammal)mammal_one).getmWings() + " that you have wings");
            System.out.println("You are a person, congratulations!");
        }

    }

}
