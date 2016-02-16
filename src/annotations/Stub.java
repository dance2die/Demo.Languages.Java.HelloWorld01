package annotations;

/**
 * Created by dance2die on 2/16/2016.
 */
public @interface Stub {
    int id();
    String dueDate();
    String developer() default "unassigned";
}
