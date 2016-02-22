package timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by skim on 2/22/2016.
 */
public class TimerTestMain {
    public static void main(String[] args){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println(System.currentTimeMillis());
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, 0, 1000);
    }
}
