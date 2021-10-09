package ss4_class_object.bai_tap;

//import java.util.Timer;

import static java.lang.System.currentTimeMillis;

public class StopWatch {

    private Long startTime, endTime;
    private Long elapsedTime;

    public StopWatch() {
        this.startTime = currentTimeMillis();
    }

    public Long getStartTime() {

        return this.startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getElapsedTime() {
        return this.elapsedTime;
    }

    public void setElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

}


