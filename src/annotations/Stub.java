package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Created by dance2die on 2/16/2016.
 */
@Target(value = {ElementType.CONSTRUCTOR, ElementType.METHOD})
public @interface Stub {
    int id();
    String dueDate();
    String developer() default "unassigned";
}
