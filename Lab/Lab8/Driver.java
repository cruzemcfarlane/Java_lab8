package Lab8;

public class Driver
{
    public static void main(String[] args)
    {
        Admin admin1 = new Admin(1000, "Brown", "John", 100000, 20);
        Lecturer lecturer = new Lecturer(7000, "Smith", "James", 125000);
        Professor prof = new Professor(3000, "Bean", "Jim", 300000, 50);
        Admin admin2 = new Admin(2000, "Jones", "Martha", 75000, 15);
        
        Staff[] staff = {admin1, lecturer, prof, admin2};
        
        ((Admin) staff[0]).setOverTime(20); 
        ((Professor) staff[2]).setPaper(12);
                             
        for(Staff count: staff)
        {
            System.out.println(count);
            System.out.println();
        }
    }    
}