public class Main {
    public static void main(String[] args) {

        //call the static method to create a list of names

        Hyena.inputHyenaNames();

        System.out.println("\n Welcome to the zoo.");
        //look at our animal names file
        //call inputHyenaNames()

        Hyena.inputHyenaNames();


        // create a Hyena object


        Hyena myNewHyena = new Hyena();

        System.out.println("\n Number of animals is " + myNewHyena.getNumOfAnimals() );
        System.out.println("\n Number of hyenas: " + myNewHyena.getNumOfHyenas());

        Hyena anotherHyena = new Hyena();

        System.out.println("\n Number of animals is " + myNewHyena.getNumOfAnimals() );
        System.out.println("\n Number of hyenas: " + anotherHyena.getNumOfHyenas());

    }
}