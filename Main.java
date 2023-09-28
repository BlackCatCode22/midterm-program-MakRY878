
//updated 9/28

public class Main {

    // Creating the genUniqueID method

    private static String genUniqueID(String theSpecies, int numOfSpecies){
        String prefix = "";
        int suffix = numOfSpecies + 1;
        if(theSpecies.contains("hyena")){
            prefix = "Hy";
        }
        return prefix + Integer.valueOf(suffix);


    }

    public static void main(String[] args) {

        //call the static method to create a list of names


        System.out.println("\n Welcome to the zoo.");
        //look at our animal names file
        //call inputHyenaNames()

       // Hyena.inputHyenaNames();


        // create a Hyena object


        Hyena myNewHyena = new Hyena();

        System.out.println("\n Number of animals is " + myNewHyena.getNumOfAnimals() );
        System.out.println("\n Number of hyenas: " + myNewHyena.getNumOfHyenas());

        Hyena anotherHyena = new Hyena();

        System.out.println("\n Number of animals is " + myNewHyena.getNumOfAnimals() );
        System.out.println("\n Number of hyenas: " + anotherHyena.getNumOfHyenas());

        //how many hyenas

        int currentNumOfHyenas = Hyena.getNumOfHyenas();

        System.out.println("\n the number of hyenas is: " + currentNumOfHyenas + "\n\n");

        Hyena oneMore = new Hyena();

        oneMore.setAnimalID("Hy09");
        System.out.println("\n The ID of oneMore is: " + oneMore.getAnimalID() );

        oneMore.setAnimalColor("brown stripes");
        System.out.println("\n The color of oneMore is: " + oneMore.getAnimalColor());

        String theNewID = genUniqueID("hyena", 8);
        System.out.println("\n The new ID is: " + theNewID);

    }
}