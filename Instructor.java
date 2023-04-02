import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/** 
 * ACS-1904 Assignment 3
 * @Sveinson
 * student number
 */

public class Instructor extends Person{
    // class constants and variables

    // instance variables
    private String degree;

    //Association
    private ArrayList<Course> courses;

    // constructors
    public Instructor(){
        degree = "Unknown";
        courses = new ArrayList<>();
    }// end no-arg constructor

    public Instructor(String ln, String fn, String d){
        super(ln, fn);
        degree = d;
        courses = new ArrayList<>();
    }// end constructor

    // getters
    public String getDegree(){
    return degree;
    }// end getDegree

    public ArrayList<Course> getCourses(){
    return courses;
    }// end getCourses

    // setters
    public void setDegree(String d){
    degree = d;
    }// end setDegree

    public void setCourses(ArrayList<Course> c){
        courses = c;
    }// end setCourses

    // abstract method implementation if any

    // other methods
    public void addCourse(Course c){
        courses.add(c);
    }//end addCourse

    /* use a getInfo method to get the instuctor information
     * according to the sample output
     */
    @Override
    public String getInfo(){
        String st = firstName + " " + lastName + ", " + degree;
        return st;
    }// end toString

    /* Utility method to display the list of courses
     * for either a student of instructor
     */
    public String displayCourses(){
        StringBuilder st = new StringBuilder();
        for(Course c : courses)
            st.append(c + "\n");
        return st.toString();
    }// end displaycourses
}

/*****************************************
 * Description: brief description of the methods purpose
 * 
 * @param        each parameter of the method should be listed with an @param
 * @param        parametername description of parameter
 * 
 * @return       any return value will be noted here
 * ****************************************/
