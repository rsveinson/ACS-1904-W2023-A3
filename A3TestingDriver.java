import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.beans.XMLEncoder;
import java.io.FileOutputStream;

/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class A3TestingDriver{
    public static void main(String[] args)throws FileNotFoundException {
        // the encoder object references the file
        XMLEncoder  encoder = new XMLEncoder(new FileOutputStream("a2TestXML.xml"));
        
        Student harry = new Student("Harry", "Potter", 2, 3.65);
        Student ron = new Student("Ron", "Weasley", 2, 2.21);
        Student hermione = new Student("Hermione", "Granger", 2, 4.5);
        Student cho = new Student("Cho", "Chiang", 3, 4.05);
        Student ginny = new Student("Ginny", "Weasley", 1, 3.9);
        
        Instructor snape = new Instructor("Severus", "Snape", "M.Sc.");
        Instructor mcg = new Instructor("Minerva", "McGonigal", "Ph.D.");
        
        Course course1 = new Course("WIZ-2666", "Potions II");
        Course course2 = new Course("WIZ-2989", "Transfiguration");

        harry.addCourse(course1);
        ron.addCourse(course1);
        hermione.addCourse(course1);
        cho.addCourse(course1);
        
        harry.addCourse(course2);
        ron.addCourse(course2);
        hermione.addCourse(course2);
        ginny.addCourse(course2);
        
        course1.setInstructor(snape);
        course2.setInstructor(mcg);
        
        // test the display class list (test the association between student and 
        // course and between instructor and course
        System.out.println(course1.displayClassList());
        System.out.println();
        System.out.println(course2.displayClassList());
        
        // test that the association is workin in both directions
        System.out.println(harry.displayCourses());
        System.out.println(snape.displayCourses());
        
        // test the Person arraylist
        ArrayList<Person> people = new ArrayList<>();
        people.add(harry); 
        people.add(ron); 
        people.add(hermione); 
        people.add(ginny); 
        people.add(cho);
        people.add(snape);
        people.add(mcg);
        
        printList(people);
        
        // write the stuff to xml files
        
        System.out.println("end of program");
    }
    public static void printList(ArrayList<Person> list){
        for(Person p : list)
            if(p instanceof Student)
                System.out.println(p);
        }// end printlist
}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
