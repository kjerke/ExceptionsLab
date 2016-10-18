package lab0;

/**
 * In this challenge you need to address the probability that at some
 * point the arguments to method parameters may not be valid. 
 * <p>
 * For example, String arguments may be null or empty; other objects may be 
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all 
 * arguments are valid. The only exception is when any argument is acceptable 
 * based on requirements. Fix the code below using if logic to validate
 * method arguments and throw IllegalArgumentException or a custom
 * exception if the validation fails.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    
    // Validation Rules:
    // - min cannot be less than 0
    // - max cannot be more than 120
    public void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if(daysVacation < 0 || daysVacation > 120) {
            throw new IllegalArgumentException("Sorry vacation days must be between 0 and 120  inclusive");
        }
       
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }
    // Validation Rules:
    // - No null values allowed
    // - No empty strings allowed
    // - No special symbols 
    // - Length must be between 1 and 50
    
    public final void setFirstName(String firstName) throws IllegalArgumentException {
       if (firstName == null || firstName.isEmpty()) {
           throw new IllegalArgumentException("First name can not be null");
       }
        this.firstName = firstName;
    } 

    public String getLastName() {
        return lastName;
    }
    
    // Validation Rules:
    // - No null values allowed
    // - No empty strings allowed
    // - No special symbols 
    // - Length must be between 1 and 50
    public void setLastName(String lastName) {
     if(lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name can not be null");
        }    
        
        
        this.lastName = lastName;
    }

    public final String getSsn(String ssn) {
     
        return ssn;
    }

    // Validation Rules:
    // - No letters allowed
    // - No special characters
    // - Must be 9 digits long 
    
    public void setSsn(String ssn) {
             if (ssn == null) {
            throw new IllegalArgumentException();
        }
        if (ssn.length() == 9 || ssn.length() == 11) {
            String[] parts = ssn.split("-");
            if (parts.length == 0) {
                char[] chars = ssn.toCharArray();
            } else if (parts.length == 3) {
                for (String s : parts) {
                    char[] c = s.toCharArray();
                }
            }
            
        }else {
            throw new IllegalArgumentException();
        }
        this.ssn = ssn;
    }
    
    
    
}
