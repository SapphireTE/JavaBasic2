public class ExtClock extends Clock{

    private int hr; //store hours
    private int min; //store minutes
    private int sec; //store seconds
    private int timeZone;

    public ExtClock(){
        setTime(0, 0, 0);
        setTimeZone(0);
    }

    public ExtClock(int hours, int minutes, int seconds, int zone){
        setTime(hours+zone, minutes, seconds);
    }

    public void setTimeZone(int hours){
        hr += hours;
    }
}