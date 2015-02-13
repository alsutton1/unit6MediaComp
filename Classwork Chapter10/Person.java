import java.util.ArrayList;

public class Person extends Comparable<Person>
{
    private String name;
    
    public Person(String name)
    {
        this.name = name;
    }
    
    public String toString()
    {
        return name;
    }
    
    public int compareTo(Person other)
    {
        String otherName = (Person) other;
        String myName = this.name;
        return myName.compareTo(othername);          
    }
    
    public static Person firstPerson(Person [] people)
    {
        Person first = people[0];
        for (int x = 0; x < people.length; x++)
        {
            if (people[x].compareTo(first) < 0)
            {
                first = people[x];
            }
        }
        
        return first;
    }
    
    public static void main(String[] args)
    {
        Person guy1 = new Person("Timmy");
        Person guy2 = new Person("Zach");
        
        ArrayList<Person> list = new ArrayList<Person>();
        
        list.add(guy2);
        list.add(guy1);
        
        String first = firstPerson(list).getName(); 
    }
}

    