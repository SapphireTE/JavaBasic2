public class Clock{
    private int hr;
    private int min;
    private int sec;

    public Clock(){
        setTime(0, 0, 0);
    }

    public Clock(int hours, int minutes, int seconds){
        setTime(hours, minutes, seconds);
    }

    public void setTime(int hours, int minutes, int seconds){
        if (0 <= hours && hours < 24)
            hr = hours;
        else
            hr = 0;

        if (0 <= minutes && minutes < 60)
            min = minutes;
        else
            min = 0;

        if (0 <= seconds && seconds < 60)
            sec = seconds;
        else
            sec = 0;
    }

    public void setHours(int hours){
        if (0 <= hours && hours < 24)
            hr = hours;
        else
            hr = 0;
    }

    public void setMinutes(int minutes){
        if (0 <= minutes && minutes < 60)
            min = minutes;
        else
            min = 0;
    }

    public void setSeconds(int seconds){
        if (0 <= seconds && seconds < 60)
            sec = seconds;
        else
            sec = 0;
    }

    public int getHours(){
        return hr;
    }

    public int getMinutes(){
        return min;
    }

    public int getSeconds(){
        return sec;
    }

    public void incrementSeconds(){
        sec++;

        if (sec > 59){
            sec = 0;
            incrementMinutes();
        }
    }

    public void decrementSeconds(){
        sec--;

        if (sec < 0){
            sec = 59;
            decrementMinutes();
        }
    }

    public void decrementMinutes(){
        min--;

        if (min < 0){
            min = 59;
            decrementHours();
        }
    }

    public void incrementMinutes(){
        min++;

        if (min > 59){
            min = 0;
            incrementHours();
        }
    }

    public void incrementHours(){
        hr++;

        if (hr > 23)
            hr = 0;
    }

    public void decrementHours(){
        hr--;

        if (hr < 0)
            hr = 23;
    }

    public boolean equals(Clock otherClock){
        return (hr == otherClock.hr && min == otherClock.min && sec == otherClock.sec);
    }

    public String toString(){
        String string = "";

        if (hr < 10)
            string = "0";
        string = string + hr + ":";

        if (min < 10)
            string = string + "0" ;
        string = string + min + ":";

        if (sec < 10)
            string = string + "0";
        string = string + sec;

        return string;
    }

    public void makeCopy(Clock otherClock){
        hr = otherClock.hr;
        min = otherClock.min;
        sec = otherClock.sec;
    }

    public Clock getCopy(){
        Clock clock = new Clock(hr, min, sec);
        return clock;
    }
}


