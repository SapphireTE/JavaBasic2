package main.Java;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(){
        setTime(0,0,0);
    }

    public Clock (int hr,int min, int sec){
        this.hour=hr;
        this.minute=min;
        this.second=sec;
        setTime(hr,min,sec);
    }

    public void setTime(int hr,int min,int sec){
        if (hr>=0&&hr<24)
            hr=hr;
        else
            hr=0;
        if (min>=0&&min<60)
            min=min;
        else
            min=0;
        if (sec>=0&&sec<60)
            sec=sec;
        else
            sec=0;
    }

    public void setHours(int hr){
        if (hr>=0&&hr<24)
            hr=hr;
        else
            hr=0;
    }

    public void setMinutes(int min){
        if (min>=0&&min<60)
            min=min;
        else
            min=0;
    }

    public void setSeconds(int sec){
        if (sec>=0&&sec<60)
            sec=sec;
        else
            sec=0;
    }

    public int getHours(){
        return hour;
    }

    public int getMinutes(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void incrementSeconds(){
        second++;
        if (second>59){
            second=0;
            incrementMinutes();
        }
    }

    public void incrementMinutes(){
        minute++;
        if (minute>59){
            minute=0;
            incrementHours();
        }
    }

    public void incrementHours(){
        hour++;
        if (hour>23){
            hour=0;
        }
    }

    public boolean equals(Clock otherClock){
        return (hour==otherClock.hour&&minute==otherClock.minute&second==otherClock.second);
    }

    public String toString(){
        String string="";
        if(hour<10)
            string="0";
        string=string+hour+":";

        if(minute<10)
            string="0";
        string=string+minute+":";

        if(second<10)
            string="0";
        string=string+second+":";

        return string;
    }

    public void makeCopy(Clock otherClock){
        hour=otherClock.hour;
        minute=otherClock.minute;
        second=otherClock.second;
    }

    public Clock getCopy(){
        Clock clock =new Clock(hour,minute,second);
        return clock;
    }

}
