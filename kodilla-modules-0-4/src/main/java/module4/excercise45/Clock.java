package module4.excercise45;

import java.time.LocalTime;

public class Clock {
    private String clockName;
    private LocalTime clockTime;

    public Clock (String clockName, int clockHour, int clockMinute, int clockSecond) {
        this.clockName = clockName;
        this.clockTime = LocalTime.of(clockHour, clockMinute, clockSecond);
    }

    public String getClockName() {
        return clockName;
    }

    public LocalTime getClockTime() {
        return clockTime;
    }

    public LocalTime addMinute() {
        clockTime = clockTime.plusMinutes(1);
        return clockTime;
    }
}
