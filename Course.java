import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.io.Serializable;

/** 
 * ACS-1904 Assignment 3
 * @Sveinson
 * student number
*/

public class Course implements Serializable{
    // class constants and variables
    
    // instance variables
    private String courseNumber;
    private String courseName;
    
    // association
    private ArrayList<Student> students;
    private Instructor instructor;
    
    // constructors
    public Course(){
        courseNumber = "unknown";
        courseName = "unknown";
        students = new ArrayList<>();
        instructor = null;
    }// end no-arg constructor
    
     public Course(String cNumber, String cName){
        courseNumber = cNumber;
        courseName = cName;
        students = new ArrayList<>();
        instructor = null;
    }// end  constructor  
    
    // getters
    public String getCourseNumber(){
        return courseNumber;
    }// end get course number
    
    public String getCourseName(){
        return courseName;
    }// end get course naem
    
    public Instructor getInstructor(){
        return instructor;
    }// end get instructor
    
    public ArrayList<Student> getStudents(){
        return students;
    }
    
    // setters
    public void setCourseNumber(String cn){
        courseNumber = cn;
    }// end set course number
    
    public void setCourseName(String cn){
        courseName = cn;
    }// end set course name
    
    // not using i as the local parameter name for the instuctor object
    // because i is used by convention in for loops
    public void setInstructor(Instructor p){
        instructor = p;
        p.addCourse(this); // adding this course to the associated instructor
    }//end set instructor
    
    public void setStudents(ArrayList<Student> s){
        students = s;
    }
    
    // abstract method implementation if any
    
    // other methods
    public void addStudent(Student s){
        students.add(s);
        // sort student list
        Collections.sort(students);
    }// end add student
    
    public String displayClassList(){
        StringBuilder st = new StringBuilder();
        st.append(courseNumber + " " + courseName +"\n");
        
        st.append("Instructor: " + instructor.getInfo() + "\n");
        
        st.append("Students: \n");
        for(Student s : students)
            st.append(s + "\n");
        
        return st.toString();
    }// end displayclass list
    
    @Override
    public String toString(){
        return courseNumber + " " + courseName;
    }//end tostring

}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
