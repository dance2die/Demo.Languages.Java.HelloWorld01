import static java.lang.System.out;

/**
 * Created by dance2die on 2/12/2016.
 */
public class StaticClass {
    static{
        out.println("1st Static");
    }
    static{
        out.println("2nd Static");
    }

    public StaticClass() {
        out.println("Within StaticClass ctor");
    }
}
