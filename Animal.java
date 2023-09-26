public class Animal {

    private static int numOfAnimals = 0;

    //create a getter
    //what type of method is this? is it static and belongs to a class or
    //is this method used with objects.
    public int getNumOfAnimals() {
       return numOfAnimals;
    }


    //constructor

    public  Animal(){
        System.out.println("\n A new animal was created.");
        numOfAnimals++;
    }
}
