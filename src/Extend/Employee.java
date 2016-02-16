package Extend;

import annotations.Stub;

/**
 * Created by dance2die on 2/13/2016.
 */
public class Employee extends Person {
    @Deprecated
    private int id;

    public Employee(String firstName, String lastName, int id) {
        super(firstName, lastName);
        this.id = id;
    }

    @Stub(id = 2, dueDate = "12/24/2016")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
