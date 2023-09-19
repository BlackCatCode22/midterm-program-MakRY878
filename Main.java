
import java.io.*;
import java.util.ArrayList;
//MRY 9/19/23
//main.java
//driver class for zoo warm up
//create the genUniqueIDFunction
     public class main{
    String genUniqueID(String theSpecies){
        if (theSpecies.equals("lion")){
            //do somthing
    }
}

public class Main {
    public static void main(String[] args) {

        String pathName = "C:\\Users\\Makal\\Downloads\\newFile\\arrivingAnimals.txt";
        BufferedReader reader = null;
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;


        ArrayList<Animal> animalList = new ArrayList<>();


        try {
            reader = new BufferedReader(new FileReader(pathName));

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                //split the line into 6 substring
                String[] myArray = line.split(",");
                System.out.println("\n Array[0] is" + myArray[0]);
                System.out.println("\n Array[1] is" + myArray[1]);


                //create an animal object
                Animal anyAnimal = new Animal();

                Animal.numOfAnimals++;


                //fill the data
                anyAnimal.desc = myArray[0];
                anyAnimal.birthSeason = myArray[1];
                anyAnimal.weight = myArray[2];
                anyAnimal.orgin01 = myArray[3];
                anyAnimal.orgin02 = myArray[4];
                anyAnimal.color = myArray[5];


                // add the newly created animal object to the array list
                animalList.add(anyAnimal);
            }
bufferedReader.close();



//create and animal object
            Animal myNewAnimal = new Animal();

            myNewAnimal.desc = " description";

            System.out.println("\n desctription of new animal: " + myNewAnimal.desc);

            //open the arriving animals file
            for (Animal aniaml : animalList) {
                System.out.println(aniaml.desc);
                System.out.println(aniaml.birthSeason);
                System.out.println(aniaml.color);
                System.out.println(aniaml.weight);
                System.out.println(aniaml.orgin01);
                System.out.println(aniaml.orgin02);
                System.out.println("\n\n");
            }

            System.out.println("The number of animals is: " + Animal.numOfAnimals);




        }
    }
}

//hy + number of hyenas
