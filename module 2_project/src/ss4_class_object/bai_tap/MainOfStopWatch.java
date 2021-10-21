package ss4_class_object.bai_tap;

import java.util.concurrent.TimeUnit;

public class MainOfStopWatch {
    public static StopWatch watch = new StopWatch();

    public static void main(String[] args) throws InterruptedException {
        watch.startWatch();
        TimeUnit.SECONDS.sleep(5);
        watch.endWatch();
        watch.setElapsedTime(watch.getEndTime() - watch.getStartTime());
        System.out.println("Thời gian thực hiện: " + watch.getElapsedTime() + "ms");
    }
}

