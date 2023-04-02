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

public class A3CDriver{
    public static void main(String[] args)throws FileNotFoundException {
        FitnessFacility facility = new FitnessFacility("The Dungeon");

        XMLDecoder decoder = new XMLDecoder( new FileInputStream("As3-courses.xml"));

        Course c1 = (Course)decoder.readObject();
        Course c2 = (Course)decoder.readObject();
        decoder.close();
        
        // display class list
        //System.out.println(c1.displayClassList());
        //System.out.println(c2.displayClassList());        
        
        // add the members to the facility i.e. add to the arraylist of members
        facility.addMember(c1.getInstructor());
        
        // now the students
        for(Student s : c1.getStudents()){
            facility.addMember(s);
        }
        
        // call the display gym info method to print out the facility information
        System.out.println(facility.displayGymInfo());

        // write the registration order to xml
        XMLEncoder  encoder = new XMLEncoder(new FileOutputStream("As3-gyminfo.xml"));
        encoder.writeObject(facility);      
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
