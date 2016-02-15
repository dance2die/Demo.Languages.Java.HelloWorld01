package Extend;

/**
 * Created by dance2die on 2/13/2016.
 */
public class Person implements Cloneable {
    protected String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
