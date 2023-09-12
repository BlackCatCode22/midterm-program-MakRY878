import java.util.ArrayList;

public class SampleZoo {
    public static void main(String[] args) {

        //create an animal

        Animal myAnimal = new Animal();
        myAnimal.animalName = "Banzai";

        //create an array list of students

        Student mystudent = new Student();

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        //name them

        student1.name = "Dorain";
        student2.name = "Opal";
        student3.name = "Fearne";

        //add them to the list

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);


        for (Student student : students) System.out.println("Student names are:" + student.name);


    }
}
