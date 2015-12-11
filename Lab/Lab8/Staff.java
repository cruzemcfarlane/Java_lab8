package Lab8;

import java.text.NumberFormat;

public class Staff
{
    protected int idNo;
    protected String lastName;
    protected String firstName;
    protected double salary;
    
    public Staff(int idNo, String lastName, String firstName, double salary)
    {
        this.idNo = idNo;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }
    
    public String getName()
    {
        return lastName + "," + " " + firstName;
    }
    
    public double pay()
    {
        return salary; 
    }
    
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        return "Staff Member: " + getName() + " " + idNo + 
               "\nBasic Pay: " + fmt.format(salary);
    }
}