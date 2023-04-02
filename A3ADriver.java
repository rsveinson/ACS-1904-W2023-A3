import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
/**
 * ACS-1904 Assignment 3
 */
public class A3ADriver
{
    public static void main(String[] args)throws IOException{
        // list of people
        Student harry = new Student("Harry", "Potter", 2, 3.65);
        Student ron = new Student("Ron", "Weasley", 2, 2.21);
        Student hermione = new Student("Hermione", "Granger", 2, 4.5);
        Student cho = new Student("Cho", "Chiang", 3, 4.05);
        Student ginny = new Student("Ginny", "Weasley", 1, 3.9);
        
        Instructor snape = new Instructor("Severus", "Snape", "M.Sc.");
        Instructor mcg = new Instructor("Minerva", "McGonigal", "Ph.D.");
        
        ArrayList<Person> people = new ArrayList<>();
        people.add(harry); 
        people.add(ron); 
        people.add(hermione); 
        people.add(ginny); 
        people.add(cho);
        
        // courses and associations
        Course course1 = new Course("WIZ-2666", "Potions II");
        Course course2 = new Course("WIZ-2989", "Transfiguration");
        
        // add some people to course 1
        course1.setInstructor(snape);
        harry.addCourse(course1);
        ron.addCourse(course1);
        hermione.addCourse(course1);
        cho.addCourse(course1);
        
        //add some people to course 2
        course2.setInstructor(mcg);
        harry.addCourse(course2);
        ron.addCourse(course2);
        hermione.addCourse(course2);
        ginny.addCourse(course2);
        
        // display class list
        System.out.println(course1.displayClassList());
        System.out.println(course2.displayClassList());
        
        // write to XML files
        XMLEncoder  encoder = new XMLEncoder(new FileOutputStream("As3-people.xml"));        
        encoder.writeObject(people);      
        encoder.close();
        System.out.println("people written to file");
        
        encoder = new XMLEncoder(new FileOutputStream("As3-courses.xml"));        
        encoder.writeObject(course1);
        encoder.writeObject(course2);
        encoder.close();
        System.out.println("courses written to file");
        
        System.out.println("end of program.");
    }
}
