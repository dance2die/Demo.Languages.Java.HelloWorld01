package fieldAccessDemo;

import java.lang.reflect.Field;

import static java.lang.System.out;
import static java.lang.System.err;

/**
 * Created by dance2die on 2/20/2016.
 */
public class FieldAccessDemo {
    public static void main(String[] args){
        try{
            Class<?> clazz = Class.forName("fieldAccessDemo.X");
            X x = (X) clazz.newInstance();

            Field f = clazz.getField("i");
            out.println(f.getInt(x));
            f.setInt(x, 20);
            out.println(f.getInt(x));

            f = clazz.getField("PI");
            out.println(f.getDouble(null));
            f.setDouble(x, 20);
            out.println(f.getDouble(null));
        } catch (Exception ex){
            err.println(ex);
        }
    }
}
