import edu.csbsju.cs.*;
   // the Employee class is defined in that package

import static java.lang.System.*;

public class Driver
{  
   public static void main(String[] args)
   {  
      // because of the import statement, we don't have to use
      // edu.csbsju.cs.Employee here
      Employee harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

      // raise salary by 5%
      harry.raiseSalary(10);

      // print out information about harry
      // use java.lang.System.out here
<<<<<<< HEAD
      out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
	
=======
      //out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
	out.println(harry);
>>>>>>> 9b9c45f34af6aaf4b8ed64d48fa1b4405a011aac
   }
}

