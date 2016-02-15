package NestedTypes;

import static java.lang.System.out;

/**
 * Created by dance2die on 2/15/2016.
 */
public class EnclosingClass {
    private static int i;

    private static void m1(){
        out.println("m1:" + i);
    }

    private static void m2(){
        out.println("m2:" + i);
        EnclosedClass.accessEnclosingClass();
    }

    static class EnclosedClass{
        public static void accessEnclosingClass() {
            i = 1;
            m1();
        }

        void accessClosingClass2(){
            m2();
        }
    }
}
