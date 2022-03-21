package homework;

// Program 14 from week 7 homework

public class Person {

        String firstname, lastname;  // instance variable
        int age;                     // instance variable

public static void main(String[] args)
        {
        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
        }

public String getFirstName() {
    return firstname;
}  // instance method 1

public String getLastname() {
    return lastname;
} // instance method 2

public int getAge() {
    return age;
}  // instance method 3

public void setFirstName(String firstname) {
    this.firstname = firstname;
} // instance method 4

public void setLastName(String lastname) {
    this.lastname = lastname;
} // instance method 5

public void setAge(int age)  // instance method 6
        {
            if (age > 0 && age <= 100)
            {
                this.age = age;
            }else
            {
                this.age = 0;
            }
        }

public boolean isTeen()      // instance method 7
        {
            if (age > 12 && age < 20)
            {
                return true;
            }else
            {
                return false;
            }
        }
public String getFullName()    // instance method 8
        {
            if (firstname.isEmpty() && lastname.isEmpty())
            {
                return "";
            }
            else if (firstname.isEmpty())
            {
                return lastname;
            }
            else if (lastname.isEmpty())
            {
                return firstname;
            } else
            {
                return firstname + "" + lastname;
            }
        }
    }