import java.beans.XMLEncoder;
import java.beans.XMLDecoder;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
 */

public class A3B_Driver{
    public static void main(String[] args)throws FileNotFoundException {
        ArrayList<Person> people = new ArrayList();
        ArrayList<Student> students = new ArrayList();
        XMLDecoder decoder = new XMLDecoder( new FileInputStream("As3-people.xml"));

        people = (ArrayList)decoder.readObject();
        decoder.close();

        for(Person p : people){
            if(p instanceof Student)
                students.add((Student)p);      
        }

        for(Student s : students)
            System.out.println(s.getInfo());

        Collections.sort(students, new StudentRegistrationComparator());

        System.out.println("\nRegistration Order:\n");
        for(Student s : students)
            System.out.println(s.getInfo());      

        // write the registration order to xml
        XMLEncoder  encoder = new XMLEncoder(new FileOutputStream("As3-students.xml"));
        encoder.writeObject(students);      
        encoder.close();
        System.out.println("students written to file");
        
        System.out.println("end of program");
    }
}

/*****************************************
 * Description: brief description of the methods purpose
 * 
 * @param        each parameter of the method should be listed with an @param
 * @param        parametername description of parameter
 * 
 * @return       any return value will be noted here
 * ****************************************/
