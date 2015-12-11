package Lab8;

import java.text.NumberFormat;

public class Professor extends Lecturer
{
    private int paper;
    private double paperRate;
    private double allowance;
    
    public Professor(int idNo, String lastName, String firstName, double salary, double paperRate)
    {
        super(idNo, lastName, firstName, salary);
        this.paperRate = paperRate;
        allowance = 0;
    }
    
    public void setPaper(int paper)
    {
        this.paper = paper;        
    }
    
    public double pay()
    {
        return allowance += paper*paperRate;
    }
    
    public String toString()
    {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        return super.toString()
               +"\nAllowance: " + fmt.format(pay())
               +"\nTotal: " + fmt.format(salary + allowance);
    }
}