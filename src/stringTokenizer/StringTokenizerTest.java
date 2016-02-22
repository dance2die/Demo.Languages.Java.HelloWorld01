package stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args){
        testMain();
    }

    private static void testMain() {
        StringTokenizer tokenizer = new StringTokenizer("This is only a test");
        while(tokenizer.hasMoreElements()){
            System.out.println("Token: " + tokenizer.nextToken());
        }
    }
}
