package Lab8;

import java.text.NumberFormat;

public class Admin extends Staff
{
    private double overTime;
    private double overRate;
    private double overTimePay;
    
    public Admin(int idNo, String lastName, String firstName, double salary, double overRate)
    {
        super(idNo, lastName, firstName, salary);
        this.overRate = overRate;
        overTimePay = 0;
    }
    
    public void setOverTime(double overTime)
    {
        this.overTime = overTime;
    }
    
    public double pay()
    {
        return overTimePay += overTime * overRate;
    }
    
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        return super.toString()
               + "\nOvertime: " + fmt.format(pay())
               + "\nTotal: " + fmt.format(salary + overTimePay);
    }
}