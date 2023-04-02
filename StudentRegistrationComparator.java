
/**
 * Write a description of class StudentRegistrationComparator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Comparator;

public class StudentRegistrationComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        int n = s2.getYear() - s1.getYear();
        
        if(n == 0)
            if(s2.getGPA() - s1.getGPA() < 0)
                n = -1;
            else
                n = 1;
            
        return n;    
    }
    
}
