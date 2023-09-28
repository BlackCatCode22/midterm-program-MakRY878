import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Hyena extends Animal {

    //create a static member variable that accumulates the number of hyenas created
    private static int numOfHyenas = 0;
    public static int getNumOfHyenas() {
        return numOfHyenas;
    }
    //create a constructor that will increment numOfHyenas when a new hyena object is created

    public Hyena() {
        System.out.println("\n A new Hyena  was created.");
        numOfHyenas++;

    }
    //create a method that inputs hyena names from a file named: animalNames.txt

    public static void inputHyenaNames() {
        List<String> myListofHyenaNames = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader("C:\\Users\\Makal\\OneDrive\\Documents\\newFile\\animalNames.txt"));
             Scanner scanner = new Scanner(System.in)) {

            String line;
            System.out.println("Press Enter to read the next line (or 'q' to quit): ");
            int lineNum = 1;

            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);

                if (lineNum == 3) {
                    String[] values = line.split(",");
                    for (String value : values) {
                        myListofHyenaNames.add(value.trim());
                    }
                }

                String userInput = scanner.nextLine();
                if ("q".equalsIgnoreCase(userInput)) {
                    break;
                }

                lineNum++;
            }
        } catch (IOException e) {
            e.printStackTrace();

//create an ID for our new animal



            }
        }





}