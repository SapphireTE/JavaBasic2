public class Day {
    final static int SUN = 0;
    final static int MON = 1;
    final static int TUE = 2;
    final static int WED = 3;
    final static int THU = 4;
    final static int FRI = 5;
    final static int SAT = 6;

    public int ourDay;

    public Day(int ourDay)
    {this.ourDay = ourDay;}

    public void setDay(int ourDay)
    {this.ourDay = ourDay;}

    public int getDay()
    {return ourDay;}

    public int followingDay()
    {
        if (ourDay == SAT)
        {return SUN;}

        else {ourDay = (ourDay + 1) % 7;}
        return ourDay;
    }

    public int previousDay()
    {
        if (ourDay == 0)
        {return SAT;}

        else {ourDay = (ourDay - 1) % 7;}
        return ourDay;
    }

    public int futureDay(int ourDays)
    {return ((ourDay + ourDays) -1 ) % 7;}

    public String toString()
    {
        switch (this.ourDay)
        {
            case SUN:
                return "Sunday";
            case MON:
                return "Monday";
            case TUE:
                return "Tuesday";
            case WED:
                return "Wednesday";
            case THU:
                return "Thursday";
            case FRI:
                return "Friday";
            case SAT:
                return "Saturday";
        }
        return "";
    }

    public static void main(String[] args)
    {
        Day outDay = new Day(SUN);
        System.out.print("The current day: " + outDay);
        System.out.println();
        outDay.setDay(outDay.previousDay());
        System.out.print("The previous day: " + outDay);
        System.out.println();
        outDay.setDay(outDay.followingDay());
        outDay.setDay(outDay.followingDay());
        System.out.print("The next day: " + outDay);
        System.out.println();
        outDay.setDay(outDay.futureDay(8));
        System.out.print("8 days later: " + outDay);
        System.out.println();
    }
}
