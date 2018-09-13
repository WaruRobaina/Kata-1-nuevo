package kata1;

import java.time.LocalDate;
import java.time.Month;

public class Kata1 {
    public static void main(String[] args) {
        LocalDate date;
        date = LocalDate.of(1964, Month.SEPTEMBER, 24);
        
        Person person = new Person ("Blas",date);
        System.out.println(person.getName() + " tiene " + person.getAge() + " años");        
        
    }
    
}
