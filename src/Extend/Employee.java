package Extend;

/**
 * Created by dance2die on 2/13/2016.
 */
public class Employee extends Person {
    private int id;

    public Employee(String firstName, String lastName, int id) {
        super(firstName, lastName);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
