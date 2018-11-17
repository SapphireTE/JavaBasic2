public class TestClock{

    public static void main(String[] args){
        Clock myClock = new Clock(8, 59, 59);
        System.out.println( myClock.toString());

        ExtClock myExtClock = new ExtClock(8, 59, 59, 1);
        System.out.println( myExtClock.toString());
    }
}

