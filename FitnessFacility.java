import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.Serializable;

/** 
 * ACS-1904 Assignment 3
 * @Sveinson
 * student number
*/

public class FitnessFacility implements Serializable{
    // class constants and variables
    // the last number/or next available number used for 
    // providing gym members with a unique id number
    // requires a new field in Person for the id number
    private static int lastNumber = 1000;
    
    // instance variables
    private String name;
    private ArrayList<GymMember> memberList;
    
    // constructors
    public FitnessFacility(){
        memberList = new ArrayList();
        name = "unknown";
    }// end no-arg constructor
    
    public FitnessFacility(String n){
        memberList = new ArrayList();
        name = n;
    }// end constructor
    
    /* make sure all getters and setters
     * are present and named correctly so 
     * that the object will write to the .xml
     * file correctly.
     */
    // getters
    public String getName(){
        return name;
    }// end get name
    
    public ArrayList<GymMember> getMemberList(){
        return memberList;
    }
    
    // setters
    public void setName(String n){
        name = n;
    }
    
    public void setMemberList(ArrayList<GymMember> l){
        memberList = l;
    }
    
    
    // abstract method implementation if any
    
    // other methods
    public void addMember(GymMember g){
        memberList.add(g);
        g.setMemberNumber(nextNumber());
    }// end add member
    
    /*****************************************
    * Description: Automatically generate and assign a unique
    *               membership number to a new gym member
    * 
    * @return       int: unique member ship number
    * ****************************************/
    private int nextNumber(){
        return lastNumber++;
    }// end next number
    
    /*****************************************
    * Description: build a string to display the gym information
    *               includes the gym name and the list of gym members
    * 
    * @return       String gym info
    * ****************************************/
    public String displayGymInfo(){
        StringBuilder sb = new StringBuilder();
        
        // title and member column headings
        sb.append("Name: " + getName() + "\n");
        sb.append("Member# \t Name \n");
        
        /* the member number can be obtained with the GymMember method
         * getMemberNumber();
         * the first and last names are not accessible from a GymMember object
         * so I create a Person, assign the current GymMember to the Person
         * (Person "is a" GymMember) so that I can use the getFirstName() and 
         * getLastName() methods from Person.
         */
        for(GymMember g : memberList){
            Person p = (Person)g;
            sb.append(g.getMemberNumber() + "\t\t");
            sb.append(p.getFirstName());
            sb.append(" " + p.getLastName() + "\n");
        }// end for
        return sb.toString();
    }// end display ifo

}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
