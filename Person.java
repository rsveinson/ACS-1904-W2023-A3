import java.io.Serializable;

/** 
 * ACS-1904 Assignment 3
 * @Sveinson
 * student number
*/

public abstract class Person implements GymMember, Serializable{
    protected String firstName;
    protected String lastName;
    
    protected int memberNumber;     // for the unique membership number in the fitness club
    
    // constructors
    public Person(){
        lastName = "unknown";
        firstName = "unknown";
        memberNumber = 0;
    }// end no-arg constructo
    
    public Person(String fn, String ln){
        lastName = ln;
        firstName = fn;
        memberNumber = 0;
    }// end constructor
    
    // abstract method must be implemented in derived classes
    // not part of the requirements but probably should have been
    public abstract String getInfo();
    
    // getters
    public String getFirstName(){
        return firstName;
    }// end get first name
    
    public String getLastName(){
        return lastName;
    }// end get last name
    
    // interface getter
    public int getMemberNumber(){
        return memberNumber;
    }//end get member number
    
    // setters
    public void setFirstName(String fn){
        firstName = fn;
    }// end set first name
    
    public void setLastName(String ln){
        lastName = ln;
    }// end set last name
    
    // interface setter
    public void setMemberNumber(int n){
        memberNumber = n;
    }// end set member number
    
    // other
    @Override
    public String toString(){
        String st = getLastName() + ", " + getFirstName();
        /* or
         * String st = lastName + ", " + firstName;
         */
        return st;
    }// end toString
    
    /*****************************************
    * Description: get a person name for sorting using comparable
    * 
    * @return      String name, person name in the form lastName firstName
    * ****************************************/    
    public String getName(){
        String st = getLastName() + getFirstName();
        return st;
    }// end getName


}

    /*****************************************
    * Description: brief description of the methods purpose
    * 
    * @param        each parameter of the method should be listed with an @param
    * @param        parametername description of parameter
    * 
    * @return       any return value will be noted here
    * ****************************************/
