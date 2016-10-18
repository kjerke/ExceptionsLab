package lab0;

import java.util.Date;

/**
 *
 * @author Instlogin
 */
public class Startup {
private String lastName;
private String firstName;
private Date hireDate;
private int vacationDays;
private String ssn;
private boolean b;

    public static void main(String[] args) {
        
        Startup start = new Startup();
        

        Employee emp = new Employee("Jim","Smith","3333333333",28);
        
        // Think about this code. It wouldn't work if lastName was null
        String fullNameInCaps = 
                emp.getFirstName().toUpperCase() 
                + " " + emp.getLastName().toUpperCase();
        
        
        try{
            emp.setDaysVacation(30);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println(emp.getDaysVacation());
        
    }
}
