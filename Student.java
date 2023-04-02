import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/** 
 * ACS-1904 Assignment 3
 * @Sveinson
 * student number
*/

public class Student extends Person implements Comparable<Student>{
    // class constants and variables
    
    // instance variables
    private int year;
    private double gpa;
    
    // association
    ArrayList<Course> courses;
    
    // constructors
    public Student(){
        super();
        year = 0;
        gpa = 0.0;
        
        courses = new ArrayList<>();
    }// end no-arg constructor
    
    public Student(String ln, String fn, int year, double gpa){
        super(ln, fn);
        this.year = year;
        this.gpa = gpa;
        
        courses = new ArrayList<>();
    }// end constructor
    
    // getters
    public int getYear(){
        return year;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public ArrayList<Course> getCourses(){
        return courses;
    }//end getCourses
    
    // setters
    public void setYear(int y){
        year = y;
    }
    
    public void setGPA(double g){
        gpa = g;
    }
    
    public void setCourses(ArrayList<Course> c){
        courses = c;
    }//end setCourses
    
    // abstract method implementation if any
    /*****************************************
    * Description: compare this student's name to the other student's
    *              (os) name by calling the getName() method from 
    *              the Person class. Uses the compareTo() method from the 
    *              String class
    * 
    * @param        Object os: the other student object, i.e. the student
    *                           to compare to
    * 
    * @return       int: positive, negative or 0
    * ****************************************/
    public int compareTo(Student os){
        // System.out.println(this.getName());
        // System.out.println(os.getName());
        // System.out.println(this.getName().compareTo(os.getName()));
        
        return this.getName().compareTo(os.getName());
    }// end compareTo
    
    // other methods
    public void addCourse(Course c){
        courses.add(c);
        // add student to course
        c.addStudent(this);
    }//end add course
    
    @Override
    public String getInfo(){
        String st = toString() + ": year " + getYear() + ", GPA: " + getGPA();
        return st;
    }
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
